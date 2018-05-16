package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class FunctionalTestBase {

	public WebDriver driver;
	final  String URL = "https://www.google.com/";
	String geckoDriverProp = "webdriver.gecko.driver";
	String driverPath = "C:\\Users\\Narine\\Downloads\\geckodriver-v0.15.0-win32\\geckodriver.exe";
	@BeforeTest
	public void setup(){
		System.setProperty(geckoDriverProp,driverPath);
		driver = new FirefoxDriver();
		driver.get(URL);
	}
	@AfterTest
	public void tearDown(){
		driver.close();
		driver.quit();
	}
}
