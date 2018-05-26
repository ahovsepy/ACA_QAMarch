import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GSMArenaHomePage;
import pages.HeaderPage;

public class NavBarSanityTest extends TestBase {
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

}
