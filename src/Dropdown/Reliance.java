package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Reliance {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.reliancedigital.in/");
		Thread.sleep(5000);
		w.findElement(By.xpath("//div[@class='wzrk-alert-heading']"));
		Thread.sleep(5000);
		w.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		Thread.sleep(3000);
		w.findElement(By.xpath("//li[@id='RIL_KitchenAppliancesNavigationNode']")).click();
		Thread.sleep(6000);
		w.findElement(By.xpath("(//span)[1]")).click();
		w.findElement(By.xpath("//h1[text()='Rice Cookers']")).click();
		
}
}