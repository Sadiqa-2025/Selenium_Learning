package MakeMyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MMT01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(5000);
        driver.findElement(By.id("fromCity")).click();
        driver.findElement(By.id("toCity")).click();
    }
}
