import org.junit.Assert;
import org.junit.Test;
import pages.AssortmentPage;
import pages.HomePage;
import pages.ProductPreviewPage;

public class AssortmentPageFilterTest {
    @Test
    public void AssortmentFilterTest() throws InterruptedException {
        HomePage homePage = new HomePage();
        AssortmentPage assortmentPage=new AssortmentPage();
        homePage.openPage();
        homePage.clickAssortmentButton();
        Assert.assertTrue(assortmentPage.isPotPlantsButtonVisible());
        assortmentPage.clickPotPlantsButton();
        Assert.assertTrue(assortmentPage.isGerberaVisible());
        assortmentPage.clickGerberaButton();
        ProductPreviewPage productPreviewPage;
        Thread.sleep(3000);
        productPreviewPage = assortmentPage.clickOnProductByIndex(0);
        String firstProductName = productPreviewPage.getProductName();
        Assert.assertTrue(firstProductName.contains("Abby Lou"));
    }
}
