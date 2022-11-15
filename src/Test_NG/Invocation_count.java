package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_count {
@Test(invocationCount = 5)
public void tc1() {
	Reporter.log("running tc1",true);
}
}
