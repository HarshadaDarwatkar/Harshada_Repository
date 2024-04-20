import java.util.Set;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Multiple_Windo_Handlling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(op);
		
		d.get("https://demo.automationtesting.in/Windows.html");
		d.manage().window().maximize()	;
		
		String mainWindow = d.getWindowHandle();
		WebElement multiwindow = d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		multiwindow.click();
		
		WebElement click = d.findElement(By.xpath("//*[@id=\"Multiple\"]/button"));
		click.click();
		
				Set<String> allWindow = d.getWindowHandles();
				Iterator<String> i = allWindow.iterator();
				while(i.hasNext())
				{
					String childWindow = i.next();
					//checking the opened window is not same as main window
					if(!mainWindow.equalsIgnoreCase(childWindow))
					{
						d.switchTo().window(childWindow);
						d.manage().window().maximize(); 
						if(d.getTitle().equalsIgnoreCase("Selenium"))
						{
							System.out.println(d.getTitle());
							WebElement project = d.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[5]/a/span"));
							project.click();
							d.close();
						}
						else
						{
							System.out.println(d.getTitle());
							WebElement image = d.findElement(By.xpath("//*[@id=\"enterimg\"]"));// for image we only take xpath
							image.click();// for image we only take click
							d.close();
						}					
					}
					
				}
				

		
	}

} 
