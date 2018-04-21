package pages;

import basepage.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PhoneFinderPage extends PageObject {
    public PhoneFinderBasicPage phoneFinderBasicPage;
    public ResultPage resultPage;
    public PhoneFinderPage(WebDriver driver){
        super(driver);
        this.phoneFinderBasicPage = new PhoneFinderBasicPage(driver);
        this.resultPage = new ResultPage(driver);
    }

    public static final String brandxpath = "//span[text()='Brand:']";

    @FindBy(xpath = brandxpath)
    WebElement brendelement;

    public void clickBrand(){
        this.waitForElementPresent(brandxpath);
        brendelement.click();
    }


    public static final String acerxpath = "//span[text()='Acer']";

    @FindBy(xpath = acerxpath)
    WebElement acerelement;

    public void clickAcer(){
        acerelement.click();
    }



}
