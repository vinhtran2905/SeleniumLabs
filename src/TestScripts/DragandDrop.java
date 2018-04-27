package TestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
				driver.get("https://jqueryui.com/droppable/");
				
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			List<WebElement> frames = driver.findElements(By.tagName("iFrame"));
			
			
			driver.switchTo().frame(0);
			
			WebElement drag = driver.findElement(By.xpath(".//*[@id='draggable']"));
			
			WebElement drop = driver.findElement(By.xpath(".//*[@id='droppable']"));
			
			
			Actions action = new Actions(driver);
			
			action.moveToElement(drag).dragAndDrop(drag, drop).build().perform();
			
			
		    
			

	}

}
