package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/register/");

		// 1.isDisplayed method for all element

		boolean isDiplay = driver.findElement(By.id("submitButton")).isDisplayed(); //true

		System.out.println(isDiplay);
		
		//2. isEnabled method
		boolean isEnable = driver.findElement(By.id("submitButton")).isEnabled();// false
		System.out.println(isEnable);
		
		//select I agree checkbox
		//3. isSelected method applicable for checkbox, dropdown, radiobutton
		driver.findElement(By.name("agreeTerms")).click();
		boolean isSelect = driver.findElement(By.name("agreeTerms")).isSelected(); //true
		System.out.println(isSelect);
		
		
	}

}
