import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ID_Locators_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize()	;
		WebElement username = driver.findElement(By.id("email"));//go to side right clickon the username colom select inspect
		WebElement userpassword = driver.findElement(By.id("pass"));// to take access
		
		username.sendKeys("jadhavharshada30598.com");// sendKey used to enter the value into the text box
		userpassword.sendKeys("Harsha");
		
		username.clear();// to delete the value of particular text box field
		userpassword.clear();
		//WebElement login = driver.findElement(By.id("loginbutton"));
		//login.submit();
	}

}
