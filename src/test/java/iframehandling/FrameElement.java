package iframehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameElement {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://seleniumautomationpractice.blogspot.com/2019/07/example-of-html-iframe-alternative.html");
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='ID_Frame1']"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.id("ts_first_name")).sendKeys("i am god! god is great");

	}

}
