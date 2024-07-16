package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties properties;
    private static final String CONFIG_FILE = "config/urls.properties";

    public ConfigReader() {
        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream(CONFIG_FILE);
            properties.load(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUrl(String key) {
        return properties.getProperty(key);
    }
}
