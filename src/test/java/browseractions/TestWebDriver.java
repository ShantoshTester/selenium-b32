package browseractions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWebDriver {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		
		System.out.println("Executing Test Case Using Chrome Browser");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		System.out.println("Page Title : "+driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
		
		System.out.println("Executing Test Case Using Firefox Browser");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Page Title : "+driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
		
		System.out.println("Executing Test Case Using MSEdge Browser");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.walmart.com/");
		System.out.println("Page Title : "+driver.getTitle());
		Thread.sleep(3000);
		driver.quit();

	}

}
