package TestNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
for the contact "Helen Bennett" , i need company name and contact name.
 */
public class WebTable01 {

    @Test
    public void getCompanyName(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        WebElement companyName  = driver.findElement(By.xpath("//table[@id='customers']//td[text() ='Helen Bennett']/preceding-sibling::td"));
        System.out.println("The company name is "+ companyName.getText());
        WebElement countryName = driver.findElement(By.xpath("//table[@id='customers']//td[text() ='Helen Bennett']/following-sibling::td"));
        System.out.println("The country name is "+ countryName.getText());
        driver.quit();
    }
}
