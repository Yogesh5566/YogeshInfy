package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin1page {
//step 1: Declaration
	@FindBy(xpath="//input[@id='userCode']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PW;
	@FindBy(xpath="//button[@id='submit-btn']")private WebElement signinbtn;
	
	//step 2: Initialization
	public UpstoxLogin1page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterUN() {
		UN.sendKeys("2ZB2T4");
	}
	public void enterPW() {
		PW.sendKeys("Samar@1988");
	}
	public void clickbtn() {
		signinbtn.click();
	}
}
