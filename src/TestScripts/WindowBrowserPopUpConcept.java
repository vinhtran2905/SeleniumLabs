package TestScripts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowBrowserPopUpConcept {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.popuptest.com/");

		driver.findElement(By.xpath("//a[contains(text(),'Modeless Window')]")).click();

		Set<String> windowHandle = driver.getWindowHandles();

		Iterator<String> it = windowHandle.iterator();
		
		String parentWindowID = it.next();
		System.out.println("Parent Window ID = " + parentWindowID);
		
		String childWindowID = it.next();
		
		System.out.println("child window id = " + childWindowID);
		
		driver.switchTo().window(childWindowID);
		
		System.out.println("title of child window: " + driver.getTitle());
		
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		
		System.out.println("parent title windows: " + driver.getTitle());
		
		
	}
}
