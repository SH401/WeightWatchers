package SeleniumWebAutomation.weightwatchers.core;

import SeleniumWebAutomation.framework.SetUp.CommonTest;
import SeleniumWebAutomation.utils.Constants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends CommonTest {
    Constants constants = new Constants();

    @BeforeMethod
    public void start(){
        getDriver().manage().window().maximize();
        getDriver().get(constants.url);

    }

    @AfterMethod
    public void end() {
    }
}
