package stepDefs;
import PageFactory.HRStaffPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HRStaffStepDef {
    @Given("I am on the StaffPage")
    public void iAmOnTheStaffPage() {
        String expectedURL= "https://hr-testing.buffsci.org/home";

    }

    @When("I click on NewHire button")
    public void iClickOnNewHireButton() {

    }

    @Then("NewHire module will e visile")
    public void newHireModuleWillEVisile() {

    }

    @Then("I add NewHire's information")
    public void iAddNewHireSInformation() {

    }
    @Then("I click the save button")
    public void iClickTheSaveButton() {
    }

    @Then("I validate the newHire")
    public void iValidateTheNewHire() {
    }

    @Given("As an Admin I am on the StaffPage")
    public void asAnAdminIAmOnTheStaffPage() {
    }
}
