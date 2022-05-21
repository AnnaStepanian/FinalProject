package pages;
import org.openqa.selenium.By;
import static locators.AssortmentConstants.*;
public class AssortmentPage extends BasePage {
    private By searchField = By.xpath(SEARCH_FIELD);
    private By albino = By.xpath(ALBINO);
    private By product = By.className(PRODUCT);
    private By wrongInput = By.xpath(WRONG_INPUT);
    private By crop = By.xpath(CROP);
    private By gerbera = By.xpath(GERBERA);


    @Override
    public String getUrl() {
        return BASE_URL + "/assortment/";
    }

    public boolean isSearchFieldVisible(){
        return isElementDisplayed(searchField);
    }

    public void searchingText(){
        type(searchField,"Albino");
    }

    public boolean AlbinoExist(){
        return findElement(albino).isDisplayed();
    }

    public ProductPreviewPage clickOnProductByIndex(int index) {
        click(product, index);
        return new ProductPreviewPage();
    }

    public boolean getText(){
        if(findElement(wrongInput).isEnabled()){
            return true;
        }
        else {
            return false;
        }
    }

    public void swipeUntilProductDisplayed() {
        scrollToElement(product);
    }

    public void invalidInput(){
        type(searchField,"xyzyhd");
    }

    public boolean isPotPlantsButtonVisible(){
        return isElementDisplayed(crop);
    }

    public void clickPotPlantsButton(){
        click(crop);
    }

    public boolean isGerberaVisible(){
        return isElementDisplayed(gerbera);
    }

    public void clickGerberaButton(){
        click(gerbera);
    }
}
