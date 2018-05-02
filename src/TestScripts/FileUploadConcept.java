package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadConcept {
	public static void main(String[] args) {
		//1.Alert pop up - Java script pop up  - using Alert APT (accept, dismiss)
		//2. File upload pop up  -- using type = file, sendKeys(path)
		//3. Browser window pop up -- using WindowHandler API - getWindowHandles()
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		
		driver.get("https://html.com/input-type-file/");
		
		//Windows type  pop up
		//type = "file should be present for browse / atttach file /uploadfile buttons
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\Sony\\Download\\upload.txt");
		
		
		
		
		
	}
}
