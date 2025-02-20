package handlingdropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/MultiSelect.html");
		
		WebElement dropdown = driver.findElement(By.id("month"));
		Select sel = new Select(dropdown);
		sel.selectByIndex(0);
		Thread.sleep(3000);
		sel.selectByIndex(1);
		Thread.sleep(3000);
		sel.selectByIndex(2);
		Thread.sleep(3000);
		sel.selectByIndex(3);
		Thread.sleep(3000);
		
		List<WebElement> selOptions = sel.getAllSelectedOptions();
		
		System.out.println("Is this dropdown a multiselect : "+sel.isMultiple());
		
		System.out.println("First Selected Option :"+sel.getFirstSelectedOption().getText());
		
		Thread.sleep(3000);
		
		for (WebElement options : selOptions) {
			System.out.println(options.getText());
		}
		
		Thread.sleep(3000);
		sel.deselectAll();
	}

}
