package SeleniumWebAutomation.weightwatchers.tests;

import SeleniumWebAutomation.weightwatchers.core.BaseTest;
import SeleniumWebAutomation.weightwatchers.pages.HomePage;
import SeleniumWebAutomation.weightwatchers.pages.WorkshopStudio;
import org.testng.annotations.Test;

public class CheckWatcherLocationAndBusinessHoursTest extends BaseTest {
    @Test
    public void Control() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());

        homePage.checkTitle();
        homePage.clickInPerson();
        homePage.enterZipCode();
        homePage.clickLocationSearch();
        String title = homePage.printTitleOfTheFirstResult();
        homePage.printDistanceOfTheFirstResult();
        homePage.clickFirstResult();

        WorkshopStudio workshopStudio = new WorkshopStudio(getDriver());

        workshopStudio.checkTitles(title);
        workshopStudio.clickBusinessHours();
        workshopStudio.printBusinessHours();
    }
}