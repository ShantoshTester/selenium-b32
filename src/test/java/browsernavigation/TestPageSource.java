package browsernavigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPageSource {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String pageSource = driver.getPageSource();
		System.out.println("************** Printing Page Source *************");
		System.out.println(pageSource);
		Thread.sleep(3000);
		driver.quit();

	}

}
