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
        String text = customAttributeElement.getText();
        System.out.println("the text in the attribute section is :" + text);
        if(text.equals("inspect me to view my custom attribute")){
            System.out.println("the text matches to the one mentioned in acceptance criteria");
        }
        else {
            System.out.println("the text doesn't match to the one mentioned in acceptance criteria");
        }


        WebElement musicalFestivalCheckbox = driver.findElement(By.xpath("//input[@value='music_festival']"));
        if (musicalFestivalCheckbox.isEnabled()) ;
        musicalFestivalCheckbox.click();

        WebElement techTalkCheckbox  = driver.findElement(By.xpath("//input[@value='tech_talk']"));
        boolean button2 = techTalkCheckbox .isEnabled();
        if (!button2) {
            System.out.println("the tech talk radio button is disabled == test case pass");
        } else {
            System.out.println("the tech talk radio button is enabled ===  test case fail");
        }



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
        //        get the value of attribute title
        WebElement titleElement = driver.findElement(By.xpath("//div[@id='hidden_message']"));
        System.out.println(titleElement.getAttribute("title"));
        //        find the text box and clear it
        WebElement inputField = driver.findElement(By.xpath("//input[@id='inputField']"));
        inputField.clear();
        inputField.sendKeys("here is the custom text entered");





































































    }
}
