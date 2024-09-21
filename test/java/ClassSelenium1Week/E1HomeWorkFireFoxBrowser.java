package ClassSelenium1Week;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E1HomeWorkFireFoxBrowser {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/");
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentURL);
        if (currentURL.equals("https://www.syntaxprojects.com/")) {
            System.out.println("URL verification passed.");
        } else {
            System.out.println("URL verification failed.");
        }
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
        if (title.equals("Syntax - Website to practice Syntax Automation Platform")) {
            System.out.println("Page title verification passed.");
        } else {
            System.out.println("Page title verification failed.");
        }
driver.quit();

    }
}
