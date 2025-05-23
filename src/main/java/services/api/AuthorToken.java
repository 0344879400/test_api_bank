package services.api;

import commons.PropertiesManager;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import utililities.Constants;
import utililities.StringUtils;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class AuthorToken {
    public static String getAuthorToken(String keyToken) {
        HashMap<String, String> configProps = PropertiesManager.getDataConfigFromKeyConfig(Constants.CONFIG_TOKEN_PROPERTIES, keyToken);
        String tokenUrl = "";
        if (!StringUtils.isNullOrEmpty(configProps.get("host"))) {
            tokenUrl = configProps.get("host") + ":" + configProps.get("port") + configProps.get("uri");
        } else {
            tokenUrl = configProps.get("uri");
        }
        String username = configProps.get("user");
        String password = configProps.get("password");

        RestAssured.baseURI = tokenUrl;
        RestAssured.defaultParser = Parser.JSON;
        Serenity.recordReportData().withTitle("URL Token").andContents(tokenUrl);
        Serenity.recordReportData().withTitle("USER Token").andContents(username);
        Serenity.recordReportData().withTitle("PASS Token").andContents(password);
        Response response = given()
                .contentType("application/x-www-form-urlencoded")
                .auth().preemptive().basic(username, password)
                .formParam("username", username)
                .formParam("password", password)
                .formParam("client_id", "bidv-client")
                .formParam("grant_type", "password")
                .when()
                .post()
                .then()
                .extract()
                .response();
        try {
            JsonPath responseJson = response.jsonPath();
            System.out.println("URL Token:" + tokenUrl + "\nUserName: " + username + "\nPassword:" + password
                    + "\nAccess_token: " + responseJson.getString("access_token").toString());
            Serenity.recordReportData().withTitle("access_token").andContents(responseJson.getString("access_token").toString());
            return responseJson.getString("access_token");
        } catch (NullPointerException e) {
            return null;
        }
    }

}
