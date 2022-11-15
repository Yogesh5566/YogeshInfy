package Webdriver_Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition_Method {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.amazon.com/");
	Point p=new Point(300,100);
	w.manage().window().setPosition(p);
	w.manage().window().maximize();
	Thread.sleep(4000);
	w.close();
}
}
