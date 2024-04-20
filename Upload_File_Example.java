import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Upload_File_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(op);
		
		d.get("https://demo.guru99.com/test/upload/");
		d.manage().window().maximize()	;
		
		WebElement chooseFile = d.findElement(By.id("uploadfile_0"));
		chooseFile.sendKeys("C:\\Users\\Admin\\Downloads"); //taking path from any file in file folder of PC
		
		WebElement checkbox = d.findElement(By.id("terms"));
		checkbox.click();
		
		WebElement sumbmit = d.findElement(By.name("send"));
		sumbmit.click();
	}
	

}
