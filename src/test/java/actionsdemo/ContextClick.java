package actionsdemo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.id("rightClickBtn"));
//		new Actions(driver).contextClick(ele).build().perform();
		
		Actions action = new Actions(driver);
		action.contextClick(ele).build().perform();

	}

}
