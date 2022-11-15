package CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linked_in {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.linkedin.com/login/");
	Thread.sleep(5000);
	w.findElement(By.cssSelector("input[id='username']")).sendKeys("Yogesh Dhumal");
	w.findElement(By.cssSelector("input[id='password']")).sendKeys("535356");
	w.findElement(By.cssSelector("button[class='btn__primary--large from__button--floating']")).click();
}
}
