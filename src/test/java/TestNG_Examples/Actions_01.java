package TestNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_01 {
    @Test
    public void mmt() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(5000);
        Actions action = new Actions(driver);
        //hover on cabs
        action.moveToElement(driver.findElement(By.xpath("//li[@class='menu_Cabs']//span[contains(@class, 'Cabs')]"))).perform();
        action.click().perform();
        Thread.sleep(3000);
        //double click on search button
        action.doubleClick(driver.findElement(By.xpath("//p[@data-cy='onewaySearch']/a"))).perform();
        driver.quit();
    }
}
