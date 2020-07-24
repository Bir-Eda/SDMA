package stepDefs;
import PageFactory.HRStaffPage;
import Utilities.AutomationContext;
import Utilities.WebElementMgr;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HRStaffStepDef {
    AutomationContext context;
    WebDriver driver;

    public HRStaffStepDef(AutomationContext context){
        this.context = context;
    }

    //@Given("I am on the HRStaffPage")
    //public void i_am_on_the_HRStaffPage() {
      //  String actualURL = Driver.getDriver().getCurrentUrl();
        //String expectedURL= "https://hr-testing.buffsci.org/home";
        //Assert.assertEquals("I am on  the HRStaffPage",expectedURL,actualURL);

    //}
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

    @When("I click on NewHire button")
    public void iClickOnNewHireButton() {
        HRStaffPage.newHireButton.click();

    }

    @Then("NewHire module will be visible")
    public void newHire_module_will_be_visible() {
         String actualTitle= HRStaffPage.newHireTitle.getText();
         String expectedTitle = "New Hire";
         Assert.assertEquals("I am on the New Hire module",expectedTitle,actualTitle);
    }
    @Then("I validate the newHire")
    public void iValidateTheNewHire() {
    }

    @Then("I add NewHire's information")
    public void iAddNewHireSInformation() {

    }
    @Then("I click the save button")
    public void iClickTheSaveButton() {
    }

    @Given("As an Admin I am on the StaffPage")
    public void asAnAdminIAmOnTheStaffPage() {
    }



    @When("I enter valid data on the NewHireModule")
    public void i_enter_valid_data_on_the_NewHireModule() {
    }




}
