package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();// delete all cookies
		//driver.manage().window().maximize();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.freecrm.com/");
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		//switch to frame contains 'contact' menu
		
//		sver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		//driver.quit();
	}
}
