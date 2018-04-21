package pages;

import basepage.PageObject;
import org.openqa.selenium.WebDriver;

public class GSMArenaHomePage extends PageObject{
    public PhoneFinderBasicPage phoneFinderBasicPage;

    public GSMArenaHomePage(WebDriver driver){
        super(driver);
        this.phoneFinderBasicPage = new PhoneFinderBasicPage(driver);
    }

}
