import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\AutomationSoftware\\FireFox\\geckodriver.exe");
		
		WebDriver d = new FirefoxDriver();
		
		d.get("https://www.facebook.com/");
		d.manage().window().maximize()	;

		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//(depricated) here set time for all opration that writen after set the time means all down side opration are take 10 sec for exicution
		WebElement un = d.findElement(By.id("email"));
		Actions a = new Actions(d);
		
		a.click(un).keyDown(un, Keys.SHIFT).sendKeys("Harshada").
		doubleClick().contextClick();
		
		a.perform();
		
	}
 
}
