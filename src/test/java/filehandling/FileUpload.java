package filehandling;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(3000);
		driver.findElement(By.id("file-upload")).sendKeys("D:\\ShantoshResume.docx");
		Thread.sleep(3000);
	}

}
