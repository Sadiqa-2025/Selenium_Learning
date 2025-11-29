package TestNG_Examples;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteIntoExcel {

    @Test
    public void writeExcel() throws IOException {
        String path = "D:\\Selenium Learning\\Selenium_Learning\\src\\main\\resources\\writeExcel.xlsx";
        FileOutputStream file = new FileOutputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("SheetNo1");
        XSSFRow row1 = sheet.createRow(0); //header
        row1.createCell(0).setCellValue("Name");
        row1.createCell(1).setCellValue("Age");
        row1.createCell(2).setCellValue("place");

        XSSFRow row2 = sheet.createRow(1);
        row2.createCell(0).setCellValue("John");
        row2.createCell(1).setCellValue("29");
        row2.createCell(2).setCellValue("blr");

        XSSFRow row3 = sheet.createRow(2);
        row3.createCell(0).setCellValue("Jerry");
        row3.createCell(1).setCellValue("Age1");
        row3.createCell(2).setCellValue("place1");

        workbook.write(file);
        file.close();
        workbook.close();
    }
}
