package ClassSelenium2Week;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2AdvanceXpathAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath-homework.php");

        // 01  Enter the name of your books in reverse order from the least  favorite
        WebElement leastFavBook = driver.findElement(By.xpath("(//input[@id='least-favorite'])[1]"));
        leastFavBook.sendKeys("Least Favorite Book");

        WebElement secondBook = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        secondBook.sendKeys("Second Favorite Book");

        WebElement favoriteBook = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        favoriteBook.sendKeys("Most Favorite Book ");

        // 02 Enter the name of our favourite book, then the second and third best:
        WebElement favoriteBook1 = driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        favoriteBook1.sendKeys("My Favorite Book First");

        WebElement favoriteBook2 = driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
        favoriteBook2.sendKeys("My Favorite Book Second");

        WebElement favoriteBook3 = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
        favoriteBook3.sendKeys("My Favorite Book Third");

        // 03 Enter the names in order: grandparent, then parent and finally child:
        WebElement grandparentField = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grandparentField.sendKeys("Grandparent Name");

        WebElement parentField = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parentField.sendKeys("Parent Name");

        WebElement childField = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        childField.sendKeys("Child Name");



















    }
}
