package utililities;


import org.json.JSONObject;

import java.util.Collection;
import java.util.Map;

public class HashMapExtend<K, V> extends java.util.HashMap<K, V> {
    public HashMapExtend(int initialCapacity, float loadFactor) {
        super(initialCapacity,loadFactor);
    }

    public HashMapExtend(int initialCapacity){
        super(initialCapacity);
    }
    public HashMapExtend() {
        super();
    }
    //    @NotNull
    @Override
    public Collection<V> values() {
        return super.values();
    }

    public String getString(K key) {
        return super.get(key) == null ? null: super.get(key).toString();
    }
    public int getInt(K key) {
        return Integer.parseInt(super.get(key).toString());
    }
    public JSONObject toJson() {
        return new JSONObject(this);
    }
    public static HashMapExtend<String, Object> formatRequestBody(HashMapExtend<String, Object> requestJsonObject) {
        HashMapExtend<String, Object> requestJsonObjectAfter = new HashMapExtend<>();
        for (Map.Entry<String, Object> entry : requestJsonObject.entrySet()) {
            requestJsonObjectAfter.put(entry.getKey(), entry.getValue());
            if (entry.getValue() == null || entry.getValue().equals("")) {
                continue;
            }
            if (entry.getValue().toString().contains("${")) {
                requestJsonObjectAfter.remove(entry.getKey());
            } else if(entry.getValue().toString().equals(Constants.ParamsBodyValue.REMOVE.getValue())) {
                requestJsonObjectAfter.remove(entry.getKey());
            }else if(entry.getValue().toString().equals(Constants.ParamsBodyValue.BLANK.getValue())) {
                requestJsonObjectAfter.put(entry.getKey(), "");
            } else if(entry.getValue().toString().equals(Constants.ParamsBodyValue.NULL.getValue())) {
                requestJsonObjectAfter.put(entry.getKey(), null);
            }
        }
        return requestJsonObjectAfter;
    }

}

