package POM_with_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActTimeHomePage {
	@FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement text;
	//Initialisation
	public ActTimeHomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public void verifyTxt(String actText) {
		String expText=text.getText();
	
		if(expText.equals(actText)) {
			System.out.println("It is same TestCase is passed");
		}
		else {
			System.out.println("It is different TestCase is failed");
		}
	}
}
