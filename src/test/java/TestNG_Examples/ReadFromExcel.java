package TestNG_Examples;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {
    @Test
    public void readExcel() throws IOException {
        // workbook > sheet > row > cell > XSSF
        /*
        To get path of excel
        to read excel using fileInputStream
        workbook
        sheet
        row
        cell
         */
        String path = "D:\\Selenium Learning\\Selenium_Learning\\src\\main\\resources\\DayCountry.xlsx";
        FileInputStream file = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int noOfRows= sheet.getLastRowNum();
        int noOfCells = sheet.getRow(1).getLastCellNum();
        System.out.println(noOfRows);
        System.out.println(noOfCells);
        for(int row=0; row<=noOfRows; row++){
            XSSFRow currentRow = sheet.getRow(row);
            for(int cell=0; cell<noOfCells; cell++){
                XSSFCell currentCell = currentRow.getCell(cell);
                System.out.print(currentCell + "\t");
            }
            System.out.println();
        }
        file.close();
        workbook.close();

    }
}
