package Ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectFirstMobilePhone {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("Mobile phones");
        driver.findElement(By.xpath("//span[contains(text(), 'Search')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='OnePlus']/parent::div/parent::div/preceding-sibling::span/input")).click();
       WebElement  firstName  =driver.findElement(By.xpath("(//li[contains(@id, 'item')])[1]//a[@class='su-link']"));
        System.out.println(firstName.getText());
        driver.quit();
    }
}
