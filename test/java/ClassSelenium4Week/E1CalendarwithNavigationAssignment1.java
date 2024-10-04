package ClassSelenium4Week;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class E1CalendarwithNavigationAssignment1 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/jquery-date-picker-demo-homework.php");
        // Date values in the format "dd-MMM-yyyy"
        String fromDate = "05-Oct-2024";
        String toDate = "10-Oct-2025";

        // Select the "From" date
        selectDate(driver, fromDate, "from");

        // Select the "To" date
        selectDate(driver, toDate, "to");

        // Verification logic can be added here
        System.out.println("Dates selected successfully!");

        // Close the browser
        //driver.quit();
    }

    public static void selectDate(WebDriver driver, String targetDate, String dateType) throws Exception {
        // Parse the target date
        SimpleDateFormat targetFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Date formattedTargetDate = targetFormat.parse(targetDate);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(formattedTargetDate);

        int targetDay = calendar.get(Calendar.DAY_OF_MONTH);
        int targetMonth = calendar.get(Calendar.MONTH);
        int targetYear = calendar.get(Calendar.YEAR);


        // Open the appropriate date picker
        String datePickerId = dateType.equalsIgnoreCase("from") ? "from_date" : "to_date";
        driver.findElement(By.id(datePickerId)).click();


        // Select the correct month and year
        while (true) {
            String displayedMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String displayedYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM");
            Date displayedMonthDate = monthFormat.parse(displayedMonth);
            Calendar displayedCalendar = Calendar.getInstance();
            displayedCalendar.setTime(displayedMonthDate);
            int displayedMonthInt = displayedCalendar.get(Calendar.MONTH);
            int displayedYearInt = Integer.parseInt(displayedYear);

            if (displayedYearInt == targetYear && displayedMonthInt == targetMonth) {
                break;
            } else if (displayedYearInt < targetYear || (displayedYearInt == targetYear && displayedMonthInt < targetMonth)) {
                driver.findElement(By.xpath("//span[text()='Next']")).click();
            } else {
                driver.findElement(By.xpath("//span[text()='Prev']")).click();
            }
        }

        // Select the correct day
        driver.findElement(By.xpath("//table/tbody/tr/td/a")).click();






    }
}
