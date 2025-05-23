package services.api;

import commons.PropertiesManager;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import utililities.HashMapExtend;
import utililities.JsonUtils;
import utililities.LoggerUtils;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestAssuredService {


    public static JsonPath callApiPost(String url, HashMapExtend<String, Object> mapBody, Map<String, String> mapHeader) {
        RestAssured.baseURI = url;
        LoggerUtils.endpoint(url);
        Serenity.recordReportData().withTitle("URL").andContents(url);
//        JSONObject mapBodyToJson = mapBody.toJson();
        String beautyRequest = JsonUtils.beautyObjectToJSon(mapBody);
        Serenity.recordReportData().withTitle("Request Body").andContents(beautyRequest);
        LoggerUtils.body(beautyRequest);
        Response response = given()
                .headers(mapHeader)
                .body(mapBody)
                .post()
                .then()
                .extract()
                .response();
        saveResponseToSession(response);
        try {
            JsonPath jsPath = response.jsonPath();
            LoggerUtils.response(jsPath);
            Serenity.recordReportData().withTitle("Response Data").andContents(jsPath.prettify());
            return jsPath;
        } catch (NullPointerException e) {
            return null;
        }

    }

    public static JsonPath callAPIPost(String nameProperties, String keyConfig, HashMapExtend<String, Object> mapBody, Map<String, String> mapHeader) {
        HashMap<String, String> configService = PropertiesManager.getDataConfigFromKeyConfig(nameProperties, keyConfig);
        String url = configService.get("uri");
        return callApiPost(url, mapBody, mapHeader);

    }

    private static void saveResponseToSession(Response response) {
        Serenity.setSessionVariable("rest").to(response);
    }

}
