import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinkText__locator_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);
		
		driver.get("https://demo.guru99.com/test/link.html");
		driver.manage().window().maximize()	;
		//WebElement link = driver.findElement(By.linkText("click here"));//go to side right clickon the username colom select inspect
		WebElement link = driver.findElement(By.partialLinkText("here"));//it works same as linkText only we give half or partisl value 
		link.click();
		
	}

}
