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

    @FindBy (how = How.XPATH, using = "//button[contains(text(),'New Hire')]")
    public static WebElement newHireButton;

    @FindBy (how = How.XPATH, using = "//h5[contains(text(),'New Hire')]")
    public static WebElement newHireHeaderText;

    @FindBy (how = How.XPATH, using = "//*[@id=\"newHireForm\"]/div/div[1]/select")
    public static WebElement salutationDropDown;

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

    @FindBy (how = How.XPATH, using = "(//input[@type='file'])[position()=1]")
    public static WebElement newHireChooseFile;

    @FindBy (how = How.XPATH, using = "//*[contains(text(),'Cancel')]")
    public static WebElement newHireCancel;

    @FindBy (how = How.XPATH, using = "//button[@class='btn btn-primary'] ")
    public static WebElement newHireSave;

    @FindBy (how = How.CLASS_NAME, using = "toast-message")
    public static WebElement savingStatNewHire;

    @FindBy (how = How.XPATH, using = "//a[@class='navbar-brand']")
    public static WebElement buffSciButton;

    @FindBy(how = How.XPATH, using = "//div[@class='card-body overflow-auto']/a")
    public static List<WebElement> staffList;


}