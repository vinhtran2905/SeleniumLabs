package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class l23_DriverCloseQuit {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com");
		driver.manage().window().maximize();
		//this will open a new window for login
		//driver.findElement(By.xpath("//a[@id='loginsubmit']")).click();
		
		driver.findElement(By.cssSelector("id='loginsubmit'")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.close(); //close the browser which is currently focused, close the h wdfc.com window
		
		driver.quit(); // close all browsers opened by driver and destroy driver object

	}

}
