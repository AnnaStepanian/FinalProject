package help;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static help.WebDriverClass.driver;

public class Waiter {
    private static Duration DURATION = Duration.ofSeconds(25);

    public static Waiter getInstance() {
        return new Waiter();
    }

    public WebElement waitForElementToBeClickable(By location) {
        return new WebDriverWait(WebDriverClass.getDriver(), DURATION).until(ExpectedConditions.elementToBeClickable(location));
    }

    public List<WebElement> waitForElementsToBeVisible(By location) {
        return new WebDriverWait(WebDriverClass.getDriver(), DURATION).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(location));
    }

    public WebElement isElementDisplayed(By location) {
        return new WebDriverWait(WebDriverClass.getDriver(), DURATION).until(ExpectedConditions.visibilityOfElementLocated(location));
    }

    public void waitForSeconds() {
        try {
            Thread.sleep(DURATION.getSeconds());
        } catch (Exception e) {
            throw new Error("Wait crashed");
        }
    }

    public WebElement waitForElementToBeVisible(By location) {
        return new WebDriverWait(driver, DURATION).until(ExpectedConditions.visibilityOfElementLocated(location));
    }
}