package childbrowser;

import java.time.Duration;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/windows");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(3000);
		
		Iterator<String> win = driver.getWindowHandles().iterator();
		String parent = win.next();
		String child = win.next();
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.quit();
		

	}

}
