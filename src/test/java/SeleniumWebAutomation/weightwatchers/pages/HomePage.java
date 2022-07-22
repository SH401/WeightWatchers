package SeleniumWebAutomation.weightwatchers.pages;

import SeleniumWebAutomation.framework.Operations.AssertOperations;
import SeleniumWebAutomation.framework.Operations.CommonOperations;
import SeleniumWebAutomation.framework.Operations.WaitOperations;
import SeleniumWebAutomation.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(WebDriver driver) { PageFactory.initElements(driver, this); }

    CommonOperations commonOperations = new CommonOperations();
    AssertOperations assertOperations = new AssertOperations();
    Constants constants = new Constants();
    WaitOperations waitOperations = new WaitOperations();

    @FindBy( xpath = "//span[@class='buttonText-3DCCO'][contains(text(),'In-Person')]")
    public WebElement buttonInPerson;

    @FindBy( id = "location-search")
    public WebElement txtLocationSearch;

    @FindBy( id = "location-search-cta")
    public WebElement btnLocationSearch;

    @FindBy( xpath = "//div[@id='location-1252089']/div[1]/div/a")
    public WebElement titleOfTheFirstResult;

    @FindBy( xpath = "//div[@id='location-1252089']/div/span")
    public WebElement distanceOfTheFirstResult;

    @FindBy( id = "location-1252089")
    public WebElement firstResult;

    public void checkTitle() {
        assertOperations.assertEquals(constants.title, commonOperations.getTitle(), constants.titleErrorMessage);
    }

    public void clickInPerson() {
        commonOperations.clickElement(buttonInPerson);
    }

    public void enterZipCode() {
        commonOperations.sendKeys(txtLocationSearch, constants.zipCode);
    }

    public void clickLocationSearch() {
        commonOperations.clickElement(btnLocationSearch);
    }

    public String printTitleOfTheFirstResult() {
        waitOperations.implicitlyWait(10);
        String title = commonOperations.getText(titleOfTheFirstResult);
        System.out.println("\n"+"Location: " + commonOperations.getText(titleOfTheFirstResult));

        return title;
    }

    public void printDistanceOfTheFirstResult() {
        System.out.println("Distance: " + commonOperations.getText(distanceOfTheFirstResult));
    }

    public void clickFirstResult() {
        commonOperations.clickElement(firstResult);
    }
}