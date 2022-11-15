package iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\yoges\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	Thread.sleep(4000);
	w.switchTo().frame("packageListFrame");
	String g=w.findElement(By.xpath("//a[text()='org.openqa.selenium.devtools.idealized.target.model']")).getText();
	System.out.println(g);
	Thread.sleep(3000);
	w.switchTo().defaultContent();
	Thread.sleep(3000);
	w.switchTo().frame("packageFrame");
	Thread.sleep(3000);
	String h=w.findElement(By.xpath("//a[text()='NodeDrainStarted']")).getText();
	System.out.println(h);
	Thread.sleep(3000);
	w.switchTo().defaultContent();

	w.switchTo().frame("classFrame");
	Thread.sleep(10000);
	String j=w.findElement(By.xpath("//h1[@class='title']")).getText();
	System.out.println(j);
	
}
}
