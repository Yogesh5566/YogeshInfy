package MultiBrowsing;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart_with_firefox {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\yoges\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	WebDriver w=new FirefoxDriver();
	w.get("https://www.flipkart.com/");
}
}
