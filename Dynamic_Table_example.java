import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dynamic_Table_example {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","D:\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
				ChromeOptions op = new ChromeOptions();
				op.addArguments("--remote-allow-origins=*");
				WebDriver d = new ChromeDriver(op);
				
				d.get("https://demo.guru99.com/test/table.html");
				d.manage().window().maximize()	;
				
				WebElement table = d.findElement(By.xpath("/html/body/table/tbody"));
				List<WebElement> rows = (List<WebElement>) table.findElements(By.tagName("tr"));
				System.out.println("no of rows are"+ "\t"+rows.size());
				
				for(int i=0;i<rows.size();i++)
				{
					List<WebElement> cell_data = rows.get(i).findElements(By.tagName("td"));
					System.out.println("no of cell in rows are "+"\t"+cell_data.size());
					for(int j=0;j<cell_data.size();j++)
					{
						String text = cell_data.get(j).getText();
						System.out.println("Cell value of row number"+"\t"+i+"and coumn number"+"\t"+j+"is"+"\t"+text);
					}
				}
				
	}

}
