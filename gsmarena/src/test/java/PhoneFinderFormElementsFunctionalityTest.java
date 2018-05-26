import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GSMArenaHomePage;
import pages.PhoneFinderBasicPage;
import pages.PhoneFinderPage;


public class PhoneFinderFormElementsFunctionalityTest extends TestBase {


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
    *Year slider functionality testing
    *Step 1: Open GSMArena.com
     * Step 2: Click Phone Finder button
     * Step 3: Click  and move right YEAR Slider lower icon
     * Step 4: Click  and move left YEAR Slider upper icon
    *
     */
    @Test
    public void yearSlidermove() {
        GSMArenaHomePage homepage = new GSMArenaHomePage(driver);
        Assert.assertTrue(homepage.isElementPresent(PhoneFinderBasicPage.phonefinderxpath));
        homepage.phoneFinderBasicPage.clickPhoneFinder();

        PhoneFinderPage phoneFinderPage = new PhoneFinderPage(driver);
        Assert.assertTrue(phoneFinderPage.isElementPresent(PhoneFinderPage.yearslidermin));
        String allResult = phoneFinderPage.resultPage.getResultsText();


    }


}
