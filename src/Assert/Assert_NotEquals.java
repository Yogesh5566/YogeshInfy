package Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_NotEquals {
@Test
public void T1() {
	String expR="Hii";
	String actR="hello";
	Assert.assertNotEquals(expR, actR);
}
}
