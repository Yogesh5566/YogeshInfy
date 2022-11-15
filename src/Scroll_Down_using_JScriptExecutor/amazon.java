package Scroll_Down_using_JScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\yoges\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver h=new ChromeDriver();
		h.get("https://www.amazon.com/s?k=...");
		Thread.sleep(5000);
	JavascriptExecutor j=(JavascriptExecutor) h;
	j.executeScript("window.scrollBy(0,2000);");
	Thread.sleep(5000);
	j.executeScript("window.scrollBy(0,4000);");
		
}
}