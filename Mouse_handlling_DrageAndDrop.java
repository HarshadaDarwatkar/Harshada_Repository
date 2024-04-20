import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_handlling_DrageAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\AutomationSoftware\\FireFox\\geckodriver.exe");
		
		WebDriver d = new FirefoxDriver();	
		
		d.get("https://demoqa.com/droppable/");
		d.manage().window().maximize()	;
		
		WebElement dragg = d.findElement(By.xpath("//*[@id=\"draggable\"]"));
		
		WebElement drop = d.findElement(By.xpath("//*[@id=\"droppable\"]"));
		 Actions a = new Actions(d);
		  a.dragAndDrop(dragg, drop);
		  a.perform();
		 
		 
	}

}
