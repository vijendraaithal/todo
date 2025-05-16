package com.vj.qacart.todo.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {

    private static ConfigUtils configUtils;
    private Properties properties;

    private ConfigUtils() {
        properties = readProperties();
    }

    public static ConfigUtils getInstance() {
        if(configUtils == null) {
            configUtils = new ConfigUtils();
        }
        return configUtils;
    }

    private Properties readProperties() {
        FileInputStream fis;
        try {
            String env = System.getProperty("env", "PRODUCTION");
            switch(env.toUpperCase()) {
                case "PRODUCTION" -> fis = new FileInputStream("src/test/resources/env/production.properties");
                case "LOCAL" -> fis = new FileInputStream("src/test/resources/env/local.properties");
                default -> throw new Exception("Environment not supported");
            }
            properties = new Properties();
            properties.load(fis);
            System.out.println(properties.getProperty("URL"));
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
        return properties;
    }
    public Object getBaseUrl() {
        return properties.getProperty("URL");
    }
}