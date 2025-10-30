package TestNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

/*
List the names, whose salaray is lesser than 11000
 */
public class SalaryLessThan11000 {

    @Test
    public void salary(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        int salary = driver.findElements(By.xpath("//table/tbody/tr/td[5]")).size();
        for(int i=1; i<=salary; i++){
            int sal = Integer.parseInt(driver.findElement(By.xpath("(//table/tbody/tr/td[5])["+i+"]")).getText());
          //  System.out.println(sal);
            if(sal < 11000){
                System.out.println(driver.findElement(By.xpath("(//table/tbody/tr/td[5]/preceding-sibling::td[@scope='row'])["+i+"]")).getText());
            }
        }
        driver.quit();

    }
}
