package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxHomepage {
@FindBy(xpath="//div[text()='HDFCBANK']") private WebElement hdfc;

public UpstoxHomepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void hfcClick() {
	hdfc.click();
}
}
