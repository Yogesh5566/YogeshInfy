package CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.facebook.com/");
	Thread.sleep(4000);
	w.findElement(By.cssSelector("input[id='email']")).sendKeys("Hii");
	w.findElement(By.cssSelector("input[id='pass']")).sendKeys("Hii");
	w.findElement(By.cssSelector("button[name='login']")).click();
}
}
