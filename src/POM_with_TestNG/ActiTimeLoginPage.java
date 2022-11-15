package POM_with_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPage {
//Declaration
	@FindBy(xpath="//input[@id='username']") private WebElement UN;
	  @FindBy(xpath="//input[@name='pwd']") private WebElement PW;
	  @FindBy(xpath="//div[text()='Login ']") private WebElement lgbBTN;
	  
	  public ActiTimeLoginPage(WebDriver driver) {
		  PageFactory.initElements(driver,this);
	  }
	  public void enterUN(String username) {
		  UN.sendKeys(username);
	  }
	  public void enterPW(String password) {
		  PW.sendKeys(password);
	  }
	  public void clikLGN() {
		  lgbBTN.click();
	  }
}
