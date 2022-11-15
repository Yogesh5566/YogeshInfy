package POPUPs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert_Popup {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\yoges\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://demo.guru99.com/test/delete_customer.php");
	w.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456",Keys.ENTER);
	Alert a=w.switchTo().alert();
	Thread.sleep(5000);
	String text=a.getText();
	System.out.println(text);
	a.accept();
	Thread.sleep(5000);
	a.accept();
	
}
}
