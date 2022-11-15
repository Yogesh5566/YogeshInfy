package Get_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\yoges\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver h=new ChromeDriver();
	h.get("https://www.amazon.com/s?k=...");
	Thread.sleep(5000);
	h.close();
	
}
}
