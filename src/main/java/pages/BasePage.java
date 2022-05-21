package pages;

import help.Waiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static help.WebDriverClass.driver;
import static help.WebDriverClass.getDriver;

public abstract class BasePage {

    public Actions actions;
    public static String BASE_URL = "https://www.hilverdaflorist.com/";

    public BasePage() {
        actions = new Actions(getDriver());
    }

    public abstract String getUrl();

    public void openPage() {
        getDriver().get(getUrl());
    }

    public WebElement findElement(By location) {
        Waiter.getInstance().isElementDisplayed(location);
        return getDriver().findElement(location);
    }

    public boolean isElementDisplayed(By locator) {
        return findElement(locator).isDisplayed();
    }

    public void click(By locator) {
        WebElement element = Waiter.getInstance().waitForElementToBeClickable(locator);
        element.click();
    }

    public void click(By locator, int index) {
        List<WebElement> element = Waiter.getInstance().waitForElementsToBeVisible(locator);
        element.get(index).click();
    }

    public void type(By locator, String s) {
        WebElement element = Waiter.getInstance().waitForElementToBeVisible(locator);
        element.sendKeys(s);
    }

    public WebElement getElement(By location) {
        return getDriver().findElement(location);
    }

    public String getPageUrl() {
        return getDriver().getCurrentUrl();
    }

    public void scrollToElement(By locator) {
        WebElement element = Waiter.getInstance().waitForElementToBeClickable(locator);
        actions.moveToElement(element).perform();
    }

    public String getTextByIndex(By locator, int index) {
        return driver.findElements(locator).get(index).getText();
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }
}