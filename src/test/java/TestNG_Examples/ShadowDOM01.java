package TestNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
https://dev.automationtesting.in/shadow-dom --- program to write multi nested SHADOW DOM
 */
public class ShadowDOM01 {
    @Test
    public void nestedShadow(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.automationtesting.in/shadow-dom");
        driver.manage().window().maximize();
        WebElement  shadowroot =  driver.findElement(By.cssSelector("#shadow-root"));
        SearchContext shadowroot1 =  shadowroot.getShadowRoot();
        WebElement firstShadow = shadowroot1.findElement(By.cssSelector("#shadow-element"));
        System.out.println(firstShadow.getText());
        WebElement secondroot = shadowroot1.findElement(By.cssSelector("#inner-shadow-dom"));
        SearchContext secondShadowroot= secondroot.getShadowRoot();
        WebElement secondText = secondShadowroot.findElement(By.cssSelector("#nested-shadow-element"));
        System.out.println(secondText.getText());
        driver.quit();




    }
}
