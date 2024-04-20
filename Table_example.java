import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Table_example {

	private static final String List = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(op);
		
		d.get("https://demo.guru99.com/test/web-table-element.php");
		d.manage().window().maximize()	;
		
		//the xpath contain <thead > 
		java.util.List<WebElement> column = d.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));// tr and th take manualy 
		System.out.println("no of columns are"+"\t"+column.size());
		 // the xpath contain <tbody>
		java.util.List<WebElement> row = d.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]")); //tr and td take manualy
		System.out.println("no of rows are"+"\t"+row.size()); 
		
		WebElement row3 = d.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));// to fetch all 1 row data
		System.out.println("data of 3rd row is"+"\t"+row3.getText());
		
		WebElement cell = d.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));//to fetch particular cell data
		System.out.println("data of 3rd cell is"+"\t"+cell.getText());// getText()use for get output value in output window
		
	}

}
