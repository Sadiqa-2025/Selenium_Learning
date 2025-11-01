package TestNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

/*
"Give me the range of age, who are working in department legal and Compliance
https://www.tutorialspoint.com/selenium/practice/webtables.php"
 */
public class AgeRangeInDept {

    @Test
    public void rangeOfAge(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String dept= "//table/tbody//td[position()=count(//table/thead//th[(text()='Department')]) + 5]";
        int rows = driver.findElements(By.xpath("//tbody/tr")).size();
        for(int i=1; i<=rows; i++){
            String department = driver.findElement(By.xpath("(//table/tbody//td[position()=count(//table/thead//th[(text()='Department')]) + 5])["+i+"]")).getText();
            if(department.equals("Legal") || department.equals("Compliance")){
                //fetch the age
                System.out.println(driver.findElement(By.xpath("(//table/tbody//td[position()=count(//table/thead//th[(text()='Age')]) + 2])["+i+"]")).getText());

            }
        }
        driver.findElement(By.xpath(dept));
        driver.quit();
    }
}
