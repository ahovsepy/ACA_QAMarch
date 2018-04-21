import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
    public WebDriver driver;
    final  String URL = "https://www.gsmarena.com/";
    String geckoDriverProp = "webdriver.gecko.driver";
    String driverPath = "C:\\Users\\Narine\\Downloads\\geckodriver-v0.15.0-win32\\geckodriver.exe";
    @BeforeClass
    public void setup(){
        System.setProperty(geckoDriverProp,driverPath);
        driver = new FirefoxDriver();
        driver.get(URL);
    }
    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
