package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByTag {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/sample.html");
		
		Thread.sleep(4000);
		WebElement elementBox = driver.findElement(By.tagName("input"));
		elementBox.sendKeys("Hello Gita");
		Thread.sleep(4000);
		
		WebElement element = driver.findElement(By.tagName("a"));
		Thread.sleep(3000);
		element.click();
		Thread.sleep(3000);
		driver.quit();

	}

}
