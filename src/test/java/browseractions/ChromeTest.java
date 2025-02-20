package browseractions;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		String pageTitle = driver.getTitle();
		System.out.println("Page Title : "+pageTitle);
//		System.out.println("Page Title : "+driver.getTitle());
		
		String pageUrl = driver.getCurrentUrl();
		System.out.println("Page Url : "+pageUrl);
		
		Thread.sleep(3000);
		
//		driver.quit();
		driver.close();

	}

}
