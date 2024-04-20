import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeybord_Both_AllinOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(op);
		
		d.get("https://www.facebook.com/");
		d.manage().window().maximize()	;
		
		WebElement mk = d.findElement(By.name("email"));
		
		Actions ac = new Actions(d);
		ac.keyDown(mk, Keys.SHIFT).sendKeys("harshada");// we write in small but using SHIFT key it will take capital
		ac.doubleClick().contextClick();
		
		ac.perform();
		
	}

}
