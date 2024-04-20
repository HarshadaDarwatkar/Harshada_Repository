import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Iframe_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(op);
		
		d.get("https://demo.automationtesting.in/Frames.html");
		d.manage().window().maximize()	;
		
		d.switchTo().frame("singleframe"); // by using id
		//d.switchTo().frame(0);
		//d.switchTo().frame("SingleFrame");// by using name
		
		WebElement tx = d.findElement(By.xpath("/html/body/section/div/div/div/input"));
		tx.sendKeys("Harshada");
		d.switchTo().defaultContent();//it go back to the outside of iframe if we perform other opratin that are outside of i frame we should need to go outside of iframe first
		
		WebElement otherifream = d.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
		otherifream.click();
		
	}

}
