package Robot_Class;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\yoges\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver h=new ChromeDriver();
		h.get("https://www.amazon.com/s?k=...");
		Thread.sleep(5000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		
}
}