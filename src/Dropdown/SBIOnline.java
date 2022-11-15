package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBIOnline {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\yoges\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.onlinesbi.sbi/");
	Thread.sleep(5000);
	w.findElement(By.xpath("//button[@role='button']")).click();
	Thread.sleep(5000);
	w.findElement(By.xpath("//a[text()='SARAL']")).click();
	
}
}
