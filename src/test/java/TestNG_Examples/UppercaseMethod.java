package TestNG_Examples;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;

public class UppercaseMethod {

    public void Uppercase(WebElement inputText, WebDriver driver){
        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT).perform();
        inputText.sendKeys("upper case");
        action.keyUp(Keys.SHIFT).perform();
    }

    @Test
    public void caseText(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/key_presses");
        WebElement inputText =  driver.findElement(By.xpath("//input[@id=\"target\"]"));
        Uppercase(inputText, driver);
        inputText.sendKeys("  lower case");
        TakesScreenshot ts= (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        driver.quit();
    }
}
