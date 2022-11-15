package POM_with_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
public static void main(String[] args) throws Throwable {
	FileInputStream f=new FileInputStream("C:\\Users\\yoges\\Documents\\ActiTimeCredentilas.xlsx");
	Sheet sh = WorkbookFactory.create(f).getSheet("sheet1");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.manage().window().maximize();
	w.get("https://demo.actitime.com/login.do");
	w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String username=sh.getRow(0).getCell(0).getStringCellValue();
	String password=sh.getRow(0).getCell(1).getStringCellValue();
	String actText=sh.getRow(0).getCell(2).getStringCellValue();
	ActTimepage a=new ActTimepage(w);
	a.enterUN(username);
	a.enterPW(password);
	a.clikLGN();
	ActTimeHomePage a1=new ActTimeHomePage(w);
	a1.verifyTxt(actText);
	
}
}
