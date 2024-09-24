package ClassSelenium2Week;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class E8MutliSelectSelectDropDownAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");
        driver.manage().window().maximize();

        // click on the dropdown to display the option
        WebElement selectListDemo = driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));
        Select sel = new Select(selectListDemo);
        sel.selectByVisibleText("Pear");
        Thread.sleep(2000);
        List<WebElement> allOptions = sel.getOptions();
        System.out.println("Choose your Favorite Fruit:");
        for (WebElement option : allOptions) {
            System.out.println(option.getText());
        }

        WebElement multiSelectListDemo = driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select multiSelect = new Select(multiSelectListDemo);
        Thread.sleep(2000);
        // Select "Traveling", "Cooking", and "Gardening"
        multiSelect.selectByVisibleText("Traveling");
        multiSelect.selectByVisibleText("Cooking");
        multiSelect.selectByVisibleText("Gardening");


        WebElement getAllSelectedButton = driver.findElement(By.xpath("//button[@id='get_all']"));
        getAllSelectedButton.click();
        List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
        System.out.println("Selected options:");
        for (WebElement selectedOption : selectedOptions) {
            System.out.println(selectedOption.getText());
        }

        Thread.sleep(5000);
        // Deselect "Traveling"
        multiSelect.deselectByVisibleText("Traveling");
        // Click on "Get All Selected" button again and print result
        getAllSelectedButton.click();
        selectedOptions = multiSelect.getAllSelectedOptions();
        System.out.println("Selected options after deselecting 'Traveling':");
        for (WebElement selectedOption : selectedOptions) {
            System.out.println(selectedOption.getText());
        }




}

}
