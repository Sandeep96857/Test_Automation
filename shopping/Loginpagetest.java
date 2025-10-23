//import java.util.concurrent.TimeUnit;
//
//public class LoginTest{
//
//        public static void main(String[] args) {
//
//            System.setProperty("Webdriver.chrome.driver","path/to/driver");
//
//            WebDriver driver=null;
//
//
//            WebDriver driver =new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            driver.get("URL");
//            System.out.println("Naviagting to Google.com);
//
//
//                    WebElement Usernamefield=driver.findelement(byid("id"));
//            WebElement Paswordfield=driver.findelement(byid("id"));
//            WebElement Signinbutton=driver.findelement(byid("id"));
//
//            System.out.println("Entering credentials...");
//
//            Usernamefield.sendkeys("amit");
//            Paswordfield.sendkeys("Agelix@1234");
//            System.out.println("Clicking login button...");
//            loginButton.click();
//
//            if (driver != null) {
//                System.out.println("Closing the browser.");
//                driver.quit(); // Use quit() to close all windows and sessions
//            }
//
//        }
//}