package SeleniumWebAutomation.framework.Operations;

import SeleniumWebAutomation.framework.SetUp.CommonTest;

import java.time.Duration;

public class WaitOperations extends CommonTest {
    public void implicitlyWait(int time) { getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(time)); }
}
