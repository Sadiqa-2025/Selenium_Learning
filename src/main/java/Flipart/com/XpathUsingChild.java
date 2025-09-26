package Flipart.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingChild {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//div[@class='tLbyDf']/child::div/div/div/div/a[contains(@href, 'computers/monitors')]")).click();
        Thread.sleep(3000);

    }
}
