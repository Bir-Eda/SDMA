package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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

    @FindBy (how = How.XPATH, using = "//select[@xpath='1']')]")
    public static WebElement salutationDropDown;

    @FindBy (how = How.XPATH, using = "//label[text()='First Name:']")
    public static WebElement newHireFirstName;

    @FindBy (how = How.XPATH, using = "//label[text()='Middle Name:']")
    public static WebElement newHireMiddleName;

    @FindBy (how = How.XPATH, using = "//label[text()='Last Name:']")
    public static WebElement newHireLastName;

    @FindBy (how = How.XPATH, using = "//label[text()='Vacant Positions:']")
    public static WebElement newHireVacantPositions;

    @FindBy (how = How.XPATH, using = "//input[@xpath='1']")
    public static WebElement newHirePersonalEmail;

    @FindBy (how = How.XPATH, using = "(//label[text()='Cell Phone:'])[position()=2]")
    public static WebElement newHireCellPhone;

    @FindBy (how = How.XPATH, using = "(//input[@type='file'])[position()=1]")
    public static WebElement newHireChooseFile;

    @FindBy (how = How.XPATH, using = "//*[contains(text(),'Cancel')]")
    public static WebElement newHireCancel;

    @FindBy (how = How.XPATH, using = "//button[@class='btn btn-primary'] ")
    public static WebElement newHireSave;
}





