package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActTime_Loginpage {
  @FindBy(xpath="//input[@id='username']") private WebElement UN;
  @FindBy(xpath="//input[@name='pwd']") private WebElement PW;
  @FindBy(xpath="//div[text()='Login ']") private WebElement lgbBTN;
  
  public ActTime_Loginpage(WebDriver w) {
	  PageFactory.initElements(w,this);
  }
  public void enterUN() {
	  UN.sendKeys("admin");
  }
  public void enterPW() {
	  PW.sendKeys("manager");
  }
  public void clikLGN() {
	  lgbBTN.click();
  }
}
