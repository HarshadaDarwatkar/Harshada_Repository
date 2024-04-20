import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\AutomationSoftware\\FireFox\\geckodriver.exe");
		
		WebDriver d = new FirefoxDriver();
		
		d.get("https://www.facebook.com/");
		d.manage().window().maximize()	;
		
		WebElement un = d.findElement(By.id("email"));
		
		WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(10));//here we set time for particular option like sumbit ,clixk check box ets
		wait.until(ExpectedConditions.visibilityOf(un));
	}

}
