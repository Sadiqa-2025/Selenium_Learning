package Ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

/*
"Selenium code to locate the 'Box Set' checkbox with the below flow:
- locate search text box and provide ""mobile"" as input data to it and search it.
- Write xpath starts with name=Brand and continue with the xpath with checkbox name and finally end with checkbox.

Make sure to add below content in program:
in program create a list of all the checkboxes names.
Take user input and compare with the list if it exists? then click on the checkbox respectively."
 */
public class UserInputMobileName {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.out.println("Enter the mobile name you want to search");
        Scanner scanner = new Scanner(System.in);
        String mobileName = scanner.next();
        String xpath = "//span[text()='"+mobileName+"']/parent::div/parent::div/preceding-sibling::span/input";

        driver.get("https://www.ebay.com");
        driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("Mobile phones");
        driver.findElement(By.xpath("//span[contains(text(), 'Search')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(xpath)).click();
        Thread.sleep(5000);
        List<WebElement> listOfCheckbox = driver.findElements(By.xpath("//li[@name='Brand']//span[contains(@class, 'multi-select-cbx')]"));
        for(WebElement x : listOfCheckbox){
            System.out.println(x.getText());
        }
        driver.quit();
    }
}
