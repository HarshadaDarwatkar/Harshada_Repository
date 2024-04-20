import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Handlling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","D:\\AutomationSoftware\\FireFox\\geckodriver.exe");
		
		WebDriver d = new FirefoxDriver();
		
		d.get("https://www.facebook.com/");
		d.manage().window().maximize()	;
		
		WebElement un = d.findElement(By.name("email"));
		
		Actions ac = new Actions(d);
		ac.keyDown(un, Keys.SHIFT).sendKeys("harshada");// we write in small but using SHIFT key it will take capital
		ac.keyDown(Keys.ENTER); // click on ententer button of keybord
		ac.perform();
		
		
	}

}
