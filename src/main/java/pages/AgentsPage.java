package pages;
import org.openqa.selenium.By;
import static locators.AgentsConstants.*;

public class AgentsPage extends BasePage {
    private By continent = By.xpath(CONTINENT);
    private By europe = By.xpath(EUROPE);
    private By france = By.xpath(FRANCE);

    @Override
    public String getUrl() {
        return null;
    }

    public boolean isContinentButtonVisible() {
        return isElementDisplayed(continent);
    }

    public void clickContinentButton(){
        click(continent);
    }
    public boolean isEuropeButtonVisible() {
        return isElementDisplayed(europe);
    }

    public void clickEuropeButton(){
        click(europe);
    }
    public boolean isFranceButtonVisible() {
        return isElementDisplayed(france);
    }

    public void clickFranceButton(){
        click(france);
    }
}
