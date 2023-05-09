package io.turntabl;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {

    private static ConfigManager instance;
    private final Map<String,String> configMap = new HashMap<>() {{
        put("lt-password","98,65&12ll");
        put("username","gerald-addo");
        put("port","5757");
    }};

    private ConfigManager() {}

    public void update(String key, String value) {
        configMap.put(key,value);
    }

    public static ConfigManager getInstance() {
        if(instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public String get(String key) {
        return configMap.get(key);
    }
}
