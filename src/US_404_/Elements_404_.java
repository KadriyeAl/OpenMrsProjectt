package US_404_;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements_404_ {

    public Elements_404_() {
        PageFactory.initElements(BaseDriver.driver,this);
    }



    @FindBy(xpath="//a[@class='zak-button']")
    public WebElement demoButton;

    @FindBy (xpath="(//div[contains(@class,'elementor-widget')]//a/span)[4]")
    public WebElement EnterTheOpenMRS2Demo;

    @FindBy (id="username")
    public WebElement userName;

    @FindBy (id="password")
    public WebElement password;

    @FindBy (xpath="//ul[@id='sessionLocation']/li")
    public  List<WebElement> sessionLocation;

    @FindBy (id="loginButton")
    public WebElement logInBuuton;

    @FindBy (id="registrationapp-basicRegisterPatient-homepageLink-registrationapp-basicRegisterPatient-homepageLink-extension")
    public WebElement registerApatient;

    @FindBy (xpath="//input[@name='givenName']")
    public WebElement givenName;

    @FindBy (css="[name='middleName']")
    public  WebElement middelName;

    @FindBy (css = "[name='familyName']")
    public WebElement familyName;

    @FindBy (id="next-button")
    public WebElement nextButton;

    @FindBy (css="span[id='genderLabel']")
    public WebElement gender;

    @FindBy (css ="option[value='F']")
    public WebElement genderSelect;

    @FindBy (css="span[id='birthdateLabel']")
    public  WebElement birthdaySection;

    @FindBy (xpath ="(//p[@class='left])//(input)[6]")
    public WebElement EstimatedYear;

    @FindBy (xpath = "(//p[@class='left'])//(input)[7]")
    public WebElement EstimatedMonth;

    @FindBy(className = "submitButton confirm right focused")
    public WebElement confirmButton;

    @FindBy(className = "submitButton confirm right focused")
    public WebElement confirmButton2;

    @FindBy(xpath="//a[@href='/openmrs/index.htm']//i")
    public WebElement iconHome;

    @FindBy(id="coreapps-datamanagement-homepageLink-coreapps-datamanagement-homepageLink-extension")
    public WebElement dataManagement;






   // @FindBy (css="[id='birthdateDay-field']")
   // public  WebElement birthdayDay;

   // @FindBy (xpath = "//select[@class='month date-component requiredTitle focused']")
   // public List<WebElement> birthDayMonth;

    //  @FindBy (xpath = "//select[@class='month date-component requiredTitle focused']//option[9]")
   // public WebElement birtdayMonth;

   // @FindBy (xpath = "//input[@id='birthdateYear-field']")
   // public WebElement birthDayYear;





          //  WebElement selectElement = driver.findElement(By.id("selectElementId")); // Select elementinin id'si
    //Select select = new Select(selectElement);
















}
