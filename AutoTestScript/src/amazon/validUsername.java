package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validUsername {

	public static void main(String[] args) throws Exception {

		System.setProperty("Webdriver.chrome.driver",
				"C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Browser Opened");

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("Url Opened");
		
		WebElement signInLink=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		signInLink.click();
		System.out.println("clicked on sign in link");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='ap_email']"));
		username.sendKeys("prasadpawar248@gmail.com");
		System.out.println("valid username entered");
		
		WebElement contineu=driver.findElement(By.xpath("//input[@id='continue']"));
		contineu.click();
		System.out.println("clicked on continue button");
		
		Boolean passwordTestbox = driver.findElement(By.xpath("//input[@id='ap_password']")).isDisplayed();
		
		System.out.println("Checked password Textbox is opened");
		
		String expectedUrl="https://www.amazon.in/ap/signin";
		String actualUrl=driver.getCurrentUrl();
	
		if((expectedUrl.equals(actualUrl))  && (passwordTestbox==true))
		{
			System.out.println("valid username test case is passed");
		}
		else
		{
			System.out.println("invalid username test case is failed");
		}
		System.out.println("test case verifivation is done");
		Thread.sleep(2000);
		driver.quit();
		System.out.println("browser is closed");
		System.out.println("End of the program");
	
	
	}
	

}
