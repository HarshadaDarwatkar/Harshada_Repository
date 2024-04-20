import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Single_Window_Hndle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(op);
		
		d.get("https://demo.automationtesting.in/Windows.html");
		d.manage().window().maximize()	;
			// TODO Auto-generated method stub
		
		// Store id of main window

		String mainWindow = d.getWindowHandle();
		//WebElement button = d.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));// sigle windo but more tabe
		//button.click();
		
		WebElement button = d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));// different single window
		button.click();
		WebElement click = d.findElement(By.xpath("//*[@id=\"Seperate\"]/button"));
		click.click();
		
		//after clicking on  button its storing all the opened windows, in windows handeling we use set method
		Set<String> allWindow = d.getWindowHandles();//Using Set method from collection freamwork bcz set method store uniqe value 
		Iterator<String> i = allWindow.iterator();// 
		while(i.hasNext())
		{
			String childWindow = i.next();
			//checking the opened window is not same as main window
			if (!mainWindow.equalsIgnoreCase(childWindow))
			{
			d.switchTo().window(childWindow);// in if body we write all operation of child window
			WebElement download = d.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span"));
			download.click();
			//d.close();//it close current window
			//d.quit();// it close all windows
			}
		}
			
	}

}
