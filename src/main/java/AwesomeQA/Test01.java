package AwesomeQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.id("sex-1")).click();
        driver.findElement(By.id("exp-1")).click();
        driver.findElement(By.id("profession-1")).click();
        driver.findElement(By.id("tool-1")).click();
        driver.findElement(By.id("submit")).click();
        driver.quit();
    }
}
