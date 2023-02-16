package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class blankUsername {

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
		
		WebElement continu = driver.findElement(By.xpath("//input[@id='continue']"));
		continu.click();
		System.out.println("clicked on continue button");
		
		String expectedValue="1px solid rgb(221, 0, 0)"; // here hex value need to convert in rgb.
		String actualValue=driver.findElement(By.xpath("//input[@id='ap_email']")).getCssValue("border");
		System.out.println(actualValue);
		String expectedPopupMessage="Enter your email or mobile phone number";
		String actualPopupMessage=driver.findElement(By.xpath("//div[contains(text(),'Enter your email or mobile phone number')]")).getText();
	
		if((expectedPopupMessage.equals(actualPopupMessage)) && (expectedValue.equals(actualValue)) )
		{
			System.out.println("Blank username test case is passed");
		}
		else
		{
			System.out.println("Blank username test case is failed");
		}
		
		System.out.println("test case verifivation is done");
		Thread.sleep(2000);
		driver.quit();
		System.out.println("browser is closed");
		System.out.println("End of the program");
	
	
	}
	

}
