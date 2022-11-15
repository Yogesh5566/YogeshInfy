package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
@Test(enabled = false)
public void t1() {
	Reporter.log("running T1",true);
}
@Test
public void t2() {
	Reporter.log("running T2",true);
}
@Test
public void t3() {
	Reporter.log("running T3",true);
}

}
