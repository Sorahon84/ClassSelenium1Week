package ClassSelenium1Week;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2HomeWorkWebDriverCommands {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Browser maximized.");
        driver.get("https://www.google.com");
        String googleTitle = driver.getTitle();
        System.out.println("Google Page Title: " + googleTitle);
        driver.navigate().to("https://www.syntaxprojects.com/");
        Thread.sleep(2000);
        String syntaxTitle = driver.getCurrentUrl();
        System.out.println("Syntax Projects Page Title: " + syntaxTitle);
        Thread.sleep(2000);
        driver.navigate().back();
        googleTitle = driver.getTitle();
        System.out.println("Navigated Back to Google Page Title: " + googleTitle);
        Thread.sleep(2000);
        driver.navigate().refresh();
        System.out.println("Google page refreshed.");
        //driver.close();

    }
}
