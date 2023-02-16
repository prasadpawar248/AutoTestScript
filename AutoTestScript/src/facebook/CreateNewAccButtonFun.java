package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewAccButtonFun 
{
	public static void main (String[]args) throws Exception
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser opened");
		driver.get("https://www.facebook.com/");
		System.out.println("Url opened");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		System.out.println("clicked on create new account button link");
		
//		Thread.sleep(3000);
//		String actualText=driver.findElement(By.xpath("//div[text()='Sign Up']")).getText();
//
//		if(actualText.contains("Sign Up"))
//		{
//			System.out.println("Create new account button test case is passed");
//		}
//		else
//		{
//			System.out.println("Create new account button test case is passed");
//		}
		
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("prasad");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("pawar");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("prasad@248gmail.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("prasad@248gmail.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("prasad@842");
		
		System.out.println("Browser closed");
		System.out.println("End of the program");
		

	}

}
