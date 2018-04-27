package TestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> list = driver.findElements(By.tagName("iFrame"));
		
		driver.switchTo().frame(0);
		
		WebElement slider = driver.findElement(By.xpath(".//*[@id='slider']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(slider).dragAndDropBy(slider, 150,0).build().perform();
		

	}

}
