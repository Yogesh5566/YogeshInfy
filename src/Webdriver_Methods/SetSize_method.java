package Webdriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize_method {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.facebook.com/");
	Dimension dd=new Dimension(500,500);
	d.manage().window().setSize(dd);
	Thread.sleep(4000);
	d.close();
}
}
