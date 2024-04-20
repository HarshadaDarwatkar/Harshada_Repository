import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class FirstTestNG {
	WebDriver driver;//here we diclear webdriver gobaly
	@BeforeTest
  public void beforeTest() {
		System.out.println("Befor test");
		System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(op);
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize()	;
  }
   
	@Test
   public void test_01() {
		System.out.println("At test");
		WebElement username = driver.findElement(By.id("email"));//go to side right clickon the username colom select inspect
		WebElement userpassword = driver.findElement(By.id("pass"));// to take access
		
		username.sendKeys("jadhavharshada30598.com");// sendKey used to enter the value into the text box
		userpassword.sendKeys("Harsha");
   }


  @AfterTest
  public void afterTest() {
	  System.out.println("After test");
	  driver.close();
  }

}
