package VWO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vwoTest01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        Thread.sleep(5000);
        driver.findElement(By.id("login-username")).sendKeys("Java");
        driver.findElement(By.id("login-password")).sendKeys("Selenium");
    }
}
