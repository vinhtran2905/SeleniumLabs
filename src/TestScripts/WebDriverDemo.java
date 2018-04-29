package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverDemo {
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver","C:\\bin\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new InternetExplorerDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		if (title.equals("Google")) {
			System.out.println(true);
		}
		else {
			System.out.println("false");
		}
		
		driver.quit();
		
	}
}
