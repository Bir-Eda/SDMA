package PageFactory.Sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.List;

public class BuffSciNewHirePage {
    @FindBy(xpath = "//a[contains(@class,'btn-primary')]")
    public static WebElement loadLogin;

    @FindBy(id = "email")
    public static WebElement emailSection;

    @FindBy(id = "password")
    public static WebElement passwordSection;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public static WebElement loginButton;

    //Navigating to NewHireTab
    @FindBy(xpath = "//button[text()='New Hire']")
    public static WebElement newHireButton;

    //On NewHireTab
    @FindBy(xpath = "//h5[@id='newHireModal___BV_modal_title_']")
    public static WebElement newHirePopUp;

    @FindBy(xpath = "//div[@class='form-group col-sm-3']//select[@class='form-control']")
    public static WebElement salutation;

    @FindBy(xpath = "//div[@class='form-group col-sm-3']//select[@class='form-control']/option")
    public static List<WebElement> salutationTitles;

    @FindBy(xpath = "//option[contains(text(),'Mrs.')]")
    public static WebElement title;

    @FindBy(xpath = "//label[text()='First Name:']//following-sibling::input")
    public static WebElement firstName;

    @FindBy(xpath = "//label[text()='Middle Name:']//following-sibling::input")
    public static WebElement middleName;

    @FindBy(xpath = "//label[text()='Last Name:']//following-sibling::input")
    public static WebElement lastName;


    @FindBy(how= How.XPATH, using="//label[text()='Vacant Positions:']//parent::div/select")
    public static WebElement vacantPosition;

    @FindBy(xpath = "//label[text()='Personal Email:']//parent::div//input[@class='form-control']")
    public static WebElement personalEmail;

    @FindBy(xpath = "//label[text()='Cell Phone:']//parent::div//input[@class='form-control']")
    public static WebElement cellPhoneNumber;

    @FindBy(xpath="//div[@id='newHireModal___BV_modal_outer_']//input[2]")
    public static WebElement uploadPic;


    @FindBy(xpath = "//button[contains(@class,'btn btn-primary')]")
    public static WebElement saveButton;

    @FindBy(xpath="//*[@class='navbar-brand']")
    public static WebElement buffSciButton;

    @FindBy(xpath = "//div[@class='card-body overflow-auto']/a")
    public static List<WebElement> staffList;
}
