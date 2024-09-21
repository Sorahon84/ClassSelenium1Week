package ClassSelenium2Week;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E5RadioButtonsAssignment {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");
        driver.manage().window().maximize();
        WebElement juiceRadioButton = driver.findElement(By.xpath("//input[@value='Juice']"));
        juiceRadioButton.click();
        // check all boxes select one
        List<WebElement> workingEnvironmentOptions = driver.findElements(By.xpath("//input[@name='working_enviroment']"));
        for (WebElement option : workingEnvironmentOptions) {
            if (option.getAttribute("value").equals("hybrid")) {
                option.click();
            }
        }

        WebElement springRadioButton = driver.findElement(By.xpath("//label[normalize-space()='Spring']"));
        // Check if the Spring radio button is disabled
        if (springRadioButton.isEnabled()) {
            springRadioButton.click();
            boolean isSpringButton = springRadioButton.isEnabled();
            System.out.println("Spring radio button is disabled." + isSpringButton);
            WebElement enableButton = driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
            enableButton.click();
            Thread.sleep(2000);
            // Ensure that the Spring option is now enabled and select it
            if (springRadioButton.isEnabled()) {
                springRadioButton.click();
                System.out.println("Spring radio button selected.");
            }
            // Verify that the Winter radio button is not displayed initially
            WebElement winterRadioButton = driver.findElement(By.xpath("//input[@value='winter']"));
            boolean isWinterDisplayedInitially = winterRadioButton.isDisplayed();
            System.out.println("Is Winter radio button displayed initially? " + isWinterDisplayedInitially);


            // Click on the "Show Buttons" button
            WebElement showButtonsButton = driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
            showButtonsButton.click();
            System.out.println("Clicked on 'Show Buttons'.");

            // Verify that the Winter option is displayed after clicking and is available for selection
            boolean isWinterDisplayedAfterShow = winterRadioButton.isDisplayed();
            System.out.println("Is Winter radio button displayed after clicking 'Show Buttons'? " + isWinterDisplayedAfterShow);

            //Optionally, select the Winter radio button
            winterRadioButton.click();
            System.out.println("Winter radio button selected.");
            WebElement lunchRadioButton = driver.findElement(By.xpath("//input[@value='breakfast']"));
            lunchRadioButton.click();
            System.out.println("Selected Breakfast as the favorite meal");


        }
    }
}
