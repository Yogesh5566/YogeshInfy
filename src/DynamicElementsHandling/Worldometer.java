package DynamicElementsHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Worldometer {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\yoges\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.worldometers.info/coronavirus/country/uk");
	w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String cases=w.findElement(By.xpath("(//div[@class='maincounter-number'])[1]")).getText();
	System.out.println("cases=" +cases);
	String deaths=w.findElement(By.xpath("(//div[@class='maincounter-number'])[2]")).getText();
	System.out.println("deaths=" +deaths);
	String recovered=w.findElement(By.xpath("(//div[@class='maincounter-number'])[3]")).getText();
	System.out.println("recovered=" +recovered);
}
}
