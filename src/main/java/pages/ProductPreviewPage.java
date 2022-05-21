package pages;

import locators.ProductPreviewPageConstants;
import org.openqa.selenium.By;

public class ProductPreviewPage extends BasePage{
    private By productName = By.className(ProductPreviewPageConstants.productName);

    public String getProductName() {
        return getText(productName);
    }

    @Override
    public String getUrl() {
        return null;
    }
}
