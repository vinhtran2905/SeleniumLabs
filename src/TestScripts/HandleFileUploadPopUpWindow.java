package TestScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUpWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		
		String homepage = driver.getWindowHandle();
		System.out.println(homepage);
//		driver.findElement(By.cssSelector(selector))
//		String mainWindow = driver.getWindowHandle();
		String childWindow= driver.getWindowHandle();
		
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		driver.close();
		
	
		//do not use click to handle windows pop up, use sendKeys instead
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\Sony\\Desktop\\alice.txt");
		driver.findElement(By.xpath("//input[@name='submit'")).click();
	}
}
