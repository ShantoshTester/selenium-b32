package alertpopup;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup2 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		driver.quit();
	}

}
