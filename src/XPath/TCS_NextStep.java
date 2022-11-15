package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TCS_NextStep {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://nextstep.tcs.com/campus/#/");
		Thread.sleep(5000);
		w.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(5000);
		w.findElement(By.xpath("(//input)[1]")).sendKeys("Hello");
		w.findElement(By.xpath("(//input)[2]")).sendKeys("hello");
		w.findElement(By.xpath("//button[text()='Login']")).click();
}
}