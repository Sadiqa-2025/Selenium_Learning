package Flipart.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*
Launch flipart.com
Enter 'Oppo Mobiles' in search box, click enter
get the text of the first mobile phone displayed
 */

public class OppoMobileText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//input[contains(@title, 'Search')]")).sendKeys("Oppo Mobile");
        driver.findElement(By.xpath("//*[name() = 'svg']")).click();
        Thread.sleep(5000);
        WebElement name_of_Mobile = driver.findElement(By.xpath(("(//div[contains(@data-id, 'MOBH')]//a/div)[2]")));


        System.out.println(name_of_Mobile.getText());

    }
}
