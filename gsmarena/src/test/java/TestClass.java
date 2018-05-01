import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GSMArenaHomePage;
import pages.PhoneFinderBasicPage;
import pages.PhoneFinderPage;


public class TestClass extends TestBase {
    // Test case
    // Title: Phone Finder page Brand: choosing functionality
    // Step1: Open GSMArena.com
    // Step2: Click Phone Finder button and get result text
    //Step3: Click Brand: button
    //Step4: Click Acer checkbox and get result text
    // Verify two result(Assert.assertNotEquals(acerResult,allResult))

    @Test
    public void firstTest(){
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


}
