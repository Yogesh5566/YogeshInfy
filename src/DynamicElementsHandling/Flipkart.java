package DynamicElementsHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\yoges\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.flipkart.com/");
	w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	w.findElement(By.xpath("//button[text()='✕']")).click();
	w.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles under 20000",Keys.ENTER);
	
	String price=w.findElement(By.xpath("(//div[@class='col col-5-12 nlI3QM']/descendant::div)[3]")).getText();
	System.out.println(price);
}
}
