package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPassword {

	public static void main(String[] args) throws Exception {

		System.setProperty("Webdriver.chrome.driver",
				"C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");

				
		
		WebDriver driver=new  ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement signInLink=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		signInLink.click();
		WebElement username=driver.findElement(By.xpath("//input[@id='ap_email']"));
		username.sendKeys("prasadpawar248@gmail.com");
		WebElement continu =driver.findElement(By.xpath("//input[@id='continue']"));
		continu.click();
		WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("abc@123");
		
		String enteredPassword=password.getAttribute("value");
		
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
	
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		Thread.sleep(2000);
//		password.clear();
		act.sendKeys(Keys.DELETE).perform();
		
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
	
		String copyPassword=password.getAttribute("value");
		
		if(enteredPassword.equals(copyPassword))
		{
			System.out.println("Copy password test case is failed");
		}
		else
		{
			System.out.println("Copy password test case is passed");
		}
	
	}
	

}
