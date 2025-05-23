package utililities;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileUtils {

    public static Map<String, String> getDataPropertiesFile(String nameConfig) {
        Properties prop = new Properties();
        Map<String, String> map = new HashMap<>();
        FileInputStream inputStream = null;
        try {
//            inputStream = new FileInputStream(pathProp);
            inputStream = new FileInputStream(PathUtilsCommon.ROOT_CONFIG_FOLDER + nameConfig);
            prop.load(inputStream);
            for (String key : prop.stringPropertyNames()) {
                String value = prop.getProperty(key);
                map.put(key, value);
            }
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();

            System.out.println("Some issue finding or loading file....!!! " + e.getMessage());
        }
        return map;
    }
}
