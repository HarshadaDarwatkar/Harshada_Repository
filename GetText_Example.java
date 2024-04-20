import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetText_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(op);
		
		d.get("https://demo.guru99.com/test/facebook.html");
		d.manage().window().maximize()	;
		WebElement data = d.findElement(By.id("navbar-brand-centered"));
		String text = data.getText();// it gives all text or list of text of partiquiler area where we right click or inspect
		System.out.println(text);// output display on output window
	}

}
