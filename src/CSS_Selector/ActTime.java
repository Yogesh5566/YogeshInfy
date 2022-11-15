package CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActTime {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\yoges\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://demo.actitime.com/login.do");
	Thread.sleep(7000);
	w.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
	w.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
	
}
}
