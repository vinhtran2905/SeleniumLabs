package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		// 1st method to navigate
//		driver.get("https://mail.rediff.com");
//		driver.manage().window().maximize();

		// 2nd method to navigate
		driver.navigate().to("https://mail.rediff.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='signin_info']")).click();

		
		Thread.sleep(5000);
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		//Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		driver.close();
	}

}
