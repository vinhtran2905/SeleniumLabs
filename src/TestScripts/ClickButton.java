package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickButton {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		//driver.findElement(By.xpath("//a[contains(text(),'Features')]")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	}
}
