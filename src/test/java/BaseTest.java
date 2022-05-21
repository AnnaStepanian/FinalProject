import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import help.WebDriverClass;
import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import static help.WebDriverClass.getDriver;
public abstract class BaseTest {
    @BeforeMethod
    public void startDriver() {
        getDriver();
    }
    @AfterMethod
    public void quitDriver() {
        WebDriverClass.quitDriver();
    }
    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus())
        {
            TakesScreenshot camera = (TakesScreenshot)getDriver();
            File screenshot = ((TakesScreenshot) camera).getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("src/resources/screenshots" + result.getName() + ".png"));
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}