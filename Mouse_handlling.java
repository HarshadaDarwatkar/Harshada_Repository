import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_handlling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(op);
		
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize()	;
		WebElement flights = d.findElement(By.linkText("Flights"));
		
		Actions action = new Actions(d) ; // whenevr we perform mouse or keybord o[reation we should first take the action class
		//action.clickAndHold(flights).release();
		//action.perform();
	//========================================================
	//context click
		action.clickAndHold(flights).contextClick();// right click on given area like flight
		//action.contextClick();// it right click on your mouse location
		action.perform();
		
		//=====================================================
	
	}
	

}
