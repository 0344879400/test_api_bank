package business.SystemTest.CIMBACKAPW.QuanLyPhi;

import io.restassured.path.json.JsonPath;
import net.serenitybdd.core.Serenity;
import services.api.AuthorToken;
import services.api.HeaderRequest;
import services.api.RestAssuredService;
import utililities.CimbackOnboard.PathUtils;
import utililities.CommonUtils;
import utililities.Constants;
import utililities.HashMapExtend;
import utililities.LoggerUtils;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class GoiPhiBusiness {
    public void rejectFeePackage(List<Map<String, String>> data) {
        String jsonBody = CommonUtils.readDataFromFilePath(PathUtils.REJECT_FEE_PACKAGE);
        for(Map<String, String> map : data){
            String key = map.get("Key");
            String value = map.get("value");
            if(Objects.equals(value, "{PACKAGE_FROM_SESSION}")){
                value = Serenity.sessionVariableCalled("dataValue").toString();
            }else if (Objects.equals(value, "{WRONG_PACKAGE_FROM_SESSION}")){
                value = Serenity.sessionVariableCalled("dataValue").toString() + "ABC11";
            }
            if (key != null){
                String[] jsonPaths = {"$." + key};
                jsonBody = CommonUtils.modifyJson(jsonBody, jsonPaths, value);
            }
            LoggerUtils.info("Key: " + key + " , value: " + value);
        }
        LoggerUtils.info("Body: " +jsonBody);
        HashMapExtend<String, Object> requestJsonObject = CommonUtils.convertStringToMap(jsonBody);
        String authorToken = AuthorToken.getAuthorToken(Constants.TOKEN_IBANK_BO);
        HeaderRequest headerRequest = new HeaderRequest();
        Map<String, String> headerMapRequest = headerRequest.headerMapAPI(authorToken);
        RestAssuredService.callAPIPost(Constants.CONFIG_SERVICE_PROPERTIES, Constants.API_REJECT_FEE_PACKAGE, requestJsonObject, headerMapRequest);

    }

    public void saveDraftAndSubmitFeePackage(List<Map<String, String>> data) {
        String jsonBody = CommonUtils.readDataFromFilePath(PathUtils.SAVE_DRAFT_FEE_PACKAGE);
        for (Map<String, String> map : data) {
            String key = map.get("Key");
            String value = map.get("Value");
            if (Objects.equals(value, "{PACKAGE_FROM_SESSION}")) {
                value = Serenity.sessionVariableCalled("dataValue").toString();
            }
            if (key != null) {
                String[] jsonPaths = {"$." + key};
                jsonBody = CommonUtils.modifyJson(jsonBody, jsonPaths, value);
            }
            LoggerUtils.info("Key: " + key + " ,value: " + value);
        }
        LoggerUtils.info("Body: " + jsonBody);
        HashMapExtend<String, Object> requestJsonObject = CommonUtils.convertStringToMap(jsonBody);
        String authorToken = AuthorToken.getAuthorToken(Constants.TOKEN_IBANK_BO);
        HeaderRequest headerRequest = new HeaderRequest();
        Map<String, String> headerMapRequest = headerRequest.headerMapAPI(authorToken);
        JsonPath createFeePK = RestAssuredService.callAPIPost(Constants.CONFIG_SERVICE_PROPERTIES, Constants.SAVE_DRAFT_FEE_PACKAGE, requestJsonObject, headerMapRequest);
        Serenity.setSessionVariable("dataValue").to(createFeePK.getString("data"));
    }


}
