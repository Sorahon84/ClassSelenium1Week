package ClassSelenium2Week;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS03Assignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");

        WebElement userId = driver.findElement(By.cssSelector("input[id='UserID']"));
        userId.sendKeys("123456789");

        WebElement userName = driver.findElement(By.cssSelector("input#UserName"));
        userName.sendKeys(" John Doe");

        WebElement introToLecture = driver.findElement(By.cssSelector("input[name='LectureIntro']"));
       introToLecture.sendKeys("This is an introduction to the lecture.");

        WebElement feedbackFromRay = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedbackFromRay.sendKeys("Great feedback from Ray!");

        WebElement feedbackFromDucky = driver.findElement(By.cssSelector("#FeedbackfromDucky"));
        feedbackFromDucky.sendKeys("Ducky also provided good feedback!");

        WebElement clientId = driver.findElement(By.cssSelector("input[name='ClientID']"));
        clientId.sendKeys("10191817");

        WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("john12doe@example.com");
//
        WebElement courseTopic = driver.findElement(By.cssSelector("input[name='CourseTopic']"));
        courseTopic.sendKeys("CSS Selectors");

    }
}
