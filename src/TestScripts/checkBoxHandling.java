package TestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> checkboxes = driver.findElements(By.xpath(".//div[@class='display'][1]//input[@name='sports']"));
		
		for (WebElement e : checkboxes) {
			//check all checkbox
			//e.click(); 
			
			//choose 2 checkbox in 4 options
			
			if(e.getAttribute("value").equals("soccer")|| e.getAttribute("value").equals("baseball")) {
				e.click();
			}
		}
				

	}

}
