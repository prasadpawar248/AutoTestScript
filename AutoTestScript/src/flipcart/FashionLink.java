package flipcart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FashionLink {

	public static void main(String[] args) throws Exception {

		System.setProperty("Webdriver.chrome.driver",
				"C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");

			
		WebDriver driver=new  ChromeDriver();
		System.out.println("Browser opened");
		
		driver.get("https://www.flipkart.com/");
		System.out.println("Url opened");
		
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		Thread.sleep(3000);
		WebElement login=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a"));
		act.moveToElement(login).click().perform();
		System.out.println("clicked on login button");
		
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		email.sendKeys("prasadpawar248@gmail.com");
		System.out.println("email entered in email textbox");
		
		Thread.sleep(3000);
		WebElement RequestOtp=driver.findElement(By.xpath("//button[text()='Request OTP']"));
		login.click();
		System.out.println("clicked on RequestOtp button");
		Thread.sleep(15000);
		
		WebElement fashionLink=driver.findElement(By.xpath("(//div[@class='eFQ30H'])[3]"));
		
		act.moveToElement(fashionLink).build().perform();
		System.out.println("Mouse hovered on fashion link");
		Thread.sleep(3000);
		
		WebElement mensTopWear=driver.findElement(By.xpath("(//a[contains(text(),'Men')])[1]"));
		act.moveToElement(mensTopWear).build().perform();
		System.out.println("Mouse hovered on mensTopWear link");
		Thread.sleep(3000);
		
		WebElement mensKurtas=driver.findElement(By.xpath("(//a[contains(text(),'Men')])[4]"));
		mensKurtas.click();
		System.out.println("clicked on mensTopWear link");
		
		driver.close();
		System.out.println("Browser closed");
		System.out.println("End of the program");
		
	}
	

}
