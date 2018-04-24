import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GSMArenaHomePage;
import pages.PhoneFinderBasicPage;
import pages.PhoneFinderPage;


public class TestClass extends TestBase {
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
