package DynamicElementsHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Ratings {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\yoges\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.flipkart.com/");
	w.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	w.findElement(By.xpath("//button[text()='✕']")).click();
	w.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles under 15000",Keys.ENTER);
	String ratings=w.findElement(By.xpath("(//span[@class='_2_R_DZ'])[1]")).getText();
	System.out.println("Ratings="+ratings);
	String star=w.findElement(By.xpath("(//div[@class='_3LWZlK'])[2]")).getText();
	System.out.println("Stars="+star);
	String price=w.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
	System.out.println("price="+price);
}
}
