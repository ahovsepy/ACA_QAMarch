package basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPathExpression;

public class PageObject {
    WebDriver driver;
    public  PageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public boolean isElementPresent(final String elementxpath){
        return (new WebDriverWait(driver,10).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d){
                return d.findElement(By.xpath(elementxpath)) != null;
            }
        }));
    }

    public WebElement waitForElementPresent(final String elementXPath) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        By pass = By.xpath(elementXPath);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pass));
    }
}
