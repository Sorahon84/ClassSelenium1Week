package ClassSelenium1Week;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E4HomeWorkLocator {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.syntaxprojects.com/locator-homework.php");
        WebElement fullName=driver.findElement(By.id("fullName"));
        fullName.sendKeys("John Smith");
        WebElement email=driver.findElement(By.name("yourEmail"));
        email.sendKeys("jsmith.gmail.com");
        WebElement clientName=driver.findElement(By.id("clientNameId"));
        clientName.sendKeys("John");
        WebElement clientId=driver.findElement(By.id("ClientId"));
        clientId.sendKeys("john2324");
        WebElement clientFeedback=driver.findElement(By.name("Clientfeedback"));
        clientFeedback.sendKeys("Love Automation class");
        WebElement projectName=driver.findElement(By.name("ProjectName"));
        projectName.sendKeys("Selenium Locators");
        WebElement projectDeadline=driver.findElement(By.id("ProjectTimeId"));
        projectDeadline.sendKeys("Sunday, September 22");
        WebElement currentAddress=driver.findElement(By.name("CurrentAddress"));
        currentAddress.sendKeys("6435 Crimson Ridge, Loxley, AL, 36551");
        WebElement permanentAddress=driver.findElement(By.name("PermanentAddress"));
        permanentAddress.sendKeys("6435 Crimson Ridge, Loxley, AL, 36551");
        WebElement submitBtn=driver.findElement(By.name("btn-submit"));
        submitBtn.click();
        //added Thread to observe the changes in the form while executing the code
        Thread.sleep(4000);
        email.clear();
        email.sendKeys("jsmith@gmail.com");
        submitBtn.click();
        //added Thread to observe the changes in the form while executing the code
        Thread.sleep(4000);
        WebElement clickbtn=driver.findElement(By.linkText("Click Here."));
        clickbtn.click();





































    }
}
