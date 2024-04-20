import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

class Harsha
{
	public void pappu()
	{
System.setProperty("webdriver.gecko.driver","D:\\AutomationSoftware\\FireFox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/link.html");
		driver.manage().window().maximize()	;
		WebElement link = driver.findElement(By.linkText("click here"));//go to side right clickon the username colom select inspect
		//WebElement link = driver.findElement(By.partialLinkText("here"));//it works same as linkText only we give half or partisl value 
		link.click();
		System.out.println("Hi sidharth Darwatkar");
	}
	
}
public class Link_Locator_ByUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Harsha o = new Harsha();
o.pappu();
	}

}
