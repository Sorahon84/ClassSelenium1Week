package ClassSelenium3Week;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E6StaticTableAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/table-search-filter-demo-homework.php");
      //  List<WebElement> tableAllElements = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
      //  String countryToSearch = "USA";
        // Iterate through rows and print matching entries
     //   for (WebElement row : tableAllElements) {
            // Check if the row contains the country
          //  if (row.getText().contains(countryToSearch)) {
            //    System.out.println(row.getText());
           // }
       // }


    List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
        // Iterate over each row to check for the given country
        int count = 1;
        for (WebElement col : rows) {
            if(col.getText().equals("USA")){
//                print this row
                WebElement row = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr[" + count + "]"));
                System.out.println(row.getText());
            }
            count=count+1;


            }




















    }
}
