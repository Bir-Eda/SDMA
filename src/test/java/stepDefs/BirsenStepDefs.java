package stepDefs;

import PageFactory.HRStaffPage;
import Utilities.AutomationContext;
import Utilities.WebElementMgr;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Birsen
 */

public class BirsenStepDefs{

        WebDriver driver;
        AutomationContext context;

        public BirsenStepDefs(AutomationContext context) {
            this.context = context;
        }

        Faker f;
        String newEmployee;

        /**
         * Steps for filling new employee info for new hire
         */
        @Then("^I fill new employee's information on NewHire window$")
        public void i_fill_new_employees_information_on_newhire_window() throws IOException, InterruptedException {
            f = new Faker();

            Select titles = new Select(HRStaffPage.salutationDropDown);
            titles.selectByVisibleText("Mr.");

//            Select titlesList=new Select((WebElement) HRStaffPage.salutationDropDownList);
//            titlesList.selectByVisibleText("Dr.");

            Select vacant = new Select(HRStaffPage.newHireVacantPositions);
            vacant.selectByIndex(2);

            String firstNm = f.name().firstName();
            HRStaffPage.newHireFirstName.sendKeys(firstNm);

            String midNm = f.name().nameWithMiddle();
            HRStaffPage.newHireMiddleName.sendKeys(midNm);

            String lastNm = f.name().lastName();
            HRStaffPage.newHireLastName.sendKeys(lastNm);

            newEmployee = firstNm+" "+midNm.charAt(0)+". "+lastNm;

            String email = firstNm +"@gmail.com";
            HRStaffPage.newHirePersonalEmail.sendKeys(email);
            Thread.sleep(2000);
            HRStaffPage.newHireCellPhone.sendKeys("1234567890");
            Thread.sleep(2000);
            HRStaffPage.newHireChooseFile.sendKeys("//Users//Eda//Desktop//Lamb.png");
            Thread.sleep(2000);
            HRStaffPage.newHireSave.click();


        }

        @Then("^I validate that new employee is in the staff list$")
        public void i_validate_that_new_employee_is_in_the_staff_list() throws Exception {
            System.out.println(newEmployee);
            ArrayList<String> employees = new ArrayList<>();
            //steps for storing all staff names into an empty arraylist
            String employeeName = "";
            for(WebElement member: HRStaffPage.staffList){
                employeeName = member.getText();
                employees.add(employeeName);

            }

            for(String employee : employees ){
                if ( employees.contains(newEmployee)) {
                    Assert.assertTrue(employees.contains(newEmployee));

                }
                else {
                    context.getScenarioManager().getScenario().write(" Fail; \n Expected employee: " + newEmployee + " \n Found employee: " + employee);
                    throw new Exception(" Fail; \n Expected employee: " + newEmployee + " \n Found employee: " + employee);

                }

            }

        }

        /**
         * Steps to select the correct option from dropdown menu using index
         * @param selectionVal
         * @param elementNm
         * @param type
         */
        @Then("^I select (\\d+). option from (\\w+) (dropdown|multiselect)$")
        public void i_select(int selectionVal, String elementNm, String type) {
            WebElement selectElement = (WebElement) WebElementMgr.getWebElement(context.getPageObjectMgr().getCurrentPage(), elementNm);
            try {
                Select sel = new Select(selectElement);
                sel.selectByIndex(selectionVal);
                context.getScenarioManager().getScenario().write("Selected " + selectionVal + " from " + elementNm + " " + type);
            } catch (Exception e) {
                context.getScenarioManager().getScenario().write("Unable to Select " + selectionVal + " from " + elementNm + " " + type + "; Error encountered:" + e.getMessage());
            }
        }

        /**
         * Steps to select option from dropdown menu
         * @param selectionVal
         * @param elementNm
         * @param type
         */
        @Then("^I select \"([^\"]*)\" from (\\w+) (dropdown|multiselect)$")
        public void i_select(String selectionVal, String elementNm, String type) {
            WebElement selectElement = (WebElement) WebElementMgr.getWebElement(context.getPageObjectMgr().getCurrentPage(), elementNm);
            try {
                Select sel = new Select(selectElement);
                sel.selectByValue(selectionVal);
                context.getScenarioManager().getScenario().write("Selected " + selectionVal + " from " + elementNm + " " + type);
            } catch (Exception e) {
                context.getScenarioManager().getScenario().write("Unable to Select " + selectionVal + " from " + elementNm + " " + type + "; Error encountered:" + e.getMessage());
            }
        }
        /**
         * Step to add a picture
         * @param pic
         * @param picLocation
         */
        @Then("^I upload picture (\\w+) from \"([^\"]*)\"$")
        public void i_upload_picture_something_from_something(String pic, String picLocation) {
            WebElement uploadPic = (WebElement) WebElementMgr.getWebElement(context.getPageObjectMgr().getCurrentPage(), pic);
            uploadPic.sendKeys(picLocation);
        }


        /**
         * Steps to validate the person registered new is on the list
         * @param person
         * @param staffList
         * @throws Exception
         */
        @Then("^I validate that new staff member \"([^\"]*)\" is in the (\\w+)$")
        public void i_validate_that_new_staff_member_with_id_as_something_is_on_the_something(String person, String staffList) throws Exception {
            List<WebElement> staff = (List<WebElement>) WebElementMgr.getWebElement(context.getPageObjectMgr().getCurrentPage(), staffList);

            ArrayList<String> employees = new ArrayList<>();

            String employeeName = "";
            for (WebElement member : staff) {

                employeeName = member.getText();
                employees.add(employeeName);
            }

            for (String employee : employees) {

                if ( employees.contains(person)) {
                    Assert.assertTrue(employees.contains(person));


                }

                else {
                    context.getScenarioManager().getScenario().write(" Fail; \n Expected employee: " + person + " \n Found employee: " + employee);
                    throw new Exception(" Fail; \n Expected employee: " + person + " \n Found employee: " + employee);

                }

            }

        }

        }

