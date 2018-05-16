package pages;

import basepage.PageObject;
import org.openqa.selenium.WebDriver;

public class GSMArenaHomePage extends PageObject{
    public PhoneFinderBasicPage phoneFinderBasicPage;
    public HeaderPage headerPage;

    public GSMArenaHomePage(WebDriver driver){
        super(driver);
        this.phoneFinderBasicPage = new PhoneFinderBasicPage(driver);
        this.headerPage = new HeaderPage(driver);
    }

}
