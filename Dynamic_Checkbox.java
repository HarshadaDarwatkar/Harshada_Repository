import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dynamic_Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);
		
		List<WebElement> checkboxes =y.FindEliments(By.xath());
		System.out.println(checkboxes);
		int size = checkboxes.size();
		for(int i=0;i<size;i++)
		{
			String value = checkboxes.get(i).getAttribute("Type");
			System.out.println(value);
			if(value.equalsIgnoreCase("cricket"))
			{
				checkboxes.get(i).click();
			}
		}
		
	}

}
