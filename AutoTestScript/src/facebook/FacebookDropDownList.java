package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropDownList {
	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Browser Opened");
		driver.get("https://www.facebook.com/");
		System.out.println("URL Opened");
		driver.manage().window().maximize();

		WebElement createNewAccButton = driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]"));
		createNewAccButton.click();
		System.out.println("Clicked on create new button");
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		day.click();
		System.out.println("Clicked on Day DropDown box");
		Select date = new Select(day);
		date.selectByIndex(23);
		System.out.println("24 date is selected");

		Thread.sleep(3000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		month.click();
		System.out.println("Clicked on Month DropDown box");
		Select monthNum = new Select(month);
		monthNum.selectByValue("8");
		System.out.println("Aug month is selected");

		Thread.sleep(3000);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		year.click();
		System.out.println("Clicked on Year DropDown box");
		Select yearNum = new Select(year);
		yearNum.selectByVisibleText("1994");
		System.out.println("1994 year is selected");

		System.out.println("End of the Program");
	}

}
