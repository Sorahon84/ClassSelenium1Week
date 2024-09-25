package ClassSelenium3Week;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class E3WindowHandlesAssignment {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.syntaxprojects.com/window-popup-modal-demo-homework.php");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String mainWindowHandle = driver.getWindowHandle();
        //System.out.println("the window handle of the main page is " + mainWindowHandle);
        WebElement openB1Page = driver.findElement(By.xpath("//a[normalize-space()='Open B1 Page']"));
        openB1Page.click();
        Thread.sleep(5000);
        // Switch to new window opened by B1
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                // Verify that the new window opened by B1 has the correct text
                WebElement b1Text = driver.findElement(By.xpath("//h2[normalize-space()='Welcome to B1! page']"));
                String b1PageText = b1Text.getText();
                if (b1PageText.contains("Welcome to B1! page")) {
                    System.out.println("B1 Test Passed: Correct text found in B1 page.");
                } else {
                    System.out.println("B1 Test Failed: Incorrect text found in B1 page.");
                }

                // Close the B1 window
                driver.close();

                // Switch back to the main window
                driver.switchTo().window(mainWindowHandle);
            }
        }
        WebElement openB2Page = driver.findElement(By.xpath("//a[normalize-space()='Open B2 Page']"));
        openB2Page.click();
        Thread.sleep(5000);
        allWindowHandles = driver.getWindowHandles();
        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                // Verify that the new window opened by B2 has the correct text
                WebElement b2Text = driver.findElement(By.xpath("//h2[normalize-space()='Welcome to B2 page']"));
                String b2PageText = b2Text.getText();
                if (b2PageText.contains("Welcome to B2 page")) {
                    System.out.println("B2 Test Passed: Correct text found in B2 page.");
                } else {
                    System.out.println("B2 Test Failed: Incorrect text found in B2 page.");
                }

                // Close the B2 window
                driver.close();

                // Switch back to the main window
                driver.switchTo().window(mainWindowHandle);
            }
        }





















    }
}
