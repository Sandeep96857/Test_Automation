// package packages.Pageobjects;

// import java.util.concurrent.TimeUnit;

// import org.apache.commons.io.ThreadUtils;
// import org.junit.Test;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.interactions.Actions;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.WebDriverWait;

// public class filpkartest {


//     @Test
//     public void LoginTest() throws InterruptedException{
        
//     WebDriver driver= new ChromeDriver();
//     driver.get("https://www.flipkart.com/");
//     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//     driver.manage().window().maximize();
//     WebElement Elementhoverlogin=driver.findElement(By.xpath("//div[@class=\"H6-NpN _3N4_BX\"]"));
//     Actions actions = new Actions(driver);
//     actions.moveToElement(Elementhoverlogin).perform();
//     WebDriverWait wait = new WebDriverWait(driver, 10);
//     WebElement signupBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title=\"Sign Up\"]")));

//     // Thread.sleep(1000);
//     Signupbtn.click();

//     // driver.quit();
    

//    }
// }
