package SeleniumDemo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class ReadExcelData {
	
	FileInputStream fis;
	@Test
	public void readData() throws IOException
	{
		//Specify the file location to read the data
		fis = new FileInputStream("/home/zadmin/Downloads/Manual Testing Assessment.xlsx");
		//Identify the workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Test Scenario");
		int rows = sheet.getPhysicalNumberOfRows();//To get the count of rows having values
		System.out.println(rows);//Record count -> Row count
		
		//To find the total no of colums having the value
		int columns = sheet.getRow(1).getPhysicalNumberOfCells();//Total no of columns
		System.out.println(columns);
		
		
		//To print the particular cell value
		String  cell = sheet.getRow(10).getCell(2).getStringCellValue();
		System.out.println(cell);
		
		//To print all the values present in  that execl sheet	
		
		for(int i=0;i<rows;i++)  //one of outer loop ->records/rows
		{
			for(int j=0;j<columns;j++)  //one of inner loop ->columns
			{
				String cellData = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(cellData);
			}
		}
		
		//Write some data into a particular cell value
		XSSFRow row = sheet.getRow(12);
		XSSFCell cellValue = row.getCell(1);//15,2
		cellValue.setCellValue("Bangalore123");
		
		FileOutputStream fos = new FileOutputStream("/home/zadmin/Downloads/Manual Testing Assessment.xlsx");
		workbook.write(fos);
		System.out.println(cellValue);
	}
}