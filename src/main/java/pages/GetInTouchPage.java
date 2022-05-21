package pages;
import org.openqa.selenium.By;
import static locators.GetInTouchConstants.*;
public class GetInTouchPage extends BasePage  {
    private By ourAgents = By.xpath(OUR_AGENTS);
    private By name = By.xpath(NAME);
    private By email = By.xpath(EMAIL);
    private By phone = By.xpath(PHONE);
    private By sendButton = By.xpath(SEND_BUTTON);

    @Override
    public String getUrl() {
        return  BASE_URL + "/contact/";
    }

    public boolean isOurAgentsButtonVisible() {
        return isElementDisplayed(ourAgents);
    }

    public void clickOurAgentsButton(){
        click(ourAgents);
    }

    public boolean isNameFieldVisible() {
        return isElementDisplayed(name);
    }

    public void nameField(){
        type(name,"Anna");
    }

    public boolean isEmailFieldVisible() {
        return isElementDisplayed(email);
    }

    public void emailField(){
        type(email,"annastepanyan49@gmail.com");
    }

    public boolean isPhoneFieldVisible() {
        return isElementDisplayed(phone);
    }

    public void phoneField(){
        type(phone,"+4943734783743");
    }

    public boolean isSendButtonVisible() {
        return isElementDisplayed(sendButton);
    }

    public void clickSendButton(){
        click(sendButton);
    }
}
