import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstAutomationScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
ChromeOptions op = new ChromeOptions();
op.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver(op);
driver.get("https://www.google.com"); //to open the URL
driver.manage().window().maximize();// it show full screen
driver.manage().window().minimize();//it is minimize the window
String pagecode = driver.getPageSource();//it will provied source code of of partiquilar wed sid // go to web sid right click on the page see the view source code option
System.out.println(pagecode);
String title = driver.getTitle();
System.out.println(title);
String url = driver.getCurrentUrl();
System.out.println(url);
//driver.close();// for close the URL

	}
	

}
