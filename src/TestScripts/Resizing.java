package TestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://jqueryui.com/resizable/");

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

List<WebElement> list = driver.findElements(By.tagName("iFrame"));

driver.switchTo().frame(0);

WebElement resize = driver.findElement(By.xpath(".//*[@id='resizable']"));

System.out.println(resize.getText());

//new Actions(driver).dragAndDropBy(resize, 200, 10).build().perform();
Actions action = new Actions(driver);

action.clickAndHold(resize).moveByOffset(80, 80).release().build().perform();


	}

}
