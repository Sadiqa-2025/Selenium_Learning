package TestNG_Examples;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadFromExcel {
    @Test
    public void readExcel() throws FileNotFoundException {
        // workbook > sheet > row > cell > XSSF
        /*
        To get path of excel
        to read excel using fileInputStream
        workbook
        sheet
        row
        cell
         */
        String path = "D:\\Selenium Learning\\Selenium_Learning\\src\\main\\resources";
        FileInputStream file = new FileInputStream(path);

    }
}
