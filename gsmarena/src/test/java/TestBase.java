import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestBase {
    public WebDriver driver;

    final  String URL = "https://www.gsmarena.com/";

    @BeforeTest
    @Parameters(value={"driver.prop", "driver.path"})
    public void setup(String geckoDriverProp, String driverPath){
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
