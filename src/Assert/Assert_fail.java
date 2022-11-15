package Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_fail {
@Test
public void T1() {
	Reporter.log("running T1",true);
	Assert.fail();
}
@Test
public void T2() {
	Reporter.log("running T2",true);
}
}
