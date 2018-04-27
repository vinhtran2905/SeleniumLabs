package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementByCSSSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://w3schools.com");
		//driver.findElement(By.className("w3-button")).click();
		//
		//driver.findElement(By.linkText("LEARN SQL")).click();
		//driver.findElement(By.name("search")).sendKeys("search by name");
		//driver.findElement(By.partialLinkText("SQL")).click();
		
//		List<WebElement> list = driver.findElements(By.tagName("a"));
//		System.out.println(list.size());
//		
//		
//		for(int i = 0; i <list.size();i++) {
//			//System.out.println(list.get(i).getText());
//			if (list.get(i).getText().equals("ABOUT")) {
//				list.get(i).click();
//				break;
//			}
//		}
		
//		List<WebElement> list = driver.findElements(By.className("w3-button"));
//		
//		for(int i = 0; i <list.size();i++) {
//		//System.out.println(list.get(i).getText());
//		if (list.get(i).getText().equals("LEARN BOOTSTRAP")) {
//			list.get(i).click();
//			break;
//		}
//	}
//		
		
		//element is not visible
		//driver.findElement(By.className("w3-bar-item w3-button")).click();
		
		//driver.findElement(By.id("navbtn_examples")).click();
		//driver.findElement(By.name("search")).sendKeys("search by name");
		
		
		//driver.findElement(By.xpath("//a[starts-with(text(),'Learn Boots')]")).click();
		
		//driver.findElement(By.xpath("//a[contains(text(),'arn I')]")).click();
		
		//driver.findElement(By.xpath("//html//nav[@id='mySidenav']//a[3]")).click();
		//driver.findElement(By.xpath("//html//nav[@id='mySidenav']//a[last()]")).click();
		//driver.findElement(By.xpath("//html//nav[@id='mySidenav']//a[last()-1]")).click();
//		driver.findElement(By.xpath("//html//nav[@id='mySidenav']//a[first()]")).click();
		driver.findElement(By.xpath("//html//nav[@id='mySidenav']//a[position()+1]")).click();
//		driver.manage().window().maximize();
//		driver.close();
		
	}

}
