package handlingdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program1 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(3000);
		
		WebElement countryDropdown = driver.findElement(By.name("country"));
		Select sel = new Select(countryDropdown);
		
		// selecting a drop down value using index
		Thread.sleep(3000);
		sel.selectByIndex(10);
		Thread.sleep(3000);
		
		// selecting a drop down value using visible text
		Thread.sleep(3000);
		sel.selectByVisibleText("GAZA STRIP");
		Thread.sleep(3000);
		
		// selecting a drop down value using value
		Thread.sleep(3000);
		sel.selectByValue("MAURITANIA");
		Thread.sleep(3000);
		
	}

}
