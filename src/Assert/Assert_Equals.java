package Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Equals {
@Test
public void T1() {
	String expT="Yogi";
	String actT="Yogi";
	Assert.assertEquals(expT, actT);
}
}
