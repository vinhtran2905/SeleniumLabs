package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) {
		//in order to not launch web browser when running the test case, you should use htmlunitdriver
		//WebDriver driver = new ChromeDriver();
		
		//htmlunitdriver is not available in selenium 3.x version.  
		//htmlunitdriver  -- to use this concept we have to download htmlunitdriver jar file 
		//- advantages:
		// a. testing is hppening behind the scene -- no browser is lanuched
		// b. very fast -- execution of test cases very fast --> improve performance of test script
		// cdisadvantages ; not suitable for Actions class -- user actions such as mouse movement or double click, drag and drop c.
		//d. Ghost Driver or Headless browser : 2 ways: 
												//htmlunitdriver -java 
												// PhantomJS -- javascript
		WebDriver driver = new HtmlUnitDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/");
		
		
		System.out.println("Before login, title is === " + driver.getTitle());
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println("after login , title is ==== " + driver.getTitle());
		

	}

}
