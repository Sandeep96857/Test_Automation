//package tests;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.Set;
//
//public class windowhandle {
//
//    public static void main(String[] args) {
//        // Step 1: Set up the WebDriver and open the browser.
//        // It's assumed you have the ChromeDriver executable in your system's PATH.
//        System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver");
//        WebDriver driver = new ChromeDriver();
//
//        try {
//            // Step 2: Navigate to a web page that opens a new window/tab.
//            // For this example, we'll use a public test site.
//            driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
//
//            // Optional: Maximize the browser window for better view.
//            driver.manage().window().maximize();
//
//            // Switch to the iframe if the button is inside one.
//            driver.switchTo().frame("iframeResult");
//
//            // Step 3: Get the handle of the current window (the main window).
//            String originalWindowHandle = driver.getWindowHandle();
//            System.out.println("Original Window Handle: " + originalWindowHandle);
//
//            // Step 4: Click the link that opens a new window.
//            driver.findElement(By.linkText("Visit W3Schools.com")).click();
//
//            // Step 5: Get all window handles. This will include both the original and the new one.
//            Set<String> allWindowHandles = driver.getWindowHandles();
//            System.out.println("All Window Handles: " + allWindowHandles);
//
//            // Step 6: Loop through the handles to find and switch to the new window.
//            for (String handle : allWindowHandles) {
//                // Check if the handle is NOT the original window's handle.
//                if (!handle.equals(originalWindowHandle)) {
//                    // Switch the driver's focus to the new window.
//                    driver.switchTo().window(handle);
//                    System.out.println("Switched to New Window Handle: " + handle);
//                    // We found our window, so we can break the loop.
//                    break;
//                }
//            }
//
//            // Step 7: Perform actions on the new window.
//            // For example, get its title.
//            String newWindowTitle = driver.getTitle();
//            System.out.println("Title of New Window: " + newWindowTitle);
//
//            // Step 8: Close the new window.
//            driver.close();
//            System.out.println("Closed the New Window.");
//
//            // Step 9: Switch back to the original window.
//            // This is crucial, as the driver's focus is still on the closed window.
//            driver.switchTo().window(originalWindowHandle);
//            System.out.println("Switched back to Original Window.");
//
//            // Step 10: Verify we are back on the original window by getting its title.
//            String originalWindowTitle = driver.getTitle();
//            System.out.println("Title of Original Window: " + originalWindowTitle);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            // Step 11: Close the browser at the end of the script.
//            if (driver != null) {
//                driver.quit();
//            }
//        }
//    }
//}
//
