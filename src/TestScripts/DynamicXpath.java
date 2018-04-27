package TestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='uh-search-box']")).sendKeys("selenium");
		
		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(@id,'yui_3_18_')]/a"));
		System.out.println(list.size());
		System.out.println("test");
		list.get(0).click();
}
}
