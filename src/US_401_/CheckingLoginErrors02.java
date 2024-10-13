package US_401_;

import UData.InvalidData;
import Utility.BaseDriverParameterE;
import Utility.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckingLoginErrors02 extends BaseDriverParameterE {
    public static US_401_.LoginE le = new US_401_.LoginE();

    @Test
    public void LoginErrorsControlTest01() {
        driver.get("https://openmrs.org/tr/");

        wait.until(ExpectedConditions.visibilityOf(le.demoButton)).click();
        wait.until(ExpectedConditions.visibilityOf(le.EnterTheOpenMRS2Demo)).click();
        le.mySendKeys(le.userNameBox, InvalidData.userName);
        le.mySendKeys(le.passwordBox, InvalidData.password);

        int randomNum = Tools.randomGenerator(le.sessionLocation.size());
        System.out.println(randomNum);
        le.sessionLocation.get(randomNum).click();
        le.myClick(le.logInButton);
        wait.until(ExpectedConditions.visibilityOf(le.invalidNamePassText));
        Assert.assertTrue(le.invalidNamePassText.getText().equals("Invalid username/password. Please try again."));
    }

}

