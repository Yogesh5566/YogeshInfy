package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
@BeforeClass
public void openBrowser() {
	Reporter.log("Browser is opened",true);
	
}
@BeforeMethod
public void openapp() {
	Reporter.log("application is opened",true);
}
@Test
public void verifytext() {
	Reporter.log("running TC",true);
}
@AfterMethod
public void closeApp() {
	Reporter.log("application is closed",true);
	
}
@AfterClass
public void closeBrowser() {
	Reporter.log("browser is closed",true);
}
}
