package CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.instagram.com/?hl=en");
	Thread.sleep(6000);
	w.findElement(By.cssSelector("input[name='username']")).sendKeys("yogeshrd");
	w.findElement(By.cssSelector("input[name='password']")).sendKeys("Yograj");
	
	
}
}
