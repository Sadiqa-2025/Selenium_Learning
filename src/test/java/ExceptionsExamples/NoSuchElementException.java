package ExceptionsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NoSuchElementException {

    @Test
    public void example01(){
        WebDriver driver=null;
        try {
            driver = new ChromeDriver();
            driver.get("https://www.logiqids.com/dashboard");
            driver.findElement(By.name("JavaException")).click();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            driver.quit();
        }
    }

    @Test
    public void example02(){
        WebDriver driver=null;
        try{
            driver = new ChromeDriver();
            driver.get("https://www.flipkart.com/search?q=oppo+mobile&as=on&as-show=on&otracker=AS_Query_HistoryAutoSuggest_1_5_na_na_na&otracker1=AS_Query_HistoryAutoSuggest_1_5_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=oppo+mobile&requestId=0a9c1116-7101-4db1-a336-f41077638497&as-searchtext=oppo%20");
            driver.findElement(By.xpath("//input[contains(@title, 'Search 01')]")).sendKeys("Oppo Mobile");
            driver.findElement(By.xpath("//*[name() = 'svg']")).click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            driver.quit();
        }
    }
}
