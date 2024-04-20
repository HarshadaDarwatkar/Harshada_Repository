import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

import org.openqa.selenium.TakesScreenshot;
import java.io.*;
import org.openqa.selenium.OutputType;

public class screenshrt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","D:\\AutomationSoftware\\FireFox\\geckodriver.exe");
		
		WebDriver d = new FirefoxDriver();
		
		d.get("https://demo.guru99.com/v4/index.php");
		d.manage().window().maximize()	;
		
		//first we creating reference of takescreenshort interface
		TakesScreenshot ts =(TakesScreenshot)d;
		
		// calling getscreenshorts method t create image
		File srcFile = ts.getScreenshotAs(OutputType.FILE); // getscreenshortAs return file frmat
		
		//hoow the file into new destinatiion folder
		File destFile = new File("C:\\automationImages\\imagesscreenshot\\errr.png");
		//we will copy the screenshrt n destination fie
		Files.copy(srcFile, destFile);
		
		
		
		
	}

}
