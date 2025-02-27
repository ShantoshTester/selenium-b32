package testngdemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
	

	
	@Test
	public void testLoginAutoUser1()
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("testautouser@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Pass@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.linkText("Log out")).isDisplayed();	
	}
	
	@Test
	public void testLoginAutoUser2()
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("testautouser2@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Pass@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.linkText("Log out")).isDisplayed();
	}

}
