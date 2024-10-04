package ClassSelenium4Week;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class E1CalendarwithNavigationAssignment {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/jquery-date-picker-demo-homework.php");
        driver.findElement(By.xpath("//input[@id='from_date']")).click();
        String targetMonth = "December";
        String targetYear = "2024";
        String targetDay = "6";

        boolean isfound=false;
        while (!isfound) {
            // Get the current month and year displayed in the date picker
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            // Check if the current month and year match the target month and year
            if (currentMonth.equals(targetMonth) && currentYear.equals(targetYear)) {
                // Select the target day from the calendar
                List<WebElement> days = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
                for (WebElement day : days) {
                    if (day.getText().equals(targetDay)) {
                        day.click();
                        isfound=true;
                        break;

                    }
                }
            } else {
                // Navigate to the next month
                WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
                nextButton.click();
            }
        }



        driver.findElement(By.xpath(" //input[@id='to_date']")).click();
        String targetMonth1 = "December";
        String targetYear1 = "2025";
        String targetDay1 = "6";

        boolean isfound1=false;
        while (!isfound1) {
            // Get the current month and year displayed in the date picker
            String currentMonth = driver.findElement(By.xpath(" //span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            // Check if the current month and year match the target month and year
            if (currentMonth.equals(targetMonth1) && currentYear.equals(targetYear1)) {
                // Select the target day from the calendar
                List<WebElement> days = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
                for (WebElement day : days) {
                    if (day.getText().equals(targetDay1)) {
                        day.click();
                        isfound1=true;
                        break;

                    }
                }
            } else {
                // Navigate to the next month
                WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
                nextButton.click();
            }
        }






    }
}
