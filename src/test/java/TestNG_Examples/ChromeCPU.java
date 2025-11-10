package TestNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

/*
"Dynamic web table: https://practice.expandtesting.com/dynamic-table#google_vignette
Scenario:
For Chrome process get value of CPU load.
Compare it with value in the yellow label."
 */
public class ChromeCPU {
    @Test
    public void CPUloadForChrome() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/dynamic-table#google_vignette");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,600);");
        WebElement cpuLoad= driver.findElement(By.xpath("//tbody/tr/td[text()='Chrome']/following-sibling::td[position()=count(//thead/tr/th[text()='CPU'])+2]"));
        String loadValue = cpuLoad.getText();
        String yellowValue = driver.findElement(By.xpath("//p[@id='chrome-cpu']")).getText();
        if(yellowValue.contains(loadValue)){
            System.out.println("The value is equal");
        }
        else System.out.println("The value is not equal");
        Thread.sleep(5000);
        driver.quit();
    }

}
