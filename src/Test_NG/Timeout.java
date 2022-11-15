package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout {
@Test
public void z1() {
	Reporter.log("running z1",true);
}
@Test(timeOut = 5000)
public void z2() {
	Reporter.log("running z2",true);
}
@Test
public void z3() {
	Reporter.log("running z3",true);
}
}
