package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctinality 
{
	public static void main (String[]args) throws Exception
	{
	System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser opened");
		driver.get("https://www.facebook.com/");
		System.out.println("Url opened");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("prasadpawar248@gmail.com");
		System.out.println("Email id entered");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Fprasad248@");
		System.out.println("password entered");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		System.out.println("clicked on login button");
		System.out.println(driver.getTitle());
		
//		driver.switchTo().alert();
//		driver.switchTo().alert().dismiss();
		Thread.sleep(4000);
		WebElement like=driver.findElement(By.xpath("//a[@aria-label='Watch']"));
		like.click();
		//driver.close();
		System.out.println("Browser closed");
		System.out.println("End of the program");

	}

}
