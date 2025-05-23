package services.api;

import java.util.HashMap;
import java.util.Map;

public class HeaderRequest {

    String contentType;
    String accept;
    String authorization;
    String  forwardedFor;
    String channel;
    String acceptLanguage;
    String clientID;
    String version;
    String encrypted;
    String os;
    String osVersion;
    String deviceModel;
    public HeaderRequest() {
        this.contentType = "Content-Type";
        this.accept = "Accept";
        this.authorization = "Authorization";
        this.forwardedFor = "X-Forwarded-For";
        this.channel = "Channel";
        this.acceptLanguage = "Accept-Language";
        this.clientID = "I-Client-ID";
        this.version = "I-Version";
        this.encrypted = "I-Encrypted";
        this.os = "I-Os";
        this.osVersion = "I-Os-Version";
        this.deviceModel = "I-Device-Model";


    }

    public Map<String, String> headerMap() {
        Map<String, String> map = new HashMap<>();
        map.put(this.contentType, "application/json");
        return map;
    }
    public Map<String, String> headerMapAPI(String authorization) {
        Map<String, String> map = new HashMap<>();
        map.put(this.contentType, "application/json");
        map.put(this.contentType, "application/json");
        map.put(this.authorization, "Bearer " + authorization);
        return map;
    }

    public Map<String, String> headerMapTokenUlititesMobile() {
        Map<String, String> map = new HashMap<>();
        map.put(this.forwardedFor, "10.21.101.126");
        map.put(this.contentType, "application/json");
        map.put(this.channel, "IBANK2");
        map.put(this.acceptLanguage, "vi-vn");
        map.put(this.clientID, "APP");
        map.put(this.version, "1.0.0");
        map.put(this.encrypted, "false");
        map.put(this.os, "iOS");
        map.put(this.osVersion, "17.5");
        map.put(this.deviceModel, "iPhone 13");
        return map;
    }
}
