package runTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.serenitybdd.core.annotations.findby.By;

public class Register {
	private static String dirData = "C:\\Users\\LAPTOP88\\Documents\\JuniorViec\\juniorviec-automation-web\\automation-testing\\data.xlsx";

	private WebDriver driver;
	private WebDriverWait wait;

	// Get username
	public static String getUserName() throws Exception {
		File src = new File(dirData);
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0); // Read data from Sheet1
		String username = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println("Username: " + username);
		return username;
	}

	// Get password
	public static String getPassword() throws Exception {
		File src = new File(dirData);
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0); // Read data from Sheet1
		DataFormatter dataFormartter = new DataFormatter();
		String pass = dataFormartter.formatCellValue(sheet.getRow(1).getCell(1));
		System.out.println("Password: " + pass);
		return pass;
	}

	@Test
	public void TestRegisterSuccessfully() throws Exception {
		
		String username = getUserName();
		String password = getPassword();
		String passwordConfirm = getPassword();
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 100);
		driver.manage().window().maximize();

		// Open Register site
		driver.get("https://juniorviec.com/register");

		// Enter user's information
		driver.findElement(By.xpath("//*[contains(@name,'email')]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='cpassword']")).sendKeys(passwordConfirm);
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Pham");
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Phuc");

		// Click [Sign up] button
		driver.findElement(By.xpath("//*[contains(@name, 'submit')]")).click();

		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(@class,'tab-content')]")).getText()
				.contains(username), "You have just registered successfully!");

		// Close window
		driver.quit();
	}

}
