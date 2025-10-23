package packages.Pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
// import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions; 
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;
    String url = getConfigValue("url");
    private By usernameField = By.xpath("//*[@id=\"userId\"]");
    private By passwordField = By.xpath("//*[@id=\"password\"]");
    private By SigninButton = By.xpath("//button[@type='submit']");
    private By ToastMessage  = By.xpath("/html/body/div/div/div/div");
    private By SignoutButton =By.xpath("//button[normalize-space()='Signout']");
    private By Userprofile_menu_icon =By.xpath("//img[@alt='Hobert']");
    private By Service_provider2 =By.xpath("//div/section/div[2]/div/span");
    private By Home_page_Provderinfo =By.xpath("//span[@class='rounded-pill p-2']");
    // private By Service_provider3 =By.xpath("//div/section/div[3]/div/span");
    // private By ToastMessage  = By.id("toast-container");
    
        /**
         * @param driver
         */
        public LoginPage(WebDriver driver) {
             if (driver == null) {
                throw new IllegalArgumentException("WebDriver cannot be null");
            }
            this.driver = driver;
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(140));
           
    }
   
    private String getConfigValue(String url) {
		return url;
	}

	public void enterUsername(String username) {
        if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized");
        }
        WebElement usernameElement = driver.findElement(usernameField);
        usernameElement.sendKeys(username);
        // triggerAngularChangeDetection(); 
    }
    
    public void enterPassword(String password) {
        if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized");
        }
        WebElement passwordElement = driver.findElement(passwordField);
        passwordElement.sendKeys(password);
        // triggerAngularChangeDetection(); 
    }

    public void Clear_enterPassword(String password) {
        if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized");
        }
        WebElement passwordElement = driver.findElement(passwordField);
        passwordElement.clear();
        // triggerAngularChangeDetection(); 
    }
    public void Clear_enterUsername(String password) {
        if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized");
        }
        WebElement usernameElement = driver.findElement(usernameField);
        usernameElement.clear();
        // triggerAngularChangeDetection(); 
    }

    public void clickSigninButton() throws InterruptedException {
        WebElement SigninButtonElement = driver.findElement(SigninButton);
        SigninButtonElement.click();
    }

    public boolean VisibilityofSigninButton() throws InterruptedException {
        WebElement SigninButtonElement = driver.findElement(SigninButton);
        return SigninButtonElement.isEnabled();
    }

    public void clickSignoutButton() throws InterruptedException {
        WebElement SignoutButtonElement = driver.findElement(SignoutButton);
        SignoutButtonElement.click();
    }
        public void profile_menu_icon() throws InterruptedException {
            WebElement profile_menu_iconElement = driver.findElement(Userprofile_menu_icon);
            profile_menu_iconElement.click();
    }
    
    public String ToastMessage() throws InterruptedException {
        WebElement ToastmsgElement = driver.findElement(ToastMessage);
        return ToastmsgElement.getText();
        
    }

    public void teardown() {
        driver.close();
    }

     public void Clickprovider() throws InterruptedException {
     WebElement SP_Element = driver.findElement(Service_provider2);
     SP_Element.click();

  }
  
    public String homepageproviderinfo() throws InterruptedException{

    WebElement Home_Page_provder_info=driver.findElement(Home_page_Provderinfo);
    return Home_Page_provder_info.getText();

  }
  public void waitForSignInButtonToBeVisible() { 
    wait.until(ExpectedConditions.visibilityOfElementLocated(SigninButton)); 
}

//   private void triggerAngularChangeDetection() {
//     JavascriptExecutor js = (JavascriptExecutor) driver;
//     js.executeScript("var scope = angular.element(arguments[0]).scope(); scope.$apply();", 
//    driver.findElement(By.tagName("body"))); 
//    }

//    public void manuallyTriggerChangeDetection() {
//      triggerAngularChangeDetection(); 
//     }
public void refreshPage() { 
    driver.navigate().refresh(); 
}

}