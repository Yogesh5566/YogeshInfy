package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstoxlogin3page {

@FindBy(xpath="//div[text()='No, I’m good']")private WebElement No;


public Upstoxlogin3page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void clickNO() {
	No.click();
}
}