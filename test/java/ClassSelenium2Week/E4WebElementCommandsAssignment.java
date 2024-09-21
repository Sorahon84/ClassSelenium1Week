package ClassSelenium2Week;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E4WebElementCommandsAssignment {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/selenium_commands_selector-homework.php");

        WebElement customAttributeElement = driver.findElement(By.xpath("//div[@id='textattr']"));
        String customText = customAttributeElement.getText();
        System.out.println("Custom Attribute Text: " + customText);

        WebElement musicalFestivalCheckbox = driver.findElement(By.xpath("//input[@value='music_festival']"));
        boolean firstButton1 = musicalFestivalCheckbox.isSelected();
        System.out.println("Musical festival checkbox button selection in " + firstButton1); // false
       musicalFestivalCheckbox.click();
        firstButton1 = musicalFestivalCheckbox.isSelected();
        System.out.println("Musical festival checkbox button selection in " + firstButton1); // true


        WebElement techTalkCheckbox  = driver.findElement(By.xpath("//input[@value='tech_talk']"));
        boolean button2 = techTalkCheckbox .isEnabled();
        System.out.println("Tech Talk button2 is enable " + button2); // false


        WebElement showMoreButton = driver.findElement(By.xpath("//button[normalize-space()='Show More Options']"));
        showMoreButton.click();
        WebElement artExhibitionCheckbox = driver.findElement(By.xpath("//input[@value='art_exhibition']"));
        if (artExhibitionCheckbox.isDisplayed()) {
           artExhibitionCheckbox.click();
            System.out.println("Art Exhibition checkbox is selected.");
        } else {
           System.out.println("Art Exhibition checkbox is not displayed.");
        }

        WebElement hoverElement = driver.findElement(By.xpath("//div[@id='hidden_message']"));
        String hoverMessage = hoverElement.getAttribute("title");
        System.out.println("Mystery Message Attribute: " + hoverMessage);

//      Locate and interact with "Checkbox 1"
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='CheckboxFirst']"));
        if (checkbox1.isEnabled()) {
            checkbox1.click();
            System.out.println("Checkbox 1 is selected.");
        }
//     Ensure that "Checkbox 2" is disabled
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='disabledCheckbox']")); // Use the appropriate locator for "Checkbox 2"
        if (!checkbox2.isEnabled()) {
            System.out.println("Checkbox 2 is disabled as expected.");
        } else {
            System.out.println("Checkbox 2 is enabled (unexpected).");
        }
        WebElement inputField = driver.findElement(By.xpath("//input[@id='inputField']"));
        inputField.clear();
        inputField.sendKeys("here is the custom text entered.");





































































    }
}
