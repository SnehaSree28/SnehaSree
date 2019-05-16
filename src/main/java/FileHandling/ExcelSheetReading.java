package FileHandling;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by lovel on 10-May-19.
 */
public class ExcelSheetReading
{
    @DataProvider(name = "TestData")
    public Object[][] excelData() throws IOException {
        File file = new File("C:\\Users\\lovel\\Desktop\\Book1.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
        HSSFSheet sheet = workbook.getSheetAt(0);
        HSSFRow firstRow = sheet.getRow(0);
        int row = sheet.getPhysicalNumberOfRows();
        int cell = firstRow.getLastCellNum();
        Object[][] Data = new Object[row - 1][cell];
        for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
            HSSFRow rowValue = sheet.getRow(rowIndex);
            if (rowValue == null) {
                continue;
            }
            for (int colIndex = rowValue.getFirstCellNum(); colIndex < rowValue.getLastCellNum(); colIndex++) {
                Data[rowIndex - 1][colIndex] = rowValue.getCell(colIndex).getStringCellValue();
            }
        }
        return Data;
    }
    @Test(dataProvider ="TestData" )
    public void hello(){
        System.out.println("-----");
    }
}
