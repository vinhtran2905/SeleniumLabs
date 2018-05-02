package TestScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {
	static WebDriver driver;
	public static void main(String [] args) throws IOException {
		Properties prop = new Properties();
		
		FileInputStream input = new FileInputStream("C:\\Users\\Sony\\eclipse-workspace\\selenium\\src\\TestScripts\\config.properties");
		
		prop.load(input);
		
		String url = prop.getProperty("url");
		String Name = prop.getProperty("name");
		String age = prop.getProperty("age");
//		Intege age_value = Integer.parseInt(age);
//		System.out.println(age_value + 1);
		System.out.println(url);
		
		System.out.println(prop.getProperty("url"));
		
		String browser = prop.getProperty("browser");
		
		
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("FF")) {
			driver = new FirefoxDriver();
		} else {
			driver = new InternetExplorerDriver();
		}
		
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
	}
}
