package packages.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest{

        public static void main(String[] args) {

            System.setProperty("Webdriver.chrome.driver","path/to/driver");

            // WebDriver driver=null;

            
            WebDriver driver =new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get("https://accounts.zoho.in/signin?servicename=ZohoCRM&signupurl=https://www.zoho.com/crm/signup.html&serviceurl=https%3A%2F%2Fcrm.zoho.in%2Fcrm%2FShowHomePage.do%3Fref_value%3Dbing%253Acrm%257Cbing%253Acrm%257Cbing%253Acrm%252Chttps%253A%252F%252Fwww.zoho.com%252Fcrm%252Flogin.html%252C%252CDesktop%252Chttps%253A%252F%252Fwww.zoho.com%252Fcrm%252Fsignup.html%253Fsource_from%253Dlogin");
            System.out.println("Naviagting to Zoho.com");


            WebElement Usernamefield=driver.findElement(By.id("login_id"));
            WebElement Paswordfield=driver.findElement(By.xpath("//*[@id=\"password\"]"));
            WebElement Signinbutton=driver.findElement(By.xpath("//*[@button=\"login\"]"));

            System.out.println("Entering credentials...");

            Usernamefield.sendKeys("amit");
            // Paswordfield.sendKeys("Agelix@1234");
            System.out.println("Clicking login button...");
            // Signinbutton.click();

            // if (driver != null) {
            //     System.out.println("Closing the browser.");
            //     driver.quit(); // Use quit() to close all windows and sessions
            // }
            
        }

       
}