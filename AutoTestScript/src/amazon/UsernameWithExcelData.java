package amazon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsernameWithExcelData {

	public static void main(String[] args) throws Exception {

		
		FileInputStream file =new FileInputStream("F:\\D\\Software testing\\My docs\\Selenium\\Excel_files\\AmazonUsernameData.xlsx"); 
		XSSFWorkbook worbook=new XSSFWorkbook(file);
		XSSFSheet sheet=worbook.getSheet("Sheet1");
		
		int row=sheet.getLastRowNum();
		int cell=sheet.getRow(0).getLastCellNum();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<cell;j++)
			{
				String Username=sheet.getRow(i).getCell(j).toString();
				
				System.setProperty("Webdriver.chrome.driver",
						"C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				System.out.println("Browser Opened");

				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				System.out.println("Url Opened");
				
				WebElement signInLink=driver.findElement(By.xpath("//a[contains(@class,'nav-a nav-a-2   nav-progressive-attribute')][1]"));
				signInLink.click();
				
				WebElement username=driver.findElement(By.xpath("//input[@id='ap_email']"));
				username.sendKeys(Username);
				
				boolean password=driver.findElement(By.xpath("//input[@id='ap_password']")).isDisplayed();
				
				if(password==true)
				{
					System.out.println("username is correct");
				}
				else
				{
					System.out.println("username is not correct");
				}
				
				driver.close();
				
			}
		}
		
		
		
		
		
	}

}
