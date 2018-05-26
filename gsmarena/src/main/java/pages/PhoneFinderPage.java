package pages;

import basepage.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;


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



    public static final String yearslidermin= "//div[contains(@class, 'phonefinder-slider-year')]/*/*/div[contains(@class,'handle-lower')]";
    public static final String yearslidermax= "//div[contains(@class, 'phonefinder-slider-year')]/*/*/div[contains(@class,'handle-upper')]";
    @FindBy(xpath = yearslidermin)
    WebElement yearmin;
    @FindBy(xpath = yearslidermax)
    WebElement yearmax;

    public void slideYearMin() throws InterruptedException {
        this.waitForElementPresent(yearslidermin);
        ((JavascriptExecutor) driver).executeScript(
                "function simulate(f,c,d,e){var b,a=null;for(b in eventMatchers)if(eventMatchers[b].test(c)){a=b;break}if(!a)return!1;document.createEvent?(b=document.createEvent(a),a==\"HTMLEvents\"?b.initEvent(c,!0,!0):b.initMouseEvent(c,!0,!0,document.defaultView,0,d,e,d,e,!1,!1,!1,!1,0,null),f.dispatchEvent(b)):(a=document.createEventObject(),a.detail=0,a.screenX=d,a.screenY=e,a.clientX=d,a.clientY=e,a.ctrlKey=!1,a.altKey=!1,a.shiftKey=!1,a.metaKey=!1,a.button=1,f.fireEvent(\"on\"+c,a));return!0} var eventMatchers={HTMLEvents:/^(?:load|unload|abort|error|select|change|submit|reset|focus|blur|resize|scroll)$/,MouseEvents:/^(?:click|dblclick|mouse(?:down|up|over|move|out))$/}; "
                        + "simulate(arguments[0],\"mousedown\",0,0); simulate(arguments[0],\"mousemove\",arguments[1],arguments[2]); simulate(arguments[0],\"mouseup\",arguments[1],arguments[2]); ",
                yearmin, 10, 0);
        ((JavascriptExecutor) driver).executeScript(
                "function simulate(f,c,d,e){var b,a=null;for(b in eventMatchers)if(eventMatchers[b].test(c)){a=b;break}if(!a)return!1;document.createEvent?(b=document.createEvent(a),a==\"HTMLEvents\"?b.initEvent(c,!0,!0):b.initMouseEvent(c,!0,!0,document.defaultView,0,d,e,d,e,!1,!1,!1,!1,0,null),f.dispatchEvent(b)):(a=document.createEventObject(),a.detail=0,a.screenX=d,a.screenY=e,a.clientX=d,a.clientY=e,a.ctrlKey=!1,a.altKey=!1,a.shiftKey=!1,a.metaKey=!1,a.button=1,f.fireEvent(\"on\"+c,a));return!0} var eventMatchers={HTMLEvents:/^(?:load|unload|abort|error|select|change|submit|reset|focus|blur|resize|scroll)$/,MouseEvents:/^(?:click|dblclick|mouse(?:down|up|over|move|out))$/}; "
                        + "simulate(arguments[0],\"mousedown\",0,0); simulate(arguments[0],\"mousemove\",arguments[1],arguments[2]); simulate(arguments[0],\"mouseup\",arguments[1],arguments[2]); ",
                yearmax, -10, 0);


        Thread.sleep(3000);

    }



}
