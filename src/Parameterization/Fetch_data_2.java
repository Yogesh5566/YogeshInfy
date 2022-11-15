package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_data_2 {
public static void main(String[] args) throws Throwable {
	FileInputStream f=new FileInputStream("C:\\Users\\yoges\\Documents\\Parameterization.xlsx");
	String value=WorkbookFactory.create(f).getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
     System.out.println(value);
     FileInputStream f1=new FileInputStream("C:\\\\Users\\\\yoges\\\\Documents\\\\Parameterization.xlsx");
     Boolean d=WorkbookFactory.create(f1).getSheet("sheet1").getRow(0).getCell(2).getBooleanCellValue();
     System.out.println(d);
     FileInputStream f2=new FileInputStream("C:\\\\Users\\\\yoges\\\\Documents\\\\Parameterization.xlsx");
     String g=WorkbookFactory.create(f2).getSheet("sheet1").getRow(0).getCell(3).getStringCellValue();
     System.out.println(g);
}
}
