package ClassSelenium2Week;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class E6CheckBoxesAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

        driver.manage().window().maximize();

        WebElement newsletterCheckbox = driver.findElement(By.xpath("//input[@id='newsletter']")); // Adjust the locator based on actual HTML ID
        if (newsletterCheckbox.isEnabled()) {
            newsletterCheckbox.click();
            System.out.println("Newsletter checkbox is enabled and clicked.");
        } else {
            System.out.println("Newsletter checkbox is disabled.");
        }
        List<WebElement> hobbiesCheckboxes = driver.findElements(By.xpath("//input[@class='cb-element']"));
        for (WebElement checkbox : hobbiesCheckboxes) {
            String label = checkbox.getAttribute("value");  // Assuming value attribute contains the hobby name
            if (label.equals("reading") || label.equals("cooking")) {
                checkbox.click();
                System.out.println("Selected hobby: " + label);
            }
        }
        Thread.sleep(2000);
        WebElement supportCheckbox = driver.findElement(By.xpath("//input[@value='Support']"));
        WebElement musicCheckbox = driver.findElement(By.xpath("//input[@value='Music']"));

        if (supportCheckbox.isDisplayed()) {
            System.out.println("Support checkbox is not displayed by default.");
        } else {
            System.out.println("Support checkbox is displayed by default.");
        }

        if (musicCheckbox.isDisplayed()) {
            System.out.println("Music checkbox is not displayed by default.");
        } else {
            System.out.println("Music checkbox is displayed by default.");
        }

        // Step 4: Click the "Show Checkboxes" button to display the checkboxes
        WebElement showCheckboxesButton = driver.findElement(By.xpath("//button[@id='toggleCheckboxButtons']"));
        showCheckboxesButton.click();
        Thread.sleep(2000);
        // Step 5: Select the Music checkbox
        if (musicCheckbox.isDisplayed()) {
            musicCheckbox.click();
            System.out.println("Music checkbox has been selected.");
        } else {
            System.out.println("Music checkbox is still not displayed.");
        }
        WebElement receiveNotificationsCheckbox = driver.findElement(By.xpath("//input[@value='Receive-Notifications']")); // Update with the actual ID
        if (!receiveNotificationsCheckbox.isEnabled()) {
            System.out.println("Receive Notifications checkbox is disabled as expected.");
        } else {
            System.out.println("Receive Notifications checkbox is enabled.");
        }
        WebElement enableCheckboxesButton = driver.findElement(By.xpath("//button[@id='enabledcheckbox']")); // Update with the actual ID
        enableCheckboxesButton.click();

        // Step 5: Select the "Receive Notifications" checkbox
        if (receiveNotificationsCheckbox.isEnabled()) {
            receiveNotificationsCheckbox.click();
            System.out.println("Receive Notifications checkbox has been selected.");
        } else {
            System.out.println("Receive Notifications checkbox is still disabled.");
        }



    }
}
