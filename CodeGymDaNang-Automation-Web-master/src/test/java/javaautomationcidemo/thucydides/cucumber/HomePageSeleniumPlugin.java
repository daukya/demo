//package javaautomationcidemo.thucydides.cucumber;
//
//import java.util.regex.Pattern;
//import java.util.concurrent.TimeUnit;
//import org.junit.*;
//import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
//import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
//
//public class HomePageSeleniumPlugin {
///*	private WebDriver driver;
//	private String baseUrl;
//	private boolean acceptNextAlert = true;
//	private StringBuffer verificationErrors = new StringBuffer();
//
//	@Before
//	public void setUp() throws Exception {
//		driver = new FirefoxDriver();
//		baseUrl = "http://localhost:8080/java-demo-ci-web/";
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}
//
//	@Test
//	public void testHomePage() throws Exception {
//		driver.get(baseUrl);
//		driver.findElement(By.id("phone")).clear();
//		driver.findElement(By.id("phone")).sendKeys("srwerwerwe");
//		driver.findElement(By.id("f")).clear();
//		driver.findElement(By.id("f")).sendKeys("werwerwerwr");
//		driver.findElement(By.id("email")).clear();
//		driver.findElement(By.id("email")).sendKeys("werwer");
//		driver.findElement(By.id("username")).clear();
//		driver.findElement(By.id("username")).sendKeys("werwer");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys("w");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys("w123213123");
//		driver.findElement(By.id("repassword")).clear();
//		driver.findElement(By.id("repassword")).sendKeys("1231313123");
//		driver.findElement(By.id("register")).click();
//		assertEquals("werwer", closeAlertAndGetItsText());
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		driver.quit();
//		String verificationErrorString = verificationErrors.toString();
//		if (!"".equals(verificationErrorString)) {
//			fail(verificationErrorString);
//		}
//	}
//
//	private boolean isElementPresent(By by) {
//		try {
//			driver.findElement(by);
//			return true;
//		} catch (NoSuchElementException e) {
//			return false;
//		}
//	}
//
//	private boolean isAlertPresent() {
//		try {
//			driver.switchTo().alert();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}
//	}
//
//	private String closeAlertAndGetItsText() {
//		try {
//			Alert alert = driver.switchTo().alert();
//			String alertText = alert.getText();
//			if (acceptNextAlert) {
//				alert.accept();
//			} else {
//				alert.dismiss();
//			}
//			return alertText;
//		} finally {
//			acceptNextAlert = true;
//		}
//	}
//	*/
//}
