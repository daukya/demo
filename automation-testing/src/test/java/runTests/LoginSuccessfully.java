package runTests;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginSuccessfully {
	private static String dirData = "C:\\Users\\LAPTOP88\\Documents\\JuniorViec\\juniorviec-automation-web\\automation-testing\\data.xlsx";
	private WebDriver driver;
	private WebDriverWait wait;
	
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
	public void TestLoginSuccessfully() throws Exception {
		String username = getUserName();
		String password = getPassword();
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 100);
		driver.manage().window().maximize();
		
		//Open login site
		driver.get("https://juniorviec.com/login");
		driver.findElement(By.xpath("//*[contains(@name, 'email')]")).sendKeys(username);
		driver.findElement(By.xpath("//*[contains(@name, 'password')]")).sendKeys(password);
		driver.findElement(By.xpath("//*[contains(@id, 'signin')]")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[2]/a")).getText().contains("Company Reviews"));
		Thread.sleep(5000);
		
		driver.quit();
	}
}
