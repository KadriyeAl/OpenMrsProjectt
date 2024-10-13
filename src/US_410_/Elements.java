package US_410_;

import Utility.BaseDriverParameter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {
    public Elements() {
        PageFactory.initElements(BaseDriverParameter.driver, this);
    }
    @FindBy(xpath = "//*[@id=\"appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension\"]")
    public WebElement appointmentScheduling;

    @FindBy(xpath = "(//a[contains(@id,'appointmentschedulingui')])[3]")
    public WebElement manageProviderSchedules;

    @FindBy(xpath = "//input[@id='patient-search']")
    public WebElement serachBox;

    @FindBy(xpath = "//tr[@class='odd']")
    public WebElement patientDetails;

    public static final String noteErrorText = "Your computer is not set to the right time zone. Please change" +
            " to Coordinated Universal Time and then close and restart your browser to assure proper scheduling functionality.";
    @FindBy(xpath = "//div[@class='note error']//p")
    public WebElement noteError;

}
