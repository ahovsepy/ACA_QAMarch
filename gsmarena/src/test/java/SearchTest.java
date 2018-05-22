import org.testng.annotations.Test;
import org.testng.Assert;
import pages.GSMArenaHomePage;
import pages.HeaderPage;

public class SearchTest extends TestBase{
    /**
     * Click search textbox
     * Click Go button
     * Verify is search results element present
     * Click again search textbox
     * Click Advanced button
     * Verify is phonefider form element present
     * Click again search textbox
     * Input text 'Samsung'
     * Click Go button
     * Verify is search result element present
     */
    @Test
    public void searchSanityTest(){
        GSMArenaHomePage homePage = new GSMArenaHomePage(driver);
        Assert.assertTrue(homePage.headerPage.isElementPresent(HeaderPage.topsearchxpath));
        homePage.headerPage.clickTopSearch();
        homePage.headerPage.clicktopSearchButtonGo();
        Assert.assertTrue(homePage.headerPage.isSearchResultVisible());
        homePage.headerPage.clickTopSearch();
        homePage.headerPage.clicktopSearchButtonAdvanced();
        Assert.assertTrue(homePage.headerPage.isPhoneFinderFormVisible());
        homePage.headerPage.clickTopSearch();
        homePage.headerPage.inputTopSearchText("Samsung");
        homePage.headerPage.clicktopSearchButtonGo();
        Assert.assertTrue(homePage.headerPage.isElementPresent(HeaderPage.topsearchxpath));




    }

}
