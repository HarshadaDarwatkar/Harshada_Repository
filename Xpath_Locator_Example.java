import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath_Locator_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver r= new ChromeDriver(op);
		
		r.get("https://demo.guru99.com/test/facebook.html");
		r.manage().window().maximize()	;
		//1. by using simple tag, inspect-rightclick on code highlighted code-copy-copeyXpath-past on xpath query option to verify query
		//WebElement username = r.findElement(By.xpath("//*[@id='email']"));// take email in single envererted comma
		//WebElement username = r.findElement(By.xpath("//input[@id='email']"));
		//WebElement username = r.findElement(By.xpath("//input[@name='email']"));
		//WebElement username = r.findElement(By.xpath("//input[@class='inputtext']"));
		//username.sendKeys("Harshada");
		
		//2. by using contains, inspec and write code on xpath query what we want id,name,type etc
		//WebElement password = r.findElement(By.xpath("//*[contains(@id,'pass')]"));
		//WebElement password = r.findElement(By.xpath("//*[contains(@name,'pass')]"));
	//	WebElement password = r.findElement(By.xpath("//*[contains(@type,'password')]"));
		//WebElement password = r.findElement(By.xpath("//*[@class='inputtext']"));
		//password.sendKeys("Siddharsh");
		
		//3.using or condition , it will check either first or second condition is true or not
		//WebElement login = r.findElement(By.xpath("//*[@type='submit' or @id='u_0_b']"));
		
		//4.using and condition,it will check both condition is true
		//WebElement login1 = r.findElement(By.xpath("//*[@type='submit' and @id='u_0_b']"));
		
		//login1.click();
		 
		// 5. using starts with sysntax
		WebElement username = r.findElement(By.xpath("//input[starts-with(@id,'em')]"));
		WebElement password = r.findElement(By.xpath("//*[starts-with(@id,'pass')]"));
		username.sendKeys("Harshada");
		password.sendKeys("Rachana");
		
		//6. usingtext() Method
		WebElement keep = r.findElement(By.xpath("//*[text() = 'Keep me logged in']"));
		keep.click();
		
		
		
		
		
	}

}
