package TestNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_DragAndDrop {
    @Test
    public void dragAndDrop(){
        WebDriver driver = new ChromeDriver();
        driver.get("  https://the-internet.herokuapp.com/drag_and_drop");
        Actions action = new Actions(driver);
        action.dragAndDrop(driver.findElement(By.xpath("//div[@id=\"column-a\"]")), driver.findElement(By.xpath("//div[@id=\"column-b\"]"))).perform();
        action.clickAndHold(driver.findElement(By.xpath("//div[@id=\"column-a\"]"))).moveToElement(driver.findElement(By.xpath("//div[@id=\"column-b\"]"))).release().perform();
        driver.quit();
    }
}
