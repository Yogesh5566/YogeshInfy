package Assert;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Soft_Assert {
	@Test
	public void Tc1() {
		Reporter.log("running TC1",true);
		String expR="Hi";
		String actR="Bye";
		SoftAssert s=new SoftAssert();
		s.assertEquals(expR, actR);
		System.out.println("I am failed after verification");
		s.assertAll();
	}
	public void Tc2() {
		Reporter.log("Running tc2",true);
	}
	
}