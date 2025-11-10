package JSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Executor01 {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.idrive360.com/enterprise/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Here xpath, does not work so, js executor will work by default in line 19 for(visibilityOfElementLocated).
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
        System.out.println("waited till here");
        driver.findElement(By.xpath("//input[@id='username']")).click();
        System.out.println("username is clicked");

        //scrolling function using java script
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//a[contains(text(),\"Deploy via Group Policy\")]")));
        //deployViaGroupPolicy.scrollIntoView(true);
        js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[contains(text(),\"Deploy via Group Policy\")]"))); //click on the ekement using java script.
    }
}
