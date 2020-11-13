package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

/**
 *This class includes locators of the all Web Elements in the Staff page
 */
public class HRStaffPage {

    @FindBy(how = How.XPATH, using = "//div[@class='links']/a")
    public static WebElement loadLogin;

    @FindBy (how = How.ID, using = "email")
    public static WebElement emailSection;

    @FindBy (how= How.ID, using = "password")
    public static WebElement passwordSection;

    @FindBy (how = How.XPATH, using = "//button[@type='submit']")
    public static WebElement loginButton;

    @FindBy (how = How.XPATH, using = "//*[@class='navbar-brand']")
    public static WebElement buffSciMain;

    @FindBy (how = How.XPATH, using = "//button[contains(text(),'New Hire')]")
    public static WebElement newHireButton;

    @FindBy (how = How.XPATH, using = "//h5[contains(text(),'New Hire')]")
    public static WebElement newHireHeaderText;

    @FindBy (how = How.XPATH, using = "//*[@id='newHireForm']/div/div[1]/select")
    public static WebElement salutationDropDown;

    @FindBy (how = How.XPATH, using = "//*[@id='newHireForm']/div/div[1]/select/option")
    public static List<WebElement> salutationDropDownList;

    @FindBy (how = How.XPATH, using = "//div[@class='col-sm-4']//input[@class='form-control']")
    public static WebElement newHireFirstName;

    @FindBy (how = How.XPATH, using = "//label[text()='Middle Name:']//following-sibling::input")
    public static WebElement newHireMiddleName;

    @FindBy (how = How.XPATH, using = "//label[text()='Last Name:']//following-sibling::input")
    public static WebElement newHireLastName;

    @FindBy (how = How.XPATH, using = "//div[@class='form-group col-sm-6']//select[@class='form-control']")
    public static WebElement newHireVacantPositions;

    @FindBy (how = How.XPATH, using = "//*[@id='newHireForm']/div/div[7]/div/input")
    public static WebElement newHirePersonalEmail;

    @FindBy (how = How.XPATH, using = "//*[@id='newHireForm']/div/div[8]/div/input")
    public static WebElement newHireCellPhone;

    @FindBy (how = How.XPATH, using = "//*[@id='newHireForm']/div/div[9]/input[2]")
    public static WebElement newHireChooseFile;

    @FindBy (how = How.XPATH, using = "//*[contains(text(),'Cancel')]")
    public static WebElement newHireCancel;

    @FindBy (how = How.XPATH, using = "//button[@class='btn btn-primary']")
    public static WebElement newHireSave;

    @FindBy (how = How.CLASS_NAME, using = "toast-message")
    public static WebElement savingStatNewHire;

    @FindBy (how = How.XPATH, using = "//a[@class='navbar-brand']")
    public static WebElement buffSciButton;

    @FindBy(how = How.XPATH, using = "//div[@class='card-body overflow-auto']/a")
    public static List<WebElement> staffList;

    @FindBy (how = How.CSS, using = "#v-pills-tab .card-body a")
    public static WebElement newStaffName;  // Abraham F. Sencer

    @FindBy (how = How.XPATH, using = "//*[@placeholder='Search by Name']")
    public static WebElement searchByName;

    @FindBy(how = How.XPATH, using = "//div[@class='card-body overflow-auto']")
    public static List<WebElement> newWorkersList;


    @FindBy (how = How.XPATH, using = "//*[contains(text(),'Edit Basic Info')]")
    public static WebElement editBasicInfo;

    @FindBy (how = How.XPATH, using = "(//*[@id='basicInfoForm']/div/div/select)[position()=1]")
    public static WebElement editBasicInfoStatus;

    @FindBy (how = How.XPATH, using = "//div[@id='basicInfoModal___BV_modal_outer_']//div[2]//select[1]")
    public static WebElement editBasicInfoSalutation;

    @FindBy (how = How.XPATH, using = "//div[@class='col-sm-4']//input[@class='form-control']")
    public static WebElement efirstName;

    @FindBy (how = How.XPATH, using = "//div[5]//input[1]")
    public static WebElement emiddleName;

    @FindBy (how = How.XPATH, using = "//div[6]//input[1]")
    public static WebElement elastName;

    @FindBy (how = How.XPATH, using = " //div[7]//div[1]//input[1]")
    public static WebElement ephone;

    @FindBy (how = How.XPATH, using = " //div[8]//input[1]")
    public static WebElement eroom;

    @FindBy (how = How.XPATH, using = " //div[9]//div[1]//input[1]")
    public static WebElement epersonalEmail;

    @FindBy (how = How.XPATH, using = "//div[10]//div[1]//input[1]")
    public static WebElement ecellPhone;

    @FindBy (how = How.XPATH, using = "//div[@id='basicInfoModal___BV_modal_outer_']//input[2]")
    public static WebElement echooseFile;

    @FindBy (how = How.XPATH, using = "//button[@class='btn btn-primary']")
    public static WebElement esaveButton;

    @FindBy (how = How.XPATH, using = "//div[@class='toast-message']")
    public static WebElement egreenUpdate;

    @FindBy (how = How.XPATH, using = "//div[div[text()='Full Name:']]//div[2]")
    public static WebElement efullName;


    @FindBy (how = How.XPATH, using = "//*[@class='btn btn-primary']")
    public static WebElement editBasicInfoSave;

    @FindBy(how = How.XPATH, using = "//*[@placeholder='Search by Name']")
    public static WebElement inputBox;

    @FindBy(how = How.XPATH, using = "//*[@id='basic-tab']/div/div/div/div[8]/label")
    public static WebElement emailInputBoxTag;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Termination')]")
    public static WebElement termination;

    @FindBy(how = How.XPATH, using = "//*[@class='modal-header']")
    public static WebElement terminationPopUp;

//    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[1]/div/div/header/button")
//    public static WebElement terminationPopUpClose;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='mm/dd/yyyy']")
    public static WebElement terminationDate;

    @FindBy(how = How.XPATH, using = "//*[@id='terminationForm']/div/div[2]/select")
    public static WebElement terminationReason;

    @FindBy(how = How.XPATH, using = "//*[@id='terminationForm']/div/div[2]/select/option")
    public static List<WebElement> terminationReasonList;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Save')]")
    public static WebElement terminationSave;

    @FindBy(how = How.XPATH, using = "(//*[contains(text(),'Staff')])[position()=1]")
    public static WebElement terminationStaff;

    @FindBy(how = How.XPATH, using = "//*[@placeholder='Search by Name']")
    public static WebElement terminationStaffSearchByName;

    @FindBy(how = How.XPATH, using = "//a[@id='79939']")
    public static WebElement terminationStaffName;

    @FindBy(how = How.XPATH, using = "//div[@class='card-body overflow-auto']")
    public static List<WebElement> terminationStaffSearchByNameList;

    @FindBy(how = How.XPATH, using = "(//*[@class='form-control m-1'])[position()=1]")
    public static WebElement jobBox;

    @FindBy(how = How.XPATH, using = "(//*[@class='form-control m-1'])[position()=1]/option[1]")
    public static List<WebElement> jobBoxDropDown;

//    @FindBy(how = How.XPATH, using = "//*[@class='card-body overflow-auto']")
//    public static List<WebElement> jobBoxList;

    @FindBy(how = How.XPATH, using = "(//*[contains(text(),'BuffSci')])[position()=3]")
    public static WebElement homeBuffSci;

    @FindBy(how = How.XPATH, using = "//*[@class='os-content']")
    public static List<WebElement> allBuffSciMenu;

    @FindBy(how = How.XPATH, using = "//*[@class='nav-item menu-open']/a/p")
    public static WebElement staffMenu;

    @FindBy(how = How.XPATH, using = "(//*[@class='nav-item']/a/p)[position()=1]")
    public static WebElement applicantsMenu;

    @FindBy(how = How.XPATH, using = "(//*[@class='nav-item']/a/p)[position()=2]")
    public static WebElement positionsMenu;

    @FindBy(how = How.XPATH, using = "//*[@class='btn btn-primary float-sm-right text-white']")
    public static WebElement addNewPositions;

    @FindBy(how = How.XPATH, using = "(//*[@class='nav-item']/a/p)[position()=3]")
    public static WebElement positionTypeMenu;

    @FindBy(how = How.XPATH, using = "(//*[@class='nav-item']/a/p)[position()=4]")
    public static WebElement permissionsMenu;

    @FindBy(how = How.XPATH, using = "(//*[@class='nav-item']/a/p)[position()=5]")
    public static WebElement staffRollBackMenu;

    @FindBy(how = How.XPATH, using = "(//*[@class='nav-item']/a/p)[position()=6]")
    public static WebElement snapShotMenu;

   // @FindBy(how = How.XPATH, using = "")
   // public static WebElement ;

    //26


    @FindBy(how = How.XPATH, using = "(//*[@name='location_id'])[position()=1]")
    public static WebElement selectLocationPosition;

    @FindBy(how = How.XPATH, using = "(//*[@name='location_id'])[position()=1]/option[3]")
    public static WebElement selectDistrict;

    @FindBy(how = How.XPATH, using = "(//*[@name='position_type_id'])[position()=1]")
    public static WebElement selectPositionId;

    @FindBy(how = How.XPATH, using = "(//*[@name='position_type_id'])[position()=1]/option[4]")
    public static WebElement selectCFO;

    @FindBy(how = How.XPATH, using = "//*[@name='status']")
    public static WebElement positionsStatus;

    @FindBy(how = How.XPATH, using = "//*[@name='status']/option[2]")
    public static WebElement positionsStatusTwo;



//    @FindBy(how = How.XPATH, using = "")
//    public static WebElement



    @FindBy(how = How.XPATH, using = "//*[@class='fa fa-trash']")
    public static WebElement trashButton;

    @FindBy(how = How.XPATH, using = "(//*[@type='submit'])[position()=2]")
    public static WebElement positionsDeleteMenu;

    // Add New Position

    @FindBy(how = How.XPATH, using = "//*[@class='btn btn-primary float-sm-right text-white']")
    public static WebElement addNewButton;

    @FindBy(how = How.XPATH, using = "(//*[@class='modal-title'])[position()=1]")
    public static WebElement addNewPositionPop;

    @FindBy(how = How.XPATH, using = "(//*[@class='form-control'])[position()=1]")
    public static WebElement newPositionTitle;

    @FindBy(how = How.CSS, using = "#select2-user_id-61-container")
    public static WebElement addNewVacant;

    @FindBy(how = How.XPATH, using = "(//*[@name='position_type_id'])[position()=2]")
    public static WebElement addNewPositionType;

    @FindBy(how = How.XPATH, using = "//*[@name='reports_to_id']")
    public static WebElement addNewReports;

    @FindBy(how = How.XPATH, using = "(//*[@name='location_id'])[position()=2]")
    public static WebElement addNewLocation;

    @FindBy(how = How.XPATH, using = "//*[@id='notes']/textarea")
    public static WebElement addNewNote;

    @FindBy(how = How.XPATH, using = "//*[@type='submit']")
    public static WebElement addNewSave;









}
