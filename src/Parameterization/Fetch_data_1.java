package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_data_1 {
public static void main(String[] args) throws Throwable {
	FileInputStream f=new FileInputStream("C:\\Users\\yoges\\Documents\\Parameterization.xlsx");
	String value=WorkbookFactory.create(f).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
System.out.println(value);
}
}
