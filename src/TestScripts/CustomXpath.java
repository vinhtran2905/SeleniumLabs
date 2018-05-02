package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {
	public static void main(String [] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://ebay.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		
		
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("java");
		
		//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("java book");
		
		//driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("java 3");
		
		
		//id = test_123
		//driver.findElement(By.id("test_123")).sendKeys("java 4");
		//next time refresh page it generates dynamically a new id = test_456
		//we should use contains instead
		
		//driver.findElement(By.xpath("//input[contains(@id,'text_')]")).sendKeys("test");
		
		//driver.findElement(By.xpath("//input[start-with(@id,'test_')]")).sendKeys("test");
		
		//id = 1234_test_t
		//id = 23432_test_t
		//id == 4574_test_t
		
	//	driver.findElement(By.xpath("//input[end-with(@id,'test_t')]")).sendKeys("test_t");
		
		
		//for links
		//all the links are represented by a html tag
		driver.findElement(By.xpath("//a[contains(text(),'My eBay')]")).click();
		
}
}
