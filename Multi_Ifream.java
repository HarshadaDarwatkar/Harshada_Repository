import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Multi_Ifream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(op);
		
		d.get("https://demo.automationtesting.in/Frames.html");
		d.manage().window().maximize()	;
		
		WebElement click = d.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
		click.click();//second ifream button
		
		int size = d.findElements(By.tagName("ifream")).size();//to find total number of ifream are on scerrn or web page
		System.out.println("Toatal ifream"+"\t"+size);
		
		d.switchTo().frame(1);// for switch to next fream
		int size1 = d.findElements(By.tagName("ifream")).size();//to see howmuch ifream is present inside of nested ifream
		System.out.println("inside ifream size of Nested ifream "+"\t"+size1);
		
		d.switchTo().frame(0);
		WebElement text = d.findElement(By.xpath("/html/body/section/div/div/div/input"));
		text.sendKeys("Siddharth");
		
		
		
		
		
		
				
		
	}

}
