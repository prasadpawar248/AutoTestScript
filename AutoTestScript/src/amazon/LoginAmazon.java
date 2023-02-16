package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAmazon 
{
	public static void main(String[]arg)
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser Opened");
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("Url Opened");
		
		WebElement loginlink=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		loginlink.click();
		System.out.println("Clicked on login link");
		WebElement email=driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("prasadpawar248@gmail.com");
		System.out.println("email entered in email textbox");
		WebElement continueButton=driver.findElement(By.xpath("//input[@id='continue']"));
		continueButton.click();
		System.out.println("Clicked on continue button");
		WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("Aprasad248@");
		System.out.println("password entered in password textbox");
		WebElement signIn=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signIn.click();
		System.out.println("sign in done successfuly");
		
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle=driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("login test case passed");
		}
		else
		{
			System.out.println("login test case is failed");
		}
		
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung a53");
		System.out.println("Product entered in search box");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		System.out.println("clicked on search button");
		driver.findElement(By.xpath("//span[text()='Samsung Galaxy A53 Black, 8GB RAM, 128GB Storage']")).click();
		System.out.println("clicked on product");
		
		driver.navigate().to("https://www.amazon.in/Samsung-Galaxy-Black-128GB-Storage/dp/B09VGJGZS1/ref=sr_1_2?keywords=samsung%2Ba53&qid=1674544223&sr=8-2&th=1");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		System.out.println("product added to cart");
//		driver.quit();
		System.out.println("browser closed");
		
		System.out.println("End of the program");
	}
	

}
