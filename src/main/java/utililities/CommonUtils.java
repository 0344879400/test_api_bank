package utililities;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;
import org.apache.commons.io.file.PathUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class CommonUtils {



    public static String readDataFromFilePath(String nameJson){
        String exampleRequest = "";
        File file = new File(PathUtilsCommon.PATH_FILE_JSON_FOLDER_SYSTEMTEST + nameJson);
        try{
            exampleRequest = org.apache.commons.io.FileUtils.readFileToString(file, StandardCharsets.UTF_8);
        }catch (IOException ignored){
        }return exampleRequest;
    }

    public static String modifyJson(String jsonBody, String[] jsonPaths, String... values) {
        Configuration configuration = Configuration.builder().options(Option.SUPPRESS_EXCEPTIONS).build();
        DocumentContext parsed = JsonPath.using(configuration).parse(jsonBody);
        ObjectMapper mapper = new ObjectMapper();
        for (int i = 0; i < jsonPaths.length; i++) {
            if (!StringUtils.isNullOrEmpty(jsonPaths[i])) {
                switch (values[i]) {
                    case "{DELETE}":
                        parsed.delete(jsonPaths[i]);
                        break;
                    case "null":
                        parsed.set(jsonPaths[i], null);
                        break;
                    case "\"\"":
                        parsed.set(jsonPaths[i], "");
                        break;
                    case "true":
                    case "false":
                        parsed.set(jsonPaths[i], Boolean.parseBoolean(values[i]));
                        break;
                    default:
                        // Check if the value is an array
                        if (values[i].startsWith("[") && values[i].endsWith("]")) {
                            // Convert the string to a list and set it in the JSON
                            List arrayValue = null;
                            try {
                                arrayValue = mapper.readValue(values[i], List.class);
                            } catch (JsonProcessingException e) {
                                e.printStackTrace();
                            }
                            parsed.set(jsonPaths[i], arrayValue);
                        } else {
                            parsed.set(jsonPaths[i], values[i]);
                        }
                }
            }
        }
        return parsed.jsonString();
    }

    public static HashMapExtend<String, Object> convertStringToMap(String args){
        ObjectMapper mapper = new ObjectMapper();
        HashMapExtend<String, Object> map;
        try{
            map = mapper.readValue(args, new TypeReference<>() {
            });
        }catch (JsonProcessingException e){
            throw new RuntimeException(e);
        }return map;
    }


}
