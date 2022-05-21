import org.junit.Assert;
import org.junit.Test;
import pages.AssortmentPage;
import pages.HomePage;
import pages.ProductPreviewPage;

public class AssortmentPageSearchTest extends BaseTest {
    @Test
    public void ValidSearchTest() throws InterruptedException {
        HomePage homePage = new HomePage();
        AssortmentPage assortmentPage=new AssortmentPage();
        ProductPreviewPage productPreviewPage;
        homePage.openPage();
        homePage.clickAssortmentButton();
        assortmentPage.searchingText();
        Thread.sleep(3000);
        productPreviewPage = assortmentPage.clickOnProductByIndex(0);
        String firstProductName = productPreviewPage.getProductName();
        Assert.assertTrue(firstProductName.contains("Albino"));
    }
}
