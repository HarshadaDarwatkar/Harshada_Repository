import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);
	driver.navigate().to("https://www.amazon.in");// navigate we use to operate back or forward button
	driver.navigate().refresh()	;//for refresh
	driver.navigate().to("https://www.flipkart.com");
	driver.navigate().back(); // for go back
	driver.navigate().forward();//for go forward
//	driver.close();
//	}
	}
}
