package ClassSelenium2Week;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative01XpathAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
driver.get("https://www.syntaxprojects.com/Xpath-homework.php");
        driver.manage().window().maximize();
        // 01 Your Hobbies
        WebElement hobbies = driver.findElement(By.xpath("//*[@id='yourHobbiesId']"));
        hobbies.sendKeys("Write code, Traveling");

        // 02 Click Here
        WebElement clickHereButton = driver.findElement(By.xpath("//*[@id='display_text']"));
        clickHereButton.click();

        // 02 Validate the message "Button clicked:" is displayed on the screen
        WebElement buttonClickedMessage = driver.findElement(By.xpath("//p[normalize-space()='Button Clicked']"));
        if (buttonClickedMessage.isDisplayed()) {
            System.out.println("Button clicked message is displayed.");
        } else {
            System.out.println("Button clicked message is not displayed.");
        }

        // 03. Enter favorite movie using XPath
        WebElement favoriteMovie = driver.findElement(By.xpath("//input[@id='favoriteMoviesId']"));
        favoriteMovie.sendKeys("Patriot, Braveheart, Apocalypto");

        // 04. Use contains() method in XPath to locate a specific text element and print it to the console
        WebElement specificText = driver.findElement(By.xpath("//label[contains(text(),'Lorem ipsum dolor sit amet consectetur adipisicing')]"));
        System.out.println("Found text: " + specificText.getText());

        // 05. Enter city in the designated field
        WebElement city = driver.findElement(By.xpath("//input[@id='yourCity']"));
        city.sendKeys("Hutto Texas");

        // 06 Personal email
        WebElement personalEmail = driver.findElement(By.xpath("//input[@id='PersonalEmailID']"));
        personalEmail.sendKeys("example@example.com");
        // 07 Office email
        WebElement officeEmail = driver.findElement(By.xpath("//input[@id='OfficeEmailID']"));
        officeEmail.sendKeys("soralee@example.com");
        // 08 Professional email
        WebElement professionalEmail = driver.findElement(By.xpath("//input[@id='ProfessionalEmailID']"));
        professionalEmail.sendKeys("myson@gmail.com");


        // 09 Client Name
        WebElement clientName = driver.findElement(By.xpath("//input[@id='clientName']"));
        clientName.sendKeys("John Doe");
        // 10 Client Id
        WebElement clientId = driver.findElement(By.xpath("//input[@id='clientId']"));
        clientId.sendKeys("12345");

        // 11 Street Number
        WebElement streetNumber = driver.findElement(By.xpath("//input[@name='StreetNo']"));
        streetNumber.sendKeys("789");
        // 12 House Number
        WebElement houseNumber = driver.findElement(By.xpath("//input[@name='HouseNo']"));
        houseNumber.sendKeys("456");

        //Thread.sleep(2000);
        //driver.quit();


























    }
}
