package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByName {

	public static void main(String[] args) throws Exception  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/sample.html");
		Thread.sleep(4000);
		driver.findElement(By.name("n2")).sendKeys("all the best");
		Thread.sleep(3000);
		driver.quit();

	}

}
