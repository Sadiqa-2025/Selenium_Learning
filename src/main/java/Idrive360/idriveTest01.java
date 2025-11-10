package Idrive360;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idriveTest01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.idrive360.com/enterprise/");
        Thread.sleep(5000);
        driver.findElement(By.id("username")).sendKeys("Java");
        driver.findElement(By.id("password")).sendKeys("Selenium");
        driver.findElement(By.xpath("//span[@class='id-checkmark']")).click();
    }
}
