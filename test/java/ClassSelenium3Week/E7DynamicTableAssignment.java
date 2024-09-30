package ClassSelenium3Week;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E7DynamicTableAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        // click PIM option
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        // get the column id
        List<WebElement> allId = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        boolean notFound = true;
        while (notFound) {
            int count = 1;
            for (WebElement id : allId) {
                String idNo = id.getText();
                if (idNo.equals("49748609")) {
                    System.out.println(count);
                    // find the checkbox and click
                    WebElement checkBox = driver.findElement(By.xpath("//table/tbody/tr[" + count + "]/td[1]"));
                    checkBox.click();
                    //exit the while loop
                    notFound=false;
                }
                count = count + 1;
            }
            if(notFound) {
                WebElement nextButton = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
                nextButton.click();
                allId = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
            }
        }















    }
}
