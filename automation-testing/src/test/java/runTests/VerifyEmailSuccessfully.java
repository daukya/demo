package runTests;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import javax.sound.midi.Soundbank;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyEmailSuccessfully {
	private static String dirData = "C:\\Users\\LAPTOP88\\Documents\\JuniorViec\\juniorviec-automation-web\\automation-testing\\data.xlsx";

	private static WebDriver driver;
	private static WebDriverWait wait;

	// Get email
	public static String getEmailLogin() throws Exception {
		File src = new File(dirData);
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		String email = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println("Email is: " + email);
		return email;
	}

	public static String getEmailPassword() throws Exception {
		File src = new File(dirData);
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0); // Get data from first sheet
		DataFormatter formatter = new DataFormatter();
		String emailPass = formatter.formatCellValue(sheet.getRow(1).getCell(2));
		System.out.println("Password email is: " + emailPass);
		return emailPass;
	}

	public static void pressOnConfirmButton(String emailSubject) {
		// Wait to load all email inbox
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='bog']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='bog']")));
		List<WebElement> emails = driver.findElements(By.xpath("//span[@class='bog']"));
		System.out.println("List email: " + emails);

		for (int i = 0; i < emails.size(); i++) {
			if (emails.get(i).getText().contains(emailSubject)) {
				emails.get(i).click();
				System.out.println("Click email confirm account");
				break;
			}
		}

		// Wait for loading confirm account email
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@href,'juniorviec')]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@href,'juniorviec')]")));
		driver.findElement(By.xpath("//*[contains(@href,'juniorviec')]")).click();
		// Get confirm account URL from Button
//		String confirmURL = driver.findElement(By.xpath("//*[contains(@href,'juniorviec')]")).getAttribute("href");
//		System.out.println("Button href: " + confirmURL);
//
//		// Cut before specific character
//		// confirmURL = confirmURL.split("=")[0]
//		String confirmToken = confirmURL.substring(confirmURL.lastIndexOf("=") + 1);
//		System.out.println("Cut string is: " + confirmToken);
//
//		return confirmToken;
	}

	@Test
	public void TestVerifyEmailSuccessfully() throws Exception {
		String confirmSubject = "";
		String email = getEmailLogin();
		String emailPass = getEmailPassword();

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 100);
		driver.manage().window().maximize();

		// Login into gg account
		driver.get("http://mail.google.com");
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='password']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(emailPass);
		driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
		
		//Press on confirm button
		pressOnConfirmButton(confirmSubject);
		
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(@class, 'verify-success-content')]")).getText().contains("Congrats!!"), "Login");
		
		driver.quit();
	}
}
