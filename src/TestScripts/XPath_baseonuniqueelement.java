package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_baseonuniqueelement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[@href='/bootstrap4/default.asp'][contains(text(),'Learn Bootstrap 4')]/preceding-sibling::a[1]"))
		//.click();
		//driver.findElement(By.xpath("//a[@href='/bootstrap4/default.asp'][contains(text(),'Learn Bootstrap 4')]"))
		//	.click();
		//driver.findElement(By.xpath("//a[@href='/bootstrap4/default.asp'][contains(text(),'Learn Bootstrap 4')]/following-sibling::a[1]"))
		//.click();
		
		
		//selet the parent
		driver.findElement(By.xpath("//a[@href='/bootstrap4/default.asp'][contains(text(),'Learn Bootstrap 4')]/parent::div[1]"))
				.click();
		driver.close();
	}
}
