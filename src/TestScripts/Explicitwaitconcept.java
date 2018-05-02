package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitconcept {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		//explicitly wait -> dynamically wait, if element appears in 5 seconds, it will be clicks instead of wait 20 seconds
		clickOn(driver, driver.findElement(By.xpath("//*[@id='u_0_2']")), 20); // login button
		
		
		//clickOn(driver, driver.findElement(By.xpath("//*[@id='reg_pages_msg']/a")), 1); //create a page link
		
		
		
	}
	
	//explicitly wait -> dynamically wait
	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		
		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(locator));
		
		locator.click();
		
	}
}
