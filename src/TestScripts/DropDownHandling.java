package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class DropDownHandling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		
		WebElement dropDown = driver.findElement(By.id("gh-cat"));
		//handling drop down
		
		Select select = new Select(dropDown);
		
		//select.selectByValue("550");
		select.selectByVisibleText("Cameras & Photo");
	}
}
