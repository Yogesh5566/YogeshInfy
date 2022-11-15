package ScreenShot;


	import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	import com.google.common.io.Files;

	public class Amazon_title {
		public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\yoges\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver h=new ChromeDriver();
			h.get("https://www.amazon.com/s?k=...");
			Thread.sleep(4000);
			
			TakesScreenshot t=(TakesScreenshot)h;
			WebElement g=h.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
			File src=g.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\yoges\\Desktop\\Selenium Screenshot\\amazonTitle.png");
			Files.copy(src, dest);
			
}
}