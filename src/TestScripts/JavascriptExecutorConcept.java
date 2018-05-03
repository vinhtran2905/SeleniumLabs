package TestScripts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("naveenk");;
		driver.findElement(By.name("password")).sendKeys("test@1234");
		//driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		
		//I want to flash the button Login, we must to use Javascriptexecutor to execute javascript code
		
		flash(driver.findElement(By.xpath("//input[contains(@type,'submit')]")),driver);
		
		drawBorder(driver.findElement(By.xpath("//input[contains(@type,'submit')]")),driver);
		// take screenshot
		takeScreenshot(driver, "C:\\\\Users\\\\Sony\\\\eclipse-workspace\\\\selenium\\\\screenshot.png" );
		
		//generate an alert message
		//generateAlert(driver, "bug found");
		
		//click web element by javascript
		clickElementByJS(driver.findElement(By.xpath("//input[contains(@type,'submit')]")),driver);
		
		//refresh the page 
		//1. by using navigate refresh by selenium
		//driver.navigate().refresh(); 
		
		//2.by using java script
		refreshByJS(driver);
		
		//return title by JS
		System.out.println(getTitleByJS(driver));
		
		System.out.println(getPageInnerText(driver));
		
		//scroll page down
		//scrollPageDownByJS(driver);
		
		//scroll page until get element
		
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));
		
		scrollIntoView(element, driver);
	}
	
	//highlight a specific web element
	
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i <100 ; i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgcolor, element, driver);
		}
		
		
		
	}
	
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
		
	
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		
	}
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].style.border = '3px solid red'", element);
	}
	
	public static void takeScreenshot(WebDriver driver, String path) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		// copy the screenshot to desired location using copyFIle method
		
	    try {
			FileUtils.copyFile(src, new File(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//generate an alert by javascript
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("alert('" + message + "')");
	}
	
	
	public static void refreshByJS(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}
	//generate a 
	
	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	//
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		return js.executeScript("return document.title;").toString();
	}
	
	
	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	
	//very important-- scrolling up /down
	
	public static void scrollPageDownByJS(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	
	//keep scroll down until get text
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
}
