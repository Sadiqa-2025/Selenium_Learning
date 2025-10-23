package TestNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LowerUpperCaseUsingActions {
    @Test
    public void lowerUpper(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/key_presses");
        WebElement inputText =  driver.findElement(By.xpath("//input[@id=\"target\"]"));
        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT).perform();
        inputText.sendKeys("upper case");
        action.keyUp(Keys.SHIFT).perform();
        inputText.sendKeys("  lower case");
        driver.quit();
    }
}
