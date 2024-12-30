package TestNgAnnotation;

import org.testng.annotations.Test;

public class TestDATA {
	@Test(priority=1)
	void add()
	{
		System.out.println("A");
	}
	@Test(priority=3)
	void two()
	{
		System.out.println("B");
	}
	@Test(priority=2)
	void three()
	{
		System.out.println("bde");
	}
	
	void four()
	{
		System.out.println("bde");
	}
}
