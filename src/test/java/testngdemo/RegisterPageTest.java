package testngdemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {
	
	
	
	@Test
	public void testRegisterFunction() {
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("steve");
		driver.findElement(By.id("LastName")).sendKeys("mathew");
		driver.findElement(By.id("Email")).sendKeys("smathew@test.com");
		driver.findElement(By.id("Password")).sendKeys("password");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("password");
	}

}










