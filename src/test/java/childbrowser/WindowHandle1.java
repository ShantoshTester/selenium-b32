package childbrowser;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/windows");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(3000);
		
		String parentWin = driver.getWindowHandle();
		System.out.println(parentWin);
		
		Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin);

	}

}
