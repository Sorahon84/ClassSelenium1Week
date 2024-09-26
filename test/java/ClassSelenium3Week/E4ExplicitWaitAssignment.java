package ClassSelenium3Week;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class E4ExplicitWaitAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait-homework.php");
        driver.manage().window().maximize();
        //wait.until(ExpectedConditions.alertIsPresent());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));


        // Change Text
        WebElement changeText = driver.findElement(By.xpath("//button[@id='changetext_button']"));
        changeText.click();
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"), "Ssyntaxtechs"));
        WebElement changeText2 = driver.findElement(By.xpath("//h2[@id='headingtext']"));
        System.out.println(changeText2.getText());


        //  Enable Button
        WebElement enableButton1 = driver.findElement(By.xpath("//button[@id='enable_button']"));
        enableButton1.click();
        WebElement clickButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Button']")));
        clickButton.click();


        // Checkbox Checked base on click
        WebElement checkButton = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        checkButton.click();
        WebElement checkBoxButton = driver.findElement(By.xpath("//input[@id='checkbox']"));
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxButton));
        checkBoxButton.click();
        boolean isChecked = checkBoxButton.isSelected();
        System.out.println("Is the checkbox checked? " + isChecked);


    }
}
//input[@id='checkbox']