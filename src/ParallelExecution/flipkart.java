package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class flipkart {
@Test
public void T1() throws Throwable {
	System.setProperty("webdriver,chrome.driver", "C:\\\\\\\\Users\\\\\\\\yoges\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.flipkart.com/");
	d.manage().window().maximize();
	Thread.sleep(4000);
	d.close();
}
}
