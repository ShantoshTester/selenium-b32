package browseractions;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTest {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		String pageTitle = driver.getTitle();
		System.out.println("Page Title : "+pageTitle);
		
		String pageUrl = driver.getCurrentUrl();
		System.out.println("Page Url : "+pageUrl);
		
		driver.quit();

	}

}
