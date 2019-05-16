package Selenium;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by lovel on 11-Jan-19.
 */
public class ExcelSheet {
	@Test
	
    public void hello() throws EncryptedDocumentException, IOException {
        File f = new File("C:\\Users\\lovel\\Desktop\\Book1.xlsx");
        Workbook wb = WorkbookFactory.create(f);
        Sheet s = wb.getSheet ("Sheet1");
       /* Row row = s.getRow(0);
        Cell cell = row.getCell(0);
        String data=cell.getStringCellValue();
        System.out.println(data);
        
*/
        int rowCount = s.getLastRowNum() - s.getFirstRowNum();
        for (int i = 0; i < rowCount + 1; i++) {
            Row row = s.getRow(i);
            for (int j = 0; j < row.getLastCellNum(); j++) {
                System.out.print(row.getCell(j).getStringCellValue() + "|| ");

            }
            System.out.println();
        }

    }
    @Test
    public void hello1() throws IOException {
        File f = new File("C:\\Users\\lovel\\Desktop\\Book1.xlsx");
        Workbook wb = WorkbookFactory.create(f);
        Sheet s= wb.getSheet("Sheet1");
       /* Row row = s.getRow(0);
        Cell cell = row.getCell(0);
        String data=cell.getStringCellValue();
        System.out.println(data);

*/
        int rowCount = s.getLastRowNum()-s.getFirstRowNum();
        for(int i=0; i<rowCount+1;i++) {
            Row row=s.getRow(i);
            for(int j=0; j<row.getLastCellNum();j++) {
                System.out.print(row.getCell(j).getStringCellValue()+"|| ");

            }
            System.out.println();
        }
    }
       
    
    
}
