package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidPassword {

	public static void main(String[] args) throws Exception {

		System.setProperty("Webdriver.chrome.driver",
				"C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Browser Opened");

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
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
		
		WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("Aprasad248@");
		System.out.println("Pasword entered");
		
		WebElement signInButton=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signInButton.click();
		System.out.println("clicked on signIn Button");
		
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle=driver.getTitle();
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Title verified and matched");
			System.out.println("Valid password testcase is passed");
		}
		else
		{
			System.out.println("Title verified and matched");
			System.out.println("Valid password testcase is failed");
		}
		Thread.sleep(2000);
		driver.close();
		System.out.println("browser is closed");
		System.out.println("End of the program");
	
	
	}
	

}
