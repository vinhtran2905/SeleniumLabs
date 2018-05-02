package TestScripts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takeScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		//take screenshot and store as a file format
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		// copy the screenshot to desired location using copyFIle method
		
	    FileUtils.copyFile(src, new File("C:\\Users\\Sony\\eclipse-workspace\\selenium\\google.png")); 
	}
}
