import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlartExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","D:\\AutomationSoftware\\FireFox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize()	;
		//Simple alert example
		//WebElement AlertwithOk = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a"));
		//AlertwithOk.click();
		//WebElement buttontodispaly = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));

		//buttontodispaly.click();
		
		//switch to the alert, only one option ok or cancel
		
		//driver.switchTo().alert(); //accept popup by clicking the ok button on popup
		//driver.switchTo().alert().accept();
		
		//confirmation type alert, two option are there ok and cancel
		//WebElement AlertwithOkcancel = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		//AlertwithOkcancel.click();
		//WebElement buttontodispaly2 = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		//buttontodispaly2.click();
		
		//driver.switchTo().alert(); //accept popup by clicking the ok button on popup
		//driver.switchTo().alert().accept();// do not write

		//driver.switchTo().alert().dismiss();// for cancel the popup
		
		//Alert with prompt text box
		WebElement Alertwithtextbox = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		Alertwithtextbox.click();
		
		WebElement buttontodispaly3 = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		buttontodispaly3.click();
		driver.switchTo().alert();
		String text = driver.switchTo().alert().getText();// to get the text in the popup
		System.out.println(text);
		driver.switchTo().alert().sendKeys("Harshada");
		driver.switchTo().alert().accept();
		

	}

}
