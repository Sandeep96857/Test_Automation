package testcases;

import static org.junit.Assert.assertFalse;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
// import dev.failsafe.internal.util.Assert;
import packages.Pageobjects.LoginPage;
import packages.base.BaseTest;

public class AssetsPageTest extends BaseTest {
	
	String url = getConfigValue("url");
	WebDriver driver = new ChromeDriver();
	LoginPage loginPage = new LoginPage(driver);
	// String expectedMessage = "Invalid login details! Please try again with the correct information.";
	// String expectedHomepagetitlename="Cloud Heating & Air Conditioning";
	// String invalid_username = getConfigValue("InValid_username");
	// String invalid_password = getConfigValue("InValid_password");
	String valid_username = getConfigValue("Valid_username");
	String valid_password = getConfigValue("Valid_password");


	@BeforeTest
	public void Steup() throws InterruptedException {
	
		setupDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		System.out.println("intialising the webdriver Chrome and Navigate to URL: Customer Portal");
	}
}