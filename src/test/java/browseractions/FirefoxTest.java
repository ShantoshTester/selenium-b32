package browseractions;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

	public static void main(String[] args) throws Exception {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		String pageTitle = driver.getTitle();
		System.out.println("Page Title : "+pageTitle);
		
		String pageUrl = driver.getCurrentUrl();
		System.out.println("Page Url : "+pageUrl);
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
