package ClassSelenium1Week;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E3HomeWorkIntroductionToLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/locator-homework.php");
        WebElement firstName = driver.findElement(By.id("fullName"));
        firstName.sendKeys("John Doe");
        WebElement email = driver.findElement(By.name("yourEmail"));
        email.sendKeys("john.doe.com");
        WebElement clientName = driver.findElement(By.id("clientNameId"));
        clientName.sendKeys("Sora");
        WebElement clientId = driver.findElement(By.id("ClientId"));
        clientId.sendKeys("123455");
        WebElement clientFeedback= driver.findElement(By.name("Clientfeedback"));
        clientFeedback.sendKeys("This is a sample feedback.");
        WebElement project = driver.findElement(By.name("ProjectName"));
        project.sendKeys("Subh");
        WebElement DeadLine = driver.findElement(By.id("ProjectTimeId"));
        DeadLine.sendKeys("2024-12-31");
        WebElement CurrentAddress = driver.findElement(By.name("CurrentAddress"));
        CurrentAddress.sendKeys("123 Main St, City");
        WebElement PermanentAddress = driver.findElement(By.name("PermanentAddress"));
        PermanentAddress.sendKeys("456 Elm St, City");

        //WebElement link1 = driver.findElement(By.linkText("Click Here."));
        //link1.click();
        WebElement submitPress = driver.findElement(By.name("btn-submit"));
        submitPress.click();

        //added Thread to observe the changes in the form while executing the code
        Thread.sleep(4000);
        email.clear();
        email.sendKeys("john@doe.com");
        submitPress.click();
        //added Thread to observe the changes in the form while executing the code
        Thread.sleep(4000);
        WebElement clickbtn=driver.findElement(By.linkText("Click Here."));
        clickbtn.click();





    }
}
