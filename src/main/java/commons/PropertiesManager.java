package commons;

import com.google.gson.Gson;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;
import utililities.FileUtils;

import java.util.HashMap;
import java.util.Map;

public class PropertiesManager {


    public static String getEnvironmentSpecFromProperty(String propertyName) {
        EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
        return EnvironmentSpecificConfiguration.from(variables).getProperty(propertyName);
    }

    private static String getNameConfigProperties(String keyConfig) {
        return getEnvironmentSpecFromProperty(keyConfig);
    }

    public static HashMap<String, String> getDataConfigFromKeyConfig(String nameProperties, String keyConfig) {
        String nameConfigProperties = getNameConfigProperties(nameProperties);
        Map<String, String> configProperties = FileUtils.getDataPropertiesFile(nameConfigProperties);
        HashMap<String, String> configProps = new Gson().fromJson(configProperties.get(keyConfig), HashMap.class);
        return configProps;
    }


}
