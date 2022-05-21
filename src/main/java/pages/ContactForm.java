package pages;

import org.openqa.selenium.By;

import static locators.GetInTouchConstants.*;
import static locators.GetInTouchConstants.SEND_BUTTON;

public class ContactForm  extends BasePage {
    private By name = By.xpath(NAME);
    private By email = By.xpath(EMAIL);
    private By phone = By.xpath(PHONE);

    public String getName() {
        return getText(name);
    }
    public String getEmail() {
        return getText(email);
    }
    public String getPhone() {
        return getText(phone);
    }
    @Override
    public String getUrl() {
        return null;
    }
}
