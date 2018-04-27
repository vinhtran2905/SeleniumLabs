package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateToGoogle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/");
		// driver.wait(30);
		driver.manage().window().maximize();
		// absolute xpath
		// driver.findElement(By.xpath("/html/body/nav[1]/div/a[2]")).click();

		// relative xpath
		//driver.findElement(By.xpath("//html//nav[@id='mySidenav']//a[10]")).click();

		// absolute xpath
		// driver.findElement(By.xpath("//*[@id="mySidenav"]/div/a[6]s")).click();
		//driver.findElement(By.xpath("//html//nav[@id='mySidenav']//a[text()='Learn Bootstrap 4']/preceding-sibling::a")).click();
		driver.findElement(By.xpath("//html//nav[@id='mySidenav']//a[text()='Learn Bootstrap 4']/following-sibling::a[2]")).click();
		
		//driver.close();	

	}
}
