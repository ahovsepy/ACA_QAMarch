import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GSMArenaHomePage;
import pages.HeaderPage;
import pages.PhoneFinderBasicPage;
import pages.PhoneFinderPage;


public class TestClass extends TestBase {


    /**
     * Phone Finder page Brand choosing functionality
     * Step1: Open GSMArena.com
     * Step2: Click Phone Finder button and get result text
     * Step3: Click Brand: button
     * Step4: Click Acer checkbox and get result text
     * Verify two results
     */
    @Test
    public void phoneFinderSelectingBrand(){
        GSMArenaHomePage homepage = new GSMArenaHomePage(driver);
        Assert.assertTrue(homepage.isElementPresent(PhoneFinderBasicPage.phonefinderxpath));
        homepage.phoneFinderBasicPage.clickPhoneFinder();

        PhoneFinderPage phoneFinderPage = new PhoneFinderPage(driver);
        //Assert.assertTrue(phoneFinderPage.isElementPresent(ResultPage.resultsxpath));
        String allResult = phoneFinderPage.resultPage.getResultsText();
        phoneFinderPage.clickBrand();
        phoneFinderPage.clickAcer();

       String acerResult = phoneFinderPage.resultPage.getResultsText();
       Assert.assertNotEquals(acerResult,allResult);
    }


    /**
     * Burger icon open/close navbar
     * Step1: Open GSMArena.com
     * Step2: Click Burger icon
     * Step3: Verify that navbar is open
     * Step4: Click Burger icon again
     * Step5: Verify that navbar is closed
     */
    @Test
    public void navbarOpenClose(){

        GSMArenaHomePage homepage = new GSMArenaHomePage(driver);
        Assert.assertTrue(homepage.isElementPresent(HeaderPage.burgericonxpath));
        homepage.headerPage.clickBurgerIcon();
        Assert.assertTrue(homepage.headerPage.isNavbarVisible());
        homepage.headerPage.clickBurgerIcon();
        Assert.assertFalse(homepage.headerPage.isNavbarVisible());

    }

    /**
    *Year slider functionality testing
    *Step 1: Open GSMArena.com
     * Step 2: Click Phone Finder button
     * Step 3: Click  and move right YEAR Slider lower icon
     * Step 4: Click  and move left YEAR Slider upper icon
    *
     */
    @Test
    public void yearSlidermove() throws InterruptedException {
        GSMArenaHomePage homepage = new GSMArenaHomePage(driver);
        Assert.assertTrue(homepage.isElementPresent(PhoneFinderBasicPage.phonefinderxpath));
        homepage.phoneFinderBasicPage.clickPhoneFinder();

        PhoneFinderPage phoneFinderPage = new PhoneFinderPage(driver);
        Assert.assertTrue(phoneFinderPage.isElementPresent(PhoneFinderPage.yearslidermin));
        String allResult = phoneFinderPage.resultPage.getResultsText();
        try {
            phoneFinderPage.slideYearMin();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
