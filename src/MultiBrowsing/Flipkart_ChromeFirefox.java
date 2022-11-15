package MultiBrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;


public class Flipkart_ChromeFirefox {
	WebDriver d=null;
	@Parameters("browsername")
@BeforeTest
public void T1(String browsername) {
	
	if(browsername.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\yoges\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		d=new EdgeDriver();
	}
	else if(browsername.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\yoges\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		d=new FirefoxDriver();
		
	}
	d.get("https://www.flipkart.com/");
}
	@Test 
	public void z1() {
		Reporter.log("login is completed",true);
	}
	@AfterTest
	public void login() {
		d.quit();
	}


}
