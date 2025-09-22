package Flipart.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FlipkartMobileList {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//input[contains(@title, 'Search')]")).sendKeys("Oppo Mobile");
        driver.findElement(By.xpath("//*[name() = 'svg']")).click();
        Thread.sleep(5000);
        List<WebElement> MobileNameList = driver.findElements(By.xpath("//div[contains(@data-id, 'MOBH')]//a//div[contains(@class, 'KzD')]"));
        for(WebElement x: MobileNameList){
            System.out.println(x.getText());
        }
    }
}
