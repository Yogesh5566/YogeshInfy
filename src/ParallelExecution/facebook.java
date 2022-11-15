package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebook {
@Test
public void T2() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\yoges\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.facebook.com/");
	d.manage().window().maximize();
	Thread.sleep(4000);
	d.close();
	
}
}
