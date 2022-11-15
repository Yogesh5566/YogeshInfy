package FrameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upstox_withoutDDF {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.manage().deleteAllCookies();
	w.manage().window().maximize();
	w.get("https://login-v2.upstox.com/");
	w.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	w.findElement(By.xpath("//input[@id='userCode']")).sendKeys("2ZB2T4");
	w.findElement(By.xpath("//input[@id='password']")).sendKeys("Samar@1988");
	w.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
	
	w.findElement(By.xpath("//input[@id='yob']")).sendKeys("1988");
	w.findElement(By.xpath("//div[text()='No, I’m good']")).click();
	String expT="Upstox Pro";
	String actT="Upstox Pro";
	if(expT.equals(actT)) {
		System.out.println("Expected title and Actual title are same.Developer has done the right job");
	}
	else {
		System.out.println("Expected title ans Actual title are different.Please report to developer");
	}
}
}