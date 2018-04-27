package TestScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("proceed")).click();
		
		//pop up appears, action: get text of pop up and click button OK
		
		//switch from screen to pop up window
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(5000);
		System.out.println(alert.getText());
		
		
		//validate to content of alert
		
		String text = alert.getText();
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct alert message");
			
		}
		else {
			System.out.println("Incorrect alert message");
		}
		
		
		alert.accept(); // click on OK button
		//alert.dismiss();//click on Cancel button
	}
}
