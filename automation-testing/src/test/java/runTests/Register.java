package runTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.serenitybdd.core.annotations.findby.By;

public class Register {

	private WebDriver driver;
	private WebDriverWait wait;

	@Test
	public void TestRegisterSuccessfully() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 100);
		driver.manage().window().maximize();

		// Open Register site
		driver.get("https://juniorviec.com/register");

		// Enter user's information
		driver.findElement(By.xpath("//*[contains(@name, 'email')]")).sendKeys("phuc.pham9977+3@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[@id='cpassword']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Pham");
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Phuc");
		
//		Click [Sign up] button
		driver.findElement(By.xpath("//*[contains(@name, 'submit')]")).click();
		
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(@class, 'tab-content')]")).getText().contains("phuc.pham9977+3@gmail.com"), "You have just registered successfully!");
		
		//Close window
		driver.quit();
	}

}
