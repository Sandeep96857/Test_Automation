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

public class LoginPageTest extends BaseTest {
	
	String url = getConfigValue("url");
	WebDriver driver = new ChromeDriver();
	LoginPage loginPage = new LoginPage(driver);
	String expectedMessage = "Invalid login details! Please try again with the correct information.";
	String expectedHomepagetitlename="Cloud Heating & Air Conditioning";
	String invalid_username = getConfigValue("InValid_username");
	String invalid_password = getConfigValue("InValid_password");
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
	@Test(priority = 1)
        public void SignIn_invalidPassword() throws InterruptedException {
	        loginPage.enterUsername(valid_username);
		    loginPage.enterPassword(invalid_password);
		    loginPage.clickSigninButton();
			String Actualmsg =loginPage.ToastMessage();
			System.out.println("Error : " + Actualmsg);		    
			// System.out.println();
		    assertEquals(Actualmsg, expectedMessage, "Toast message does not match!");
			loginPage.Clear_enterUsername(invalid_username);
		    loginPage.Clear_enterPassword(invalid_password);
			Thread.sleep(10);
		}


		@Test(priority = 2)
		public void SignIn_invalidUsername() throws InterruptedException {
	        loginPage.enterUsername(invalid_username);
		    loginPage.enterPassword(valid_password);
		    loginPage.clickSigninButton();
			String Actualmsg =loginPage.ToastMessage();
		    System.out.println("Error : " + Actualmsg);
		    // System.out.println();
		    assertEquals(Actualmsg, expectedMessage, "Toast message does not match!");
			loginPage.Clear_enterUsername(invalid_username);
		    loginPage.Clear_enterPassword(invalid_password);
		}
		@Test(priority = 3)
		public void SignIn_Invalidcredentials() throws InterruptedException {
				loginPage.enterUsername(invalid_username);
				loginPage.enterPassword(invalid_password);
				loginPage.clickSigninButton();
				String Actualmsg =loginPage.ToastMessage();
				assertEquals(Actualmsg, expectedMessage, "Toast message does not match!");
				System.out.println("Error : " + Actualmsg);
				// System.out.println();
				loginPage.Clear_enterUsername(invalid_username);
				loginPage.Clear_enterPassword(invalid_password);
				Thread.sleep(10);
		}

		@Test(priority = 4)
	    public void testVerifySigninBtnStatusafterClrinput() throws InterruptedException {
		 loginPage.enterUsername(valid_username);
		 loginPage.enterPassword(valid_password);
		 loginPage.Clear_enterUsername(valid_username);
		 loginPage.Clear_enterPassword(valid_password);
		 System.out.println("Username and password input field values cleared Successfully !");
		// loginPage.manuallyTriggerChangeDetection();
		 loginPage.refreshPage();
		 System.out.println("after clearing values WebPage refreshed Successfully !");
		 loginPage.waitForSignInButtonToBeVisible();
		 boolean isEnabled = loginPage.VisibilityofSigninButton(); 
		 assertFalse("Expected Sign-in button should be disaabled", isEnabled);
		 System.out.println(" Signin button is disbaled successfully after clearing Username and Password input ! ,Assertion : false");
		// Thread.sleep(10);
	}
	@Test(priority = 5)

    public void SignIn_ValidCrdentials() throws InterruptedException {
		loginPage.enterUsername(valid_username);
		loginPage.enterPassword(valid_password);
		Thread.sleep(10);
		loginPage.clickSigninButton();
		System.out.println("Login Successfull with valid Crdentials and User Navigated to Service provider selection window !");
	}

	@Test(priority = 6)

	public void AfterSignInSP_Selection() throws InterruptedException{
        loginPage.Clickprovider();
		System.out.println(" After clickin on Service provider, Cloud Heating Provider selected Successfully and user redirected to HomePage !");
		
	}
	@Test(priority = 7)
	public void ServiceprovidersVerify() throws InterruptedException{
		String ActulHomepagetitlename=loginPage.homepageproviderinfo();
		assertEquals(ActulHomepagetitlename,expectedHomepagetitlename );
		System.out.println(" Service provider Title verified Successfully !");
		Thread.sleep(100);
	}
	@Test(priority = 8)
	public void testSignout() throws InterruptedException{
		loginPage.profile_menu_icon();
		loginPage.clickSignoutButton();
		System.out.println("User Signout Successfully !");
	}

	 @AfterTest
	 public void Teardown() {	

	    loginPage.teardown();
	    System.out.print("Closing the browser");
		
	 }
}
