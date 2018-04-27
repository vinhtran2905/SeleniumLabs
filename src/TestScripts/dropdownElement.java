package TestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import okio.Options;

public class dropdownElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='signin_info']/a[1]")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[7]/a")).click();
		
		WebElement dropdown = driver.findElement(By.xpath(".//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		
		
		List< WebElement> options = dropdown.findElements(By.tagName("option"));
//		System.out.println(options.size());
		
		for(WebElement e: options) {
			if (e.getAttribute("value").equals("25")) {
				e.click();
			}
		}
		
	
		
	
		
		
		
		
		
		
		

	}

}
