package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXPath1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Angitha");

	}

}
