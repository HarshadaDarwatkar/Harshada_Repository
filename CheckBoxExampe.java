import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBoxExampe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver r= new ChromeDriver(op);
		
		r.get("https://artoftesting.com/samplesiteforselenium");
		r.manage().window().maximize()	;	// TODO Auto-generated method stub
		
		WebElement checkbox1 = r.findElement(By.xpath("//*[@id=\"commonWebElements\"]/form[2]/input[1]"));
	//	if(checkbox1.isDisplayed()&& checkbox1.isEnabled())
		//{
		
		//checkbox1.click();
		//}
		WebElement checkbox2 = r.findElement(By.xpath("//*[@id=\"commonWebElements\"]/form[2]/input[2]"));
		//if(checkbox2.isDisplayed()&& checkbox2.isEnabled())
	//	{
		//checkbox2.click();
		//}

		//WebElement checkbox3 = r.findElement(By.id("hobbies-checkbox-3"));
		//checkbox3.click();
		if(checkbox1.isSelected() && checkbox2.isSelected())//isSelected is check wether the checkbox is alreadys selected or not
		{
			System.out.println("Checkbox is already selected");
		}
		else
		{
			checkbox1.click();
			checkbox2.click();
		}

		if(checkbox1.isSelected() && checkbox2.isSelected())// in first if else the checkbox is selected here we again check the checkbox is selected but it is selected in the first if else thats why the print output in output screen
		{
			System.out.println("Checkbox is already selected");
		}
		else
		{
			checkbox1.click();
			checkbox2.click();
		}

	}

}
