import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.Properties;


public class TestBase {
    public WebDriver driver;

    final  String URL = "https://www.gsmarena.com/";
    @BeforeClass
    @Parameters({"driver.prop","driver.path"})
    public void setup(@Optional("webdriver.gecko.driver") String driverProp,@Optional("C:\\Users\\Narine\\Downloads\\geckodriver-v0.15.0-win32\\geckodriver.exe") String driverPath){
        System.setProperty(driverProp,driverPath);
        driver = new FirefoxDriver();
        driver.get(URL);
    }
    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
