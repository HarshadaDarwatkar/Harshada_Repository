import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\AutomationSoftware\\FireFox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize()	;
		
		
	WebElement countryList = driver.findElement(By.name("country"));
	Select countery  = new Select(countryList);//drop down  ,creating object first
	
	//countery.selectByIndex(5);// BY USING INDEX NO
	//countery.selectByValue("INDIA");// BY SELECTING VALUE FROM INSPECT
	countery.selectByVisibleText("ARUBA");// ACTUAL NAME THAT VISIBLE ON WEBSIDE WITHOUT INSPECTING
	}

}
