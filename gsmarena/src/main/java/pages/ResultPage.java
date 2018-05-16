package pages;

import basepage.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends PageObject{
    public ResultPage(WebDriver driver) {
        super(driver);
    }

    public static final String resultsxpath = "//span[contains(text(),'results')]";

    @FindBy(xpath = resultsxpath)
    WebElement resultselement;

    public String getResultsText(){
        this.waitForElementPresent(resultsxpath);
        return resultselement.getText();
    }
}
