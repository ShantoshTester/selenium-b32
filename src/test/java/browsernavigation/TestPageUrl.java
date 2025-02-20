package browsernavigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPageUrl {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
		driver.quit();

	}

}
