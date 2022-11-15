package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google {
@Test
public void T3() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\yoges\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.google.com/");
	d.manage().window().maximize();
	Thread.sleep(5000);
	d.close();
}
}
