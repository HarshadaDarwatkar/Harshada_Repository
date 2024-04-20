import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class All_Locator_HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","D:\\AutomationSoftware\\FireFox\\geckodriver.exe");
		
		WebDriver d = new FirefoxDriver();
		
		d.get("https://www.facebook.com/campaign/landing.php");
		d.manage().window().maximize()	;
		WebElement Firstname = d.findElement(By.id("u_0_b_HN"));//go to side right clickon the username colom select inspect
		WebElement Surname = d.findElement(By.id("u_0_d_65"));//we use by.id bcz inputtext is same to password also compiler take same username and password
	WebElement MobileNo = d.findElement(By.id("u_0_g_aC"));
	WebElement SignUp = d.findElement(By.className("websubmit"));
		Firstname.sendKeys("harsha");
	Surname.sendKeys("harsha");
MobileNo.sendKeys("98989");
SignUp.click();



	}

}
