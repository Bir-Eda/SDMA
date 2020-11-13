package stepDefs;

import PageFactory.HRStaffPage;
import Utilities.AutomationContext;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class Followers1_StepDefs {
    WebDriver driver;
    AutomationContext context;
    public Followers1_StepDefs(AutomationContext context){
        this.context=context;
    }
    List<String> myList=new ArrayList<>();


    /**
     * Step to choose a worker randomly
     */

    @Then("^I select a worker`s name from staffList$")
    public void i_select_a_workers_name_from_stafflist() throws InterruptedException {
        ArrayList<String>sList=new ArrayList<>();
        for(WebElement staff: HRStaffPage.staffList){
            sList.add(staff.getText());
        }
        int chosen=(int)(Math.random()*sList.size()+1);
        Thread.sleep(2000);
        System.out.println(chosen);
      //  System.out.println(sList.get(chosen));
        HRStaffPage.staffList.get(chosen).click();
    }

    /**
     * Step to edit worker's information in Edit Basic Info Sub-Page
     */

    @Then("^I edit worker`s information$")
    public void i_edit_workers_information() throws Throwable {
        Select selectStatus=new Select(HRStaffPage.editBasicInfoStatus);
        int rstatus=1;  //(int)(Math.random()*2);
        selectStatus.selectByIndex(rstatus);

        int rsalutation=2;  //(int)(Math.random() * 5) + 1;
        Select selectSalutation=new Select(HRStaffPage.editBasicInfoSalutation);
        selectSalutation.selectByIndex(rsalutation);

        Faker fake;
        fake=new Faker();

        String firstName = fake.name().firstName();
        this.myList.add(firstName);
        HRStaffPage.efirstName.clear();
        HRStaffPage.efirstName.sendKeys(firstName);

        String middleName=fake.name().nameWithMiddle();
        this.myList.add(middleName);
        HRStaffPage.emiddleName.clear();
        HRStaffPage.emiddleName.sendKeys(middleName);
        String lastName=fake.name().lastName();
        this.myList.add(lastName);
        HRStaffPage.elastName.clear();
        HRStaffPage.elastName.sendKeys(lastName);
        HRStaffPage.ephone.clear();
        HRStaffPage.ephone.sendKeys("1234");
        HRStaffPage.eroom.clear();
        HRStaffPage.eroom.sendKeys("13");
        String email=firstName+"@gmail.com";
        HRStaffPage.epersonalEmail.clear();
        HRStaffPage.epersonalEmail.sendKeys(email);
        HRStaffPage.ecellPhone.clear();
        HRStaffPage.ecellPhone.sendKeys("1234567890");
        HRStaffPage.echooseFile.sendKeys("/Users/Eda/Bugstar/src/test/resources/testdata/Lamb.png");


    }

    /**
     * Step to check worker's information in Edit Basic Info Sub-Page
     */

    @Then("^I check worker`s information changed$")
    public void i_check_workers_information_changed() throws Throwable {
        String fullName=this.myList.get(0)+" "+this.myList.get(1).substring(0, 1)+". "+this.myList.get(2);
        Assert.assertEquals(fullName, HRStaffPage.efullName.getText(), "not equel" );
    }


}
