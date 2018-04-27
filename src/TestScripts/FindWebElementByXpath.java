package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindWebElementByXpath {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com");
		driver.findElement(By.xpath("//a[@href='/html/default.asp'][contains(text(),'LEARN HTML')]"));
		// driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		
		driver.close();
	}
}
