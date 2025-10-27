package TestNG_Examples;
/*
"Alerts:
URL: https://www.tutorialspoint.com/selenium/practice/alerts.php
1. 2nd 'click me' --> click OK on the pop up
2. 3rd 'click me' --> click on OK button
3. 3rd 'click me' --> click on cancel button
4. 4th 'click me' --> enter some string and click on OK button
5. 4th 'click me' --> enter some string and click on cancel button"
 */

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Alerts_01 {

    @Test
    public void alertsExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        driver.findElement(By.xpath("//button[@onclick='myMessage()']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        alert.dismiss();
        driver.findElement(By.xpath("//button[@onclick='myPromp()']")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys("Text inside alert");
        alert.accept();
        driver.findElement(By.xpath("//button[@onclick='myPromp()']")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys("Text inside alert");
        alert.dismiss();
        driver.quit();
    }

}
