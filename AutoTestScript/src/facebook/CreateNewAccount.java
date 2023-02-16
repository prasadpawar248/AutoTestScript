package facebook;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount 
{
	public static void main(String[] args) throws Exception {
		
System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser opened");
		driver.get("https://www.facebook.com/");
		System.out.println("Url opened");
		driver.manage().window().maximize();
		
		WebElement create=driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]"));
		create.click();
		
		FileInputStream file=new FileInputStream("C:\\Users\\comp\\Desktop\\facebook.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int row=sheet.getLastRowNum();
		int cell=sheet.getRow(0).getLastCellNum();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<cell;j++)
			{
				XSSFRow r=sheet.getRow(i);
				
				WebElement username=driver.findElement(By.xpath("//input[@name='firstname']"));
				username.sendKeys(r.getCell(0).toString());
				
				WebElement surname=driver.findElement(By.xpath("//input[@name='lastname']"));
				surname.sendKeys(r.getCell(1).toString());
				
				WebElement email=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
				email.sendKeys(r.getCell(2).toString());
				
				WebElement reEmail=driver.findElement(By.xpath("(//input[@type='text'])[5]"));
				reEmail.sendKeys(r.getCell(3).toString());
				
				WebElement password=driver.findElement(By.xpath("(//input[@type='password'])[2]"));
				password.sendKeys(r.getCell(4).toString());
				
				WebElement day=driver.findElement(By.xpath("//select[@title='Day']"));
				Select d=new Select(day);
				d.selectByValue("24");
				
				WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
				Select m=new Select(month);
				d.selectByVisibleText("Aug");
				
				WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
				Select y=new Select(year);
				y.selectByVisibleText("1994");
				
				WebElement maleRadioBtn=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
				maleRadioBtn.click();
				
				WebElement signUpBtn=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
				signUpBtn.click();
				
				
				
			}
		}
	}

}
