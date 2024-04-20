import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dselect_Unselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\AutomationSoftware\\FireFox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://output.jsbin.com/osebed/2");
		driver.manage().window().maximize()	;
		
		WebElement fruites = driver.findElement(By.id("fruits"));
		
		Select list = new Select(fruites);
		//list.selectByVisibleText("Orange");
		//list.deselectByVisibleText("Orange");
		
		//list.selectByIndex(3);
		//list.deselectByIndex(3);
		
		//list.selectByValue("banana");
		//list.deselectByValue("banana");
		
		// validate that multiple value selection is allowed or not
		if(list.isMultiple())
		{
			list.selectByIndex(3);
			list.selectByValue("banana");
			list.selectByVisibleText("Orange");
		}
		list.deselectAll();
	}

}
