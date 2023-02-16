package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidUsername {

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
		username.sendKeys("abc");
		System.out.println("invalid username entered");
		
		WebElement continu = driver.findElement(By.xpath("//input[@id='continue']"));
		continu.click();
		System.out.println("clicked on continue button");
		
		String expectedPopupMessage1="There was a problem";
		String actualPopupMessage1=driver.findElement(By.xpath("//h4[text()='There was a problem']")).getText();
	
		String expectedPopupMessage2="We cannot find an account with that email address";
		String actualPopupMessage2=driver.findElement(By.xpath("//span[contains(text(),'We cannot find an account with that email address')]")).getText();
		
		if((expectedPopupMessage1.equals(actualPopupMessage1))  && (expectedPopupMessage2.equals(actualPopupMessage2)))
		{
			System.out.println("invalid username test case is passed");
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
