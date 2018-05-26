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

    public static final String navbarxpath = "//ul[contains(@class,'main-menu-list')]//a[text()='Home']";
    @FindBy(xpath = navbarxpath)
    WebElement navbarelement;
    public Boolean isNavbarVisible(){
        return navbarelement.isDisplayed();
    }

    public static final String topsearchxpath = "//input[contains(@id,'topsearch')]";
    @FindBy(xpath = topsearchxpath)
    WebElement topsearchelement;
    public void clickTopSearch(){
        this.waitForElementPresent(topsearchxpath);
        topsearchelement.click();
    }
    public void inputTopSearchText(String text){
        this.waitForElementPresent(topsearchxpath);
        topsearchelement.sendKeys(text);
    }

    public static final String searchbuttongoxpath = "//div[@class='search-buttons']/a[text() = 'Go']";
    @FindBy(xpath = searchbuttongoxpath)
    WebElement searchbuttongoelement;
    public void clicktopSearchButtonGo(){
        this.waitForElementPresent(searchbuttongoxpath);
        searchbuttongoelement.click();
    }

    public static final String searchbuttonadvancedxpath = "//div[@class='search-buttons']/a[text() = 'Advanced']";
    @FindBy(xpath = searchbuttonadvancedxpath)
    WebElement searchbuttonadvancedelement;
    public void clicktopSearchButtonAdvanced(){
        this.waitForElementPresent(searchbuttonadvancedxpath);
        searchbuttonadvancedelement.click();
    }

    public static final String searchresultsxpath = "//div[@class='makers']/h3[text()='Specs']";
    @FindBy(xpath = searchresultsxpath)
    WebElement searchresultselement;
    public boolean isSearchResultVisible(){
        this.waitForElementPresent(searchresultsxpath);
        return searchresultselement.isDisplayed();
    }

    public static final String autocompletesearchxpath = "//div[contains(@class, 'autocomplete-search')]";
    @FindBy(xpath = autocompletesearchxpath)
    WebElement autocompletesearchelement;
    public boolean isAutocompleteSearchVisible(){
        this.waitForElementPresent(autocompletesearchxpath);
        return autocompletesearchelement.isDisplayed();
    }

    public static final String phonefinderformxpath = "//div[contains(@class, 'phonefinder')]";
    @FindBy(xpath = phonefinderformxpath)
    WebElement phonefinderformelement;
    public boolean isPhoneFinderFormVisible(){
        this.waitForElementPresent(phonefinderformxpath);
        return phonefinderformelement.isDisplayed();
    }




}
