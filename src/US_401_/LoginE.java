package US_401_;

import Utility.BaseDriverParameter;
import Utility.BaseDriverParameter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginE extends ParentE{

    public LoginE()
    {
        PageFactory.initElements(BaseDriverParameter.driver, this);
    }

    @FindBy(xpath = "//a[@class='zak-button']")
    public WebElement demoButton;

    @FindBy(xpath = "(//div[contains(@class,'elementor-widget')]//a/span)[4]")
    public WebElement EnterTheOpenMRS2Demo;

    @FindBy(id = "username")
    public WebElement userNameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//ul[@id='sessionLocation']/li")
    public List<WebElement> sessionLocation;

    @FindBy(id = "loginButton")
    public WebElement logInButton;

    @FindBy(id ="sessionLocationError" )
    public WebElement locationSessionText;

    @FindBy(id = "error-message")
    public WebElement  invalidNamePassText;

    @FindBy(xpath = "//div[starts-with(@class,'col')]/h4")
    public WebElement textControl;

}
