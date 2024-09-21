package ClassSelenium2Week;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E7DropDownwithoutSelectTagAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");
        driver.manage().window().maximize();

        // click on the dropdown to display the option
        WebElement selectListDemo = driver.findElement(By.xpath("//div[@id='dream_fruits']"));
        selectListDemo.click();

        List<WebElement> hobbyOption = driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));
        Thread.sleep(2000);
        for (WebElement options : hobbyOption) {
            String optionText = options.getText();
            if (optionText.equals("Mango")) {
                options.click();
                System.out.println("Selected: Mango");
            }
        }

        WebElement hobbyDropdown = driver.findElement(By.xpath("//div[@id='favorite_hobbies']"));
        hobbyDropdown.click();

        List<WebElement> hobbyOptions = driver.findElements(By.xpath("//ul[@class='dropdown-menu multi-dropdown-menu']/li/a"));
        Thread.sleep(2000);
        for (WebElement options : hobbyOptions) {
            String optionTextDemo = options.getText();
            if (optionTextDemo.equals("Reading")) {
                options.click();
                System.out.println("Selected: Reading");
            }
        }


    }
}
