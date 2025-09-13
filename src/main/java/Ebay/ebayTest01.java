package Ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebayTest01 {
    static String verifyTitle(String actualTitle){
        String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        if(actualTitle.equals(expectedTitle)){
           return  "Title validation is passed";
        }
        else{
            return "Title validation is failed";
        }

    }
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        System.out.println(verifyTitle(actualTitle));
    }
}
