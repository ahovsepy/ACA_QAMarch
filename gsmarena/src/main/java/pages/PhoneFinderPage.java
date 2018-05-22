package pages;

import basepage.PageObject;
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
        int yearminX = yearmin.getLocation().getX();
        int yearmaxX = yearmax.getLocation().getX();
        System.out.println(yearminX);
        System.out.println(yearmaxX);
        Actions action= new Actions(driver);
        //action.dragAndDropBy(yearmin,100,0).build().perform();
        action.clickAndHold(yearmin).moveByOffset(yearminX+100,0).build().perform();
        Thread.sleep(3000);


    }



}
