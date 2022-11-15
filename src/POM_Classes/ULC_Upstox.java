package POM_Classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ULC_Upstox {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://login-v2.upstox.com/");
	 
	UpstoxLogin1page u1=new UpstoxLogin1page(driver);
	u1.enterUN();
	u1.enterPW();
	u1.clickbtn();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	UpstoxLogin2page u2=new UpstoxLogin2page(driver);
	u2.enterYOB();
	
	Upstoxlogin3page ux=new Upstoxlogin3page(driver);
	ux.clickNO();
	UpstoxHomepage u3=new UpstoxHomepage(driver);
	u3.hfcClick();
}
}
