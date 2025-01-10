package packages.base;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import packages.Utils.ConfigLoader;

public class BaseTest {
    protected WebDriver driver;
    protected ConfigLoader configLoader;
    
    public BaseTest() {
        configLoader = new ConfigLoader();
    }

    protected String getConfigValue(String key) {
        return configLoader.getProperty(key);
    }
    public void setupDriver() throws InterruptedException {
             WebDriverManager.chromedriver().setup();

    }

     public void TearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}

