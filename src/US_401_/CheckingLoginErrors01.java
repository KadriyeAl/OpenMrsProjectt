package US_401_;

import UData.InvalidData;
import Utility.BaseDriverParameterE;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckingLoginErrors01 extends BaseDriverParameterE {

    @Test
    public void LoginErrorsControlTest01()
    {
        driver.get("https://openmrs.org/tr/");
        LoginE le =new LoginE();
     wait.until(ExpectedConditions.visibilityOf(le.demoButton)).click();
        wait.until(ExpectedConditions.visibilityOf(le.EnterTheOpenMRS2Demo)).click();
        le.userNameBox.sendKeys(InvalidData.userName);
        le.passwordBox.sendKeys(InvalidData.password);
        le.logInButton.click();
        wait.until(ExpectedConditions.visibilityOf(le.locationSessionText));
        Assert.assertTrue(le.locationSessionText.getText().equals("You must choose a location!"));

    }
    }

