package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_day {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.facebook.com/");
	Thread.sleep(5000);
	w.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	Thread.sleep(5000);
	WebElement day=w.findElement(By.xpath("//select[@title='Day']"));
	Select s=new Select(day);
	//s.selectByVisibleText("5");
	//s.selectByIndex(0);
	s.selectByValue("26");
	Thread.sleep(4000);
	WebElement month=w.findElement(By.xpath("//select[@id='month']"));
	Select s1=new Select(month);
	s1.selectByValue("3");
	Thread.sleep(4000);
	WebElement year=w.findElement(By.xpath("//select[@id='year']"));
	Select s2=new Select(year);
	s2.selectByValue("2000");
	
}
}
