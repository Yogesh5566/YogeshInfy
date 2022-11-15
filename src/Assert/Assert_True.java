package Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_True {
@Test
public void T1() {
	Reporter.log("running T1",true);
	Boolean actR=true;
	Assert.assertTrue(actR);
}
}
