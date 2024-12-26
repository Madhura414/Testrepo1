package Assertions_of_validations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardvsSoft {
	@Test
	void m1()
	{
		Assert.assertEquals("233", "233");
	}

	@Test
	void m2()
	{
		Assert.assertNotEquals("233", "23");
	}
	void m3()
	{
		Assert.assertTrue(true);
		Assert.assertTrue(1==2);
	}
}
