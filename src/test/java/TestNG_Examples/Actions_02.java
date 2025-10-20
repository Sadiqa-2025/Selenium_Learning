package TestNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/*
write a program to move the cursor, select an item, enter the value and click on it using action classes.
 */
public class Actions_02 {

    @Test
    public void actionMethod(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//input[@type='text']"))).perform();
        action.sendKeys(driver.findElement(By.xpath("//input[@type='text']")), "Mobile Phones").sendKeys(Keys.ENTER).perform();
        driver.quit();

    }
}
