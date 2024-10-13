package US_405_;

import Utility.BaseDriverParameter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {
    public Elements() {
        PageFactory.initElements(BaseDriverParameter.driver, this);
    }

    @FindBy(xpath = "//i[@class='icon-user small']")
    public WebElement profilIcon;

    @FindBy(xpath = "//ul[@id='user-account-menu']//a")
    public WebElement myAccountLink;


    @FindBy(xpath = "//input[@id='patient-search']")
    public WebElement serachBox;

    @FindBy(xpath = "//div[@class='task']/i[@class='icon-lock']")
    public WebElement changePassword;

    @FindBy(xpath = "//div[@class='task']/i[@class='icon-cog']")
    public WebElement myLanguages;

}
