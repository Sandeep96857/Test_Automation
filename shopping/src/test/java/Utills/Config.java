package Utills;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static final Properties prop = new Properties();
    private static String key;

    static {
        try {
            FileInputStream input = new FileInputStream("D:\\Test_Automation\\shopping\\src\\test\\resources\\Configurations\\config.properties");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getProperty(String key) {
        return Config.getProperty(key);
    }

}


