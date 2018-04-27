package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Encode_decodepassword {

	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new InternetExplorerDriver();
		
		
		driver.get("http://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				

		driver.findElement(By.xpath(".//*[@id='signin_info']")).click();
		
		driver.findElement(By.xpath(".//*[@id='login1']")).sendKeys("username");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("password");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
