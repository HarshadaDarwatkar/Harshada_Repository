import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v108.browser.Browser;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class MultipleBrowserTesting {
	WebDriver driver;
	
  
  @Parameters("browser")// for taking multiple browser,need to import file
  @BeforeTest
  public void LaunchURL(String browser) {
	if(browser.equalsIgnoreCase("firefox"))
	{
		  System.setProperty("webdriver.gecko.driver", "C:\\MySoftware\\firefox\\geckodriver.exe");
		  driver = new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\MySoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(ops);
		 
	}
	driver.get("https://demo.guru99.com/test/facebook.html");
	driver.manage().window().maximize();
	  
  }
  
  @Test
  public void login_testcase() {
	  WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		
		username.sendKeys("harshada");
		password.sendKeys("jahav");
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.submit();
  }
  

 @AfterTest
 public void close()
 {
	 driver.close();
 }

}