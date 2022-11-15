package Keys_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actTime {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\yoges\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://demo.actitime.com/login.do");
		w.manage().window().maximize();
		Thread.sleep(4000);
		w.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
}
}