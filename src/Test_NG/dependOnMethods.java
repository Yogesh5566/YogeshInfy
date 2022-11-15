package Test_NG;

import org.testng.annotations.Test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;


public class dependOnMethods {
@Test
public void login() {
	Reporter.log("running login",true);
	
}
@Test
public void login1() {
	Reporter.log("running login",true);
	Assert.fail();
}
@Test(dependsOnMethods= {"login","login1"})
public void logout() {
	Reporter.log("running logout",true);
}
}
