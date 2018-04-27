package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		
		//Validation point
		if(title.equals("Google")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
		driver.quit();
		
	}
}
