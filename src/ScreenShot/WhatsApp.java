package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WhatsApp {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://web.whatsapp.com/");
	Thread.sleep(5000);
	TakesScreenshot t=(TakesScreenshot)w;
	File src=t.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\yoges\\Desktop\\Selenium Screenshot\\whatsaap.jpg");
	Files.copy(src, dest);
}
}
