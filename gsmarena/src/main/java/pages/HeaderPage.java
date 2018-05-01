package pages;

import basepage.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends PageObject {
    public HeaderPage(WebDriver driver) {
        super(driver);
    }
    public static final String burgericonxpath = "//button[contains(@class,'lines-button')]";
    @FindBy(xpath = burgericonxpath)
    WebElement burgericonelement;
    public void clickBurgerIcon(){
        this.waitForElementPresent(burgericonxpath);
        burgericonelement.click();
    }
    public static final String navbarxpath = "//ul[contains(@class,'main-menu-list')]";
    @FindBy(xpath = navbarxpath)
    WebElement navbarelement;
    public Boolean isNavbarVisible(){
        return navbarelement.isDisplayed();
    }

}
