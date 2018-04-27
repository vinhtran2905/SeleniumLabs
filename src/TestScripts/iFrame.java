package TestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		WebElement element = driver.findElement(By.xpath(".//*[@id='draggable']"));
//		System.out.println(element.getText());
		
		List<WebElement> list = driver.findElements(By.tagName("iFrame"));
		
		System.out.println(list.size());
		
		
		//1st method to switch frame/pop-up window
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.xpath(".//*[@id='draggable']"));
		System.out.println(element.getText());
		
		//this step to find web element outside the frame, we need to switch again
		
		
		driver.switchTo().defaultContent();
		WebElement pageElement = driver.findElement(By.xpath(".//*[@id='content']/h1"));
		System.out.println(pageElement.getText());
		
		//2nd method to switch frame
		WebElement frame = driver.findElement(By.xpath(".//*[@id='content']/iframe"));
		driver.switchTo().frame(frame);
		WebElement element1 = driver.findElement(By.xpath(".//*[@id='draggable']"));
		System.out.println(element1.getText());
		
		//3rd method
		
		//driver.switchTo().frame("")
		
		
	}

}
