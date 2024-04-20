import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","D:\\AutomationSoftware\\FireFox\\geckodriver.exe");
		
		WebDriver d = new FirefoxDriver();	
		
		
		d.get("https://demo.automationtesting.in/Register.html");
		d.manage().window().maximize()	;
		
		WebElement radioButton = d.findElement(By.xpath("//*[@type='radio' and @value='FeMale']"));
		if(radioButton.isDisplayed() &&! radioButton.isSelected())
		{
			radioButton.click();
		}
	}

}
