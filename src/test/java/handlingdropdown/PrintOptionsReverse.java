package handlingdropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOptionsReverse {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(3000);
		WebElement dropdown = driver.findElement(By.name("country"));
		Select sel = new Select(dropdown);
		
		// using getOptions we can get all the options present in the drop down
		List<WebElement> options = sel.getOptions();
		int count = options.size();
		System.out.println("Total no of options present : "+count);
		
		for(int i=count-1; i>=0; i--)
		{
			System.out.println(options.get(i).getText());
		}
	
	}

}
