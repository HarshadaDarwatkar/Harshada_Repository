import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Download_File_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);
		
		driver.get("https://demo.guru99.com/test/yahoo.html");
		driver.manage().window().maximize()	;
		
		WebElement downlod = driver.findElement(By.id("messenger-download"));
		String sourceLocation = downlod.getAttribute("href");// getattribute use for taking value of partucular tag taking tag "href" from ispectod download
		
		String command ="cmd /c D:\\AutomationSoftware\\wget.exe -P C:\\Users\\Admin\\Documents\\Downlodfileexample --no--check-certificate " + sourceLocation;
	//comandline for download file==taking path of wget file in filemanager in Pc==after-P we take pathe of where we store the downloadede file == certifacation mathed use to protection fromany virus or if any certiffication popoup is apper the not accept this
		
		try
		{
			Process exec = Runtime.getRuntime().exec(command); // this code use to exicute comand line code in java(depricated)
			
		}
		catch(Exception e)
		{
			
		}
	}

}
