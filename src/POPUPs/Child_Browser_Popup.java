package POPUPs;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Popup {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.flipkart.com/");
	w.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(5000);
	w.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobiles under 15000",Keys.ENTER);
	Thread.sleep(4000);
	w.findElement(By.xpath("//div[text()='realme C31 (Dark Green, 64 GB)']")).click();
	Set<String> a1=w.getWindowHandles();
	Thread.sleep(4000);
	ArrayList<String> a2=new ArrayList<String>(a1);
	String Id_main=a2.get(0);
	System.out.println(Id_main);
	Thread.sleep(4000);
	String Id_child=a2.get(1);
	System.out.println(Id_child);
	w.close();
	
	
}
}
