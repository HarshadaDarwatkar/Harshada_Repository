import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Name_Locators_Examsple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize()	;
		WebElement username = driver.findElement(By.name("email"));//go to side right clickon the username colom select inspect
		WebElement userpassword = driver.findElement(By.name("pass"));// to take access or take a locatpr
		
		username.sendKeys("jadhavharshada30598.com");// sendKey used to enter the value into the text box
		userpassword.sendKeys("Harsha");
		
		WebElement login = driver.findElement(By.id("loginbutton"));// name valu is not available thats why we take id
		login.submit();
	}

}
