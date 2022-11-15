package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActTime_ULC {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\yoges\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://demo.actitime.com/login.do");
	 ActTime_Loginpage a=new  ActTime_Loginpage(w);
	 a.enterUN();
	 a.enterPW();
	 a.clikLGN();
	 
}
}
