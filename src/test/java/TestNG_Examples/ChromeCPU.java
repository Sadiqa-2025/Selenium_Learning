package TestNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
    public void CPUloadForChrome(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/dynamic-table#google_vignette");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//tr/td[text()='Chrome']"));
    }
}
