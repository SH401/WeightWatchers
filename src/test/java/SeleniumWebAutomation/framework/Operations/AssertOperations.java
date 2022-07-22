package SeleniumWebAutomation.framework.Operations;

import org.testng.Assert;

public class AssertOperations {
    public void assertEquals(String expected, String actual, String errorMessage) {
        Assert.assertEquals(actual, expected, errorMessage);
    }
}