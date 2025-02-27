package tngannotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
	
	@BeforeSuite
	public void setupSuite()
	{
		System.out.println("--BeforeSuite -- Configure Report");
	}
	
	@AfterSuite
	public void flushReport()
	{
		System.out.println("--AfterSuite -- Flush the Report");
	}
	
	@BeforeClass
	public void clearBrowserConfig()
	{
		System.out.println("--BeforeClass -- Browser Configuration");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("--AfterClass -- Browser Restoration");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("--BeforeTest ---");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("--AfterTest ---");
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Browser Setup");
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("Quit Browser");
		System.out.println();
	}
	
	
	@Test(priority = 1)
	public void testOne()
	{
		System.out.println("First Test Case");
	}
	
	@Test(priority = 2)
	public void testTwo()
	{
		System.out.println("Second Test Case");
	}
	
	@Test(priority = 3)
	public void testThree()
	{
		System.out.println("Third Test Case");
	}

}
