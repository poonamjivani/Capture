
package genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class CommonFileHandlingMthods {
	public String getValueFromPropertyFile( String Key) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Shantanu\\eclipse-workspace\\vtigerdemo\\Data\\CommonData.properties");
		Properties pobj = new Properties();
		pobj.load(file);
		String value = pobj.getProperty(Key);
		return value;
	}
	public String getValueFromExcelFile(String SheetName, int Row,int Cell) throws Throwable 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Shantanu\\eclipse-workspace\\vtigerdemo\\Data\\TestData.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet sh = book.getSheet(SheetName);
		Row row1 = sh.getRow(Row);
		Cell cell2 = row1.getCell(Cell);
		String value = cell2.getStringCellValue();
		return value;
}
	public void setValueinExcelSheet(String SheetName,int Row,int Cell,String value) throws Throwable 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Shantanu\\eclipse-workspace\\vtigerdemo\\Data\\TestData.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet sh = book.createSheet(SheetName);
		Row Row1 = sh.createRow(Row);
		Cell Cell1 = Row1.createCell(Cell);
		Cell1.setCellValue(value);
		FileOutputStream out = new FileOutputStream("C:\\Users\\Shantanu\\eclipse-workspace\\vtigerdemo\\Data\\TestData.xlsx");
		book.write(out);
	}
}
