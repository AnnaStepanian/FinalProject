import org.junit.Assert;
import org.junit.Test;
import pages.AgentsPage;
import pages.ContactForm;
import pages.GetInTouchPage;
import pages.HomePage;

public class AgentsPageTest {
    @Test
    public void AgentsSelectionTest() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.openPage();
        Assert.assertTrue(homePage.isGetInTouchButtonVisible());
        homePage.clickGetInTouchButton();
        GetInTouchPage getInTouchPage = new GetInTouchPage();
        Assert.assertTrue(getInTouchPage.isOurAgentsButtonVisible());
        getInTouchPage.clickOurAgentsButton();
        AgentsPage agentsPage = new AgentsPage();
        Assert.assertTrue(agentsPage.isContinentButtonVisible());
        agentsPage.clickContinentButton();
        Assert.assertTrue(agentsPage.isEuropeButtonVisible());
        agentsPage.clickEuropeButton();
        Assert.assertTrue(agentsPage.isFranceButtonVisible());
        agentsPage.clickFranceButton();
    }

    @Test
    public void FormValidation() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.openPage();
        Assert.assertTrue(homePage.isGetInTouchButtonVisible());
        homePage.clickGetInTouchButton();
        GetInTouchPage getInTouchPage = new GetInTouchPage();
        ContactForm contactForm = new ContactForm();
        Assert.assertTrue(getInTouchPage.isNameFieldVisible());
        getInTouchPage.nameField();
        Assert.assertTrue(getInTouchPage.isPhoneFieldVisible());
        getInTouchPage.phoneField();
        Assert.assertTrue(getInTouchPage.isEmailFieldVisible());
        getInTouchPage.emailField();
        Assert.assertTrue(getInTouchPage.isSendButtonVisible());
        getInTouchPage.clickSendButton();

    }
}
