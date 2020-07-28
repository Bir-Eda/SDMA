package stepDefs;
import PageFactory.HRStaffPage;
import Utilities.AutomationContext;
import Utilities.WebElementMgr;
import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;
import io.cucumber.java.en.*;
import managers.Driver;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;


import java.util.Map;

public class HRStaffStepDef {
    AutomationContext context;
    WebDriver driver;

    public HRStaffStepDef(AutomationContext context){
        this.context = context;
    }

    @Then("I login as Admin")
    public void i_login_as_Admin() throws Exception {
        WebElement loadLogin = (WebElement) WebElementMgr.getWebElement(context.getPageObjectMgr().getCurrentPage(), "loadLogin");
        WebElement emailSection = (WebElement) WebElementMgr.getWebElement(context.getPageObjectMgr().getCurrentPage(), "emailSection");
        WebElement passwordSection = (WebElement) WebElementMgr.getWebElement(context.getPageObjectMgr().getCurrentPage(), "passwordSection");
        WebElement loginButton = (WebElement) WebElementMgr.getWebElement(context.getPageObjectMgr().getCurrentPage(), "loginButton");

        try{
            loadLogin.click();
        }
        catch (Exception e){
            loadLogin.sendKeys(Keys.RETURN);
        }
        Thread.sleep(1000);
        emailSection.sendKeys("admin@staging-buffsci.org");
        Thread.sleep(1000);
        passwordSection.sendKeys("admin123test");
        Thread.sleep(1000);
        loginButton.click();
        Thread.sleep(1000);
        String actualUrl= Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://hr-testing.buffsci.org/home";
        if (!expectedUrl.equals(actualUrl)) {
            context.getScenarioManager().getScenario().write(" Fail; \n Expected url: " +expectedUrl + " \n Found url: " + actualUrl);
            throw new Exception(" Fail; \n Expected url: " +expectedUrl + " \n Found url: " + actualUrl);
        }else {
            context.getScenarioManager().getScenario().write(" Pass; \n Expected url: " +expectedUrl + " \n Found url: " + actualUrl);
        }
    }

    @Given("As an Admin I am on the StaffPage")
    public void asAnAdminIAmOnTheStaffPage() {
    }

    @When("I click on NewHire button")
    public void iClickOnNewHireButton() {
        HRStaffPage.newHireButton.click();
    }

    @Then("NewHire module will be visible")
    public void newHire_module_will_be_visible() {
        Assert.assertEquals("I am on the New Hire Module",HRStaffPage.newHireHeaderText.getText(), "New Hire");
    }

    @Then("I click the save button")
    public void iClickTheSaveButton() {
        HRStaffPage.newHireSave.click();
    }

    @Then("I validate the newHire")
    public void i_validate_the_newHire() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("Saving new hire is Successful","New staff is registered",HRStaffPage.savingStatNewHire.getText());;

    }

    @Then("I fill new Hire Form")
    public void iFillNewHireForm() throws InterruptedException {
        Faker newUser = new Faker();
        String firstName = newUser.name().firstName();
        String middleName= newUser.name().nameWithMiddle();
        String lastName = newUser.name().lastName();
        PhoneNumber phoneNumber = newUser.phoneNumber();
        String email= firstName+"@gmail.com";

        Select jobSelect = new Select(HRStaffPage.newHireVacantPositions);
        jobSelect.selectByIndex(2);
        Select select = new Select(HRStaffPage.salutationDropDown);
        select.selectByIndex(1);

        HRStaffPage.newHireFirstName.sendKeys(firstName);
        Thread.sleep(2000);
        HRStaffPage.newHireMiddleName.sendKeys(middleName);
        Thread.sleep(2000);
        HRStaffPage.newHireLastName.sendKeys(lastName);
        Thread.sleep(2000);
        HRStaffPage.newHireCellPhone.sendKeys("1234567890");
        Thread.sleep(2000);
        HRStaffPage.newHirePersonalEmail.sendKeys(email);
        Thread.sleep(2000);
        HRStaffPage.newHireChooseFile.sendKeys("//Users//abdullahibin//Desktop//Person.jpeg");
        Thread.sleep(2000);
    }

}
