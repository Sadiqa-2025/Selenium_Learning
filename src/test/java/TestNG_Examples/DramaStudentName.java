package TestNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

/*
In the search box type "Drama". get the Student name
 */
public class DramaStudentName {
    @Test
    public void drama(){
        ChromeOptions chrome = new ChromeOptions();
        chrome.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(chrome);
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/dynamic-pagination-table");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        JavascriptExecutor js= (JavascriptExecutor) driver;
        System.out.println("before scrolling");
        js.executeScript("window.scrollTo(0,500);");
        //    js.executeScript("window.scrollTo(0,document.body.scrollHeight);");   -- this will scroll till the bottom of the page,
        // js.executeScript("window.scrollTo(0,0);");---This will scroll to top of the page
       // js.executeScript("argument[0].scrollIntoView();",driver.findElement(By.xpath("//select[@aria-controls='example']")));
        System.out.println("after scrolling");
        Select select= new Select(driver.findElement(By.xpath("//select[@aria-controls='example']")));
        select.selectByValue("-1");
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Drama");
        Actions action= new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();
        driver.quit();

    }
}
