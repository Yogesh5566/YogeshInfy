package MultiBrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Flipkart_with_Edge {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\yoges\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver w=new EdgeDriver();
		w.get("https://www.flipkart.com/");
	}
}
