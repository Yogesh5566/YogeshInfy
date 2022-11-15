package Navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_and_Amazon {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.navigate().to("https://www.facebook.com/");
	d.manage().window().maximize();
	Thread.sleep(3000);
	d.navigate().to("https://www.amazon.com/");
	Thread.sleep(4000);
	d.navigate().back();
	Thread.sleep(2000);
	d.navigate().forward();
	Thread.sleep(4000);
	d.close();
	
	
}
}
