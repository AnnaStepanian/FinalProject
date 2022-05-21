package pages;
import help.WebDriverClass;
import org.openqa.selenium.By;
import static locators.HomePageConstants.*;

public class HomePage extends BasePage {
    private By assortmentButton = By.xpath(ASSORTMENT_BUTTON);
    private By getInTouch = By.xpath(GET_IN_TOUCH);

    @Override
    public String getUrl() {
        return BASE_URL;
    }

    public boolean isViewOurAssortmentButtonVisible() {
        return isElementDisplayed(assortmentButton);
    }

    public void clickAssortmentButton(){
        click(assortmentButton);
    }

    protected void load() {
        WebDriverClass.getDriver().get(getUrl());
    }

    public boolean isGetInTouchButtonVisible() {
        return isElementDisplayed(getInTouch);
    }

    public void clickGetInTouchButton(){
        click(getInTouch);
    }

}
