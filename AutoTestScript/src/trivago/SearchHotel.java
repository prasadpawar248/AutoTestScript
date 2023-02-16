package trivago;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver",
				"C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Browser opened");
		driver.get("https://www.trivago.in/");
		System.out.println("URL opened");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement currency = driver.findElement(By.xpath("//select[@id='currency-selector']"));
		Select sc = new Select(currency);
		sc.selectByValue("USD");
		System.out.println("selected USD Currency");
		
		WebElement search = driver.findElement(By.xpath("//input[@id='input-auto-complete']"));
		search.sendKeys("mumbai");
		System.out.println("entered mumbai location");
		
		WebElement checkIn = driver.findElement(By.xpath("//button[@data-testid='calendar-checkin']"));
		checkIn.click();
		System.out.println("clicked on checkIn");
		
		WebElement monthYearCheckIn = driver.findElement(By.xpath("//button[text()='February 2023']"));
		String monthYearEle1 = monthYearCheckIn.getText();
		
		while (true) {
			if (monthYearEle1.equals("February 2023")) {
				break;
			} else {
				driver.findElement(By.xpath("(//span[@class='inline-flex leading-none transform'])[2]")).click();
			}
		}

		List<WebElement> dates = driver.findElements(By.xpath("//table//tbody//tr//td"));
		for (WebElement singleDate : dates) {
			if (singleDate.getText().equals("16")) {
				singleDate.click();
				break;
			}
		}

//WebElement checkOut=driver.findElement(By.xpath("//button[@data-testid='calendar-checkout']"));
//checkOut.click();

//		WebElement monthYearCheckOut = driver.findElement(By.xpath("//strong[text()='February 2023']"));
//		String monthYearEle2 = monthYearCheckOut.getText();

		for (WebElement singleDate : dates) {
			if (singleDate.getText().equals("23")) {
				singleDate.click();
				break;
			}
		}
		
//		WebElement guest = driver.findElement(By.xpath("//button[@data-testid='guest-selector']"));
//		guest.click();
//		System.out.println("clicked on guest tab");
//		WebElement adult = driver.findElement(By.xpath("(//input[contains(@id,'number-input')])[1]"));
//		adult.clear();
//		adult.sendKeys("1");
//		System.out.println("1 no adult selected");
//		
//		WebElement room = driver.findElement(By.xpath("(//input[contains(@id,'number-input')])[3]"));
//		room.clear();
//		room.sendKeys("1");
//		System.out.println("1 no room selected");
//		
//		WebElement applyBtn = driver.findElement(By.xpath("//span[text()='Apply']"));
//		applyBtn.click();
//		System.out.println("clicked on apply button");
		
		WebElement searchBtn = driver.findElement(By.xpath("//button[@data-testid='search-button']"));
		searchBtn.click();
		System.out.println("Clicked on search button");
		
//		driver.quit();
		
		System.out.println("Browser closed");
		System.out.println("End the program");
		
		
	}

}
