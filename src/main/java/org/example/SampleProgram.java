package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleProgram {
    static String VerifytitleOfHomePage(String actual, String title){
     if(actual.equals(title)){
         return "The test case is passed";
     }
     else return "faied";
    }
    public static void main(String[] args) {
       WebDriver driver = new ChromeDriver(); // Launch the browser
       driver.get("https://www.flipkart.com/");
       String actual = driver.getTitle();
       String title = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
       System.out.println(VerifytitleOfHomePage(actual, title));
       driver.quit();
    }
}
