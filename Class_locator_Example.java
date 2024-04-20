import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Class_locator_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(op);
		
		d.get("https://demo.guru99.com/test/facebook.html");
		d.manage().window().maximize()	;
		WebElement name = d.findElement(By.className("inputtext"));//go to side right clickon the username colom select inspect
		WebElement password = d.findElement(By.id("pass"));//we use by.id bcz inputtext is same to password also compiler take same username and password
	name.sendKeys("harsha");
	password.sendKeys("harsha");
	name.clear();
	password.clear();
	WebElement login = d.findElement(By.tagName("label"));// we use TagNae locator it contain the valu of class ,name or id
	login.submit();
//	d.close();
	
	}

}
