package TestNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

/*
"Print the Class level information for the activity basketBall
https://practice.expandtesting.com/dynamic-pagination-table"
 */
public class ClassLevelActivity {

    @Test
    public void activity(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/dynamic-pagination-table");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       int rows= driver.findElements(By.xpath(" //tbody//td[position()=count(//table/thead/tr/th[contains(@aria-label, 'Extracurricular')])+5]")).size();
       for(int i=1; i<=rows; i++){
         String activity = driver.findElement(By.xpath("(//tbody//td[position()=count(//table/thead/tr/th[contains(@aria-label, 'Extracurricular')])+5])["+i+"]")).getText();
         if(activity.equals("Basketball")){
             System.out.println(driver.findElement(By.xpath("(//tbody//td[position()=count(//table/thead/tr/th[contains(@aria-label, 'Class Level')])+2])["+i+"]")).getText());
         }
       }
       driver.quit();
    }
}
