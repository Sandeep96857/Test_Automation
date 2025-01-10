package packages.Pageobjects;
import org.openqa.selenium.WebDriver;

public class AssetsPage  {
    @SuppressWarnings("unused")
    private WebDriver driver;

    public AssetsPage(WebDriver driver) {
        if (driver == null) {
           throw new IllegalArgumentException("WebDriver cannot be null");
       }
       this.driver = driver;

      
 }
}