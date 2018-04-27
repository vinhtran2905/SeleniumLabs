package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(
				By.xpath("//a[@href='https://mail.rediff.com/cgi-bin/login.cgi'][contains(text(),'Sign in')]")).click();

		// find element by XPath //input[@id='login']
		// driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("username");
		// driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");

		// find element by css selector with multiple properties
		// driver.findElement(By.xpath("//input[@id='login1' and
		// @name='login']")).sendKeys("multiple properies by xpath");

		// find element by CSS input[id='login']
		// driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("username");
		// driver.findElement(By.cssSelector("input[id='password']")).sendKeys("password");

		// find element by css selector with multiple properties
		// driver.findElement(By.cssSelector("input[id='login1'][name='login']")).sendKeys("multiple
		// properties by css selector");

		// find element by css selector by shortcut for id #login1
		// driver.findElement(By.cssSelector("#login1")).sendKeys(" by css selector
		// shortcut for id");

		// find element by css selector by start with character
		// driver.findElement(By.cssSelector("input[id^= 'log']")).sendKeys(" by css
		// selector id that start with logxxx");/

		// find element by css selector by contain with character xxxogin1xxx
		//driver.findElement(By.cssSelector("input[id*= 'ogin']"))
		//		.sendKeys(" by css selector id that contains with xxxoginxx");

		// find element with parent (div class and child div input by css seletor
		//		.sendKeys("parent and child css selector");
		
		// find element with shortcut for parent (div class) by using . and child (div input) by css seletor
//				driver.findElement(By.cssSelector("div.login-form div input[id='login1']"))
//						.sendKeys("parent and child css selector");
				
				
	}

}
