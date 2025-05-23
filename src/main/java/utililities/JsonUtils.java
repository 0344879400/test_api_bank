package utililities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUtils {

    public static String beautyObjectToJSon(Object object) {
        Gson gson = new GsonBuilder().serializeNulls().setPrettyPrinting().create();
        String prettyJsonString = gson.toJson(object);
        return prettyJsonString;
    }
}
