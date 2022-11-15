package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.facebook.com/");
	w.manage().window().maximize();
	Thread.sleep(5000);
	w.manage().window().minimize();
	
}
}
