package ClassSelenium3Week;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2IframeAssignment {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");
        driver.manage().window().maximize();

        driver.switchTo().frame(1);
        WebElement iFrame1 = driver.findElement(By.xpath("//iframe[@name='checkbox-iframe']"));
        driver.switchTo().frame(iFrame1);
        WebElement iFrame2 = driver.findElement(By.xpath("//input[@value='Option-1']"));
        iFrame2.click();

        driver.switchTo().defaultContent();
        Thread.sleep(2000);

        driver.switchTo().frame(1);
        WebElement iFrame3 = driver.findElement(By.xpath("//select[@id='cities']"));
        Select select = new Select(iFrame3);
        select.selectByVisibleText("Chicago");

        Thread.sleep(2000);
        driver.switchTo().defaultContent();

        driver.switchTo().frame(0);
        WebElement iFrame4 = driver.findElement(By.xpath("//input[@placeholder='User Name']"));
        iFrame4.sendKeys("HelloStudent123");


    }
}
