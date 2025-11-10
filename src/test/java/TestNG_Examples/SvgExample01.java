package TestNG_Examples;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
//import java.util.logging.FileHandler;
import org.openqa.selenium.io.FileHandler;

/*
"- Write a program to fetch the number of states.
Based on the user input select a specific state and take a screenshot"
 */
public class SvgExample01 {

    WebDriver driver;
    @BeforeMethod
    public void initialiseDriver(){
        if(driver==null){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }

    }

    @AfterMethod
    public void quitDriver(){
        if(driver!=null) {
            driver.quit();
            driver=null;
        }
    }
    @Test
    public void svgClass() throws InterruptedException, IOException {
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,500);");
        //div[@id='chartdiv']/div/div//*[name()='svg']//*[name()='path']
        List<WebElement> states =driver.findElements(By.xpath("//div[@id='chartdiv']/div/div//*[name()='svg']//*[name()='path']"));
        for(WebElement x: states){
           String valueOfState=  x.getAttribute("aria-label");
           if(valueOfState!=null) {
               if (x.getAttribute("aria-label").contains("Karnataka")) {
                   x.click();
                   Thread.sleep(3000);
            /*      TakesScreenshot ts = (TakesScreenshot) driver;
                  File karnatakaMap = ts.getScreenshotAs(OutputType.FILE);
                  File target = new File("D:\\Selenium Learning\\Selenium_Learning\\src\\main\\resources\\image.png");
                  FileHandler.copy(karnatakaMap, target);*/
               }
           }
        }
    }
}
