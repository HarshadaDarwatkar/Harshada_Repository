import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HomeWork_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize()	;
		
		WebElement name = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		name.sendKeys("Harshada");
		WebElement Lastname = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
		Lastname.sendKeys("Drwatkar");
		WebElement address =driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
		address.sendKeys("Koregaon Park");
		WebElement Email = driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
		Email.sendKeys("jadhavharshada30598@gmail.com");
		WebElement phone = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
		phone.sendKeys("9890456705");
		
		WebElement radioButton = driver.findElement(By.xpath("//*[@type='radio' and @value='FeMale']"));
		if(radioButton.isDisplayed() &&! radioButton.isSelected())
		{
			radioButton.click();
		}
		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id='checkbox1']"));
		//if(checkbox1.isDisplayed()&&! checkbox1.isEnabled())
	{
			checkbox1.click();

		}
		//WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[6]/div/div[2]/label"));
	//	if(checkbox2.isDisplayed()&& checkbox2.isEnabled())
		//{
		//	checkbox2.click();

		//}
		//if(checkbox1.isSelected() && checkbox2.isSelected())//isSelected is check wether the checkbox is alreadys selected or not
		//{
			//System.out.println("Checkbox is already selected");
	//	}
	//	else
		////{
			//checkbox1.click();
		////	checkbox2.click();
		//}

		WebElement skill = driver.findElement(By.id("Skills"));
		Select sk  = new Select(skill);//drop down  ,creating object first

			sk.selectByValue("C++");
			
			WebElement year = driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
			Select yr  = new Select(year);
			yr.selectByVisibleText("1998");
			
			WebElement month = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
			Select mo  = new Select(month);
			mo.selectByVisibleText("May");
			
			WebElement date = driver.findElement(By.xpath("//*[@id=\"daybox\"]"));
			Select da  = new Select(date);
			da.selectByVisibleText("30");
			
			WebElement password = driver.findElement(By.id("firstpassword"));
			password.sendKeys("pappu");
			
			WebElement confpassword = driver.findElement(By.xpath("//*[@id=\"secondpassword\"]"));
			confpassword.sendKeys("pappu");
			
			WebElement submit = driver.findElement(By.id("submitbtn"));
			submit.click();
			//WebElement refresh = driver.findElement(By.id("Button1"));
			//refresh.click();
			
			
			

	}

}
