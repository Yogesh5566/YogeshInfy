package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.instagram.com/?hl=en");
		Thread.sleep(6000);
		w.findElement(By.xpath("//input[@name='username']")).sendKeys("Hii");
		w.findElement(By.xpath("//input[@name='password']")).sendKeys("hello");
		w.findElement(By.xpath("//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    ']")).click();
}
}