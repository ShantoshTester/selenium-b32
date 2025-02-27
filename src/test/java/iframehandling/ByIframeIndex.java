package iframehandling;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByIframeIndex {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///D:/ALLNOTES_CHECK/HTML/IframeEx.html");
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='header__humburger']")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Click Here to Navigate to Google")).click();

	}

}
