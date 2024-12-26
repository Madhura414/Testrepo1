package Annotationsclass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AnnonationsDemo {
	@BeforeSuite
	void m1() 
	{
		System.out.println("this is before suite");
	}
	@AfterSuite
void m2() 
{
		System.out.println("this is After suite");
}
	@BeforeTest
void m3()
{
		System.out.println("this is before Test");
	
}
	@AfterTest
void m4()
{
		System.out.println("this is After Test");
	
}
	@BeforeClass
	void m5()
	{
			System.out.println("this is Before Class");
		
	}
	
	@AfterClass
	void m6()
	{
			System.out.println("this is After class");
		
	}
	@AfterTest
	void m7()
	{
			System.out.println("this is After Test");
		
	}
	@BeforeMethod
	void m8()
	{
			System.out.println("this is Before Method");
		
	}
	@AfterMethod
	void m9()
	{
			System.out.println("this is After Method");
		
	}
}
