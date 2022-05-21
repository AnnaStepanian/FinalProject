package help;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverClass {
    public static WebDriver driver;
    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.hilverdaflorist.com/");
            driver.manage().window().maximize();
        }
        return driver;
    }
    public static void quitDriver() {
        getDriver().quit();
        driver = null;
    }
}