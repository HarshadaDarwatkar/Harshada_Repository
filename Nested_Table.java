import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Nested_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(op);
		
		d.get("https://demo.guru99.com/test/accessing-nested-table.html");
		d.manage().window().maximize()	;
		
		WebElement innertable = d.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[1]"));
		// write tr(row)and td(column) manualy
		System.out.println("Nested table data is"+"\t"+ innertable.getText());
	}

}
