package TestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementConcept {
	public static void main(String[] args) {
		//how many links in a web page
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		//get the total count of links on the page
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		System.out.println(linkList.size());
		
		//how many button are there
		
		List<WebElement> buttonList = driver.findElements(By.tagName("Button"));
		System.out.println(buttonList.size());
		
		
		
		
		//get the text of each link on the page
		for (WebElement e:linkList) {
			System.out.println(e.getText());
			
		}
		
	}
}
