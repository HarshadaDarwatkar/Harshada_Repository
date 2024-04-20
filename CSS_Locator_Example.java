import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CSS_Locator_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(op);
		
		d.get("https://demo.guru99.com/test/facebook.html");
		d.manage().window().maximize()	;
		
		//by using css locator tag class
				WebElement name = d.findElement(By.cssSelector("input.inputtext"));
				name.sendKeys("Harsha");
		//by ussing css locator by using tag and id
		WebElement password = d.findElement(By.cssSelector("input#pass"));
		password.sendKeys("Harsha");
	
		//by using tag and attribute for attribute we select any attribute like calss,type,id, tabindex,value
		WebElement login = d.findElement(By.cssSelector("input[type='submit']"));
		login.submit();
		
		//by using css locator tagclass+attribute
		//WebElement password = d.findElement(By.cssSelector("input.inputtext[type='password']"));
		//password.sendKeys("ttt");
	}

}
