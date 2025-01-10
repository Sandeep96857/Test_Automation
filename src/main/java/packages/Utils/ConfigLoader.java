package packages.Utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
    private static Properties prop = new Properties();

  static {
      try {
          FileInputStream input = new FileInputStream("C:\\Users\\SandeepKumarDwivedi\\OneDrive - Agelix Consulting\\eclipse-workspace\\Service Maestro Customer Portal\\src\\main\\java\\packages\\configuration\\config.properties");
          prop.load(input);
      } catch (IOException e) {
          e.printStackTrace();
      }
  }

  public String getProperty(String key) {
      return prop.getProperty(key);
  }

}


