package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selector {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");

//		// 1. by xpath by xpath
//		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Tran");
//		// by xpath
//		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("vinhtran2905@gmail.com");
//
//		driver.manage().window().maximize();
//		// 2. by id
//		driver.findElement(By.id("firstname")).sendKeys("Vinh");
//		
		
		//3. by name
		
		driver.findElement(By.name("firstname")).sendKeys("by Name");
		
		//by linktext
		//driver.findElement(By.linkText("User Agreement")).click();
		
		//by partial linktext -- not recommend to use
		
		//driver.findElement(By.partialLinkText("Agreement")).click();

		//by css selector
		driver.findElement(By.cssSelector("#firstname")).sendKeys("New name");
		driver.findElement(By.cssSelector("#lastname")).sendKeys("Last name");
		// driver.quit();
	}
}
