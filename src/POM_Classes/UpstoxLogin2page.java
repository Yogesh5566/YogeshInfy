package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin2page {
@FindBy(xpath="//input[@id='yob']")private WebElement YOB;


public UpstoxLogin2page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void enterYOB() {
	YOB.sendKeys("1988");
}
}
