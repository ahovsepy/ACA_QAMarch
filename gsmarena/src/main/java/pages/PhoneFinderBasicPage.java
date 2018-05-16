package pages;

import basepage.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhoneFinderBasicPage extends PageObject{
    public PhoneFinderBasicPage(WebDriver driver) {
        super(driver);
    }

    public static final String phonefinderxpath = "//span[text()='Phone finder']";
    @FindBy(xpath = phonefinderxpath)
    WebElement phonefinderelement;

    public void clickPhoneFinder(){
        this.waitForElementPresent(phonefinderxpath);
        phonefinderelement.click();

    }



}
