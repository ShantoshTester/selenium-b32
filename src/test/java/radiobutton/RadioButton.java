package radiobutton;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		WebElement dayDropdown = driver.findElement(By.id("day"));
//		Select sel = new Select(dayDropdown);
//		sel.selectByIndex(10);
		new Select(dayDropdown).selectByIndex(10);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Male']")).click();

	}

}
