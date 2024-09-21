package ClassSelenium1Week;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2HomeWorkWebDriverCommands {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Browser maximized.");
        driver.get("https://www.google.com");
        String googleTitle = driver.getTitle();
        System.out.println("Google Page Title: " + googleTitle);
        driver.navigate().to("https://www.syntaxprojects.com/");
        String syntaxTitle = driver.getTitle();
        System.out.println("Syntax Projects Page Title: " + syntaxTitle);
        driver.navigate().back();
        googleTitle = driver.getTitle();
        System.out.println("Navigated Back to Google Page Title: " + googleTitle);
        driver.navigate().refresh();
        System.out.println("Google page refreshed.");
        driver.close();

    }
}
