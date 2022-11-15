package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\yoges\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.facebook.com/");
	Thread.sleep(5000);
	w.findElement(By.xpath("//input[@id='email']")).sendKeys("yogeshdhumal214@gmail.com");
	w.findElement(By.xpath("//input[@id='pass']")).sendKeys("Yogesh");
	w.findElement(By.xpath("//button[@name='login']")).click();
}
}
