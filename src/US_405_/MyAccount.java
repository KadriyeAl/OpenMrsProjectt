package US_405_;

import Utility.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utility.BaseDriverParameterE.actions;

public class MyAccount extends BaseDriverParameter {
    @Test
    public void MyAccountTest() {
        Elements elements = new Elements();


        actions.moveToElement(elements.profilIcon).build().perform();
        wait.until(ExpectedConditions.visibilityOf(elements.myAccountLink));
        elements.myAccountLink.click();


        Assert.assertTrue(elements.myLanguages.isDisplayed(),"My Languages Not Displayed!");
        elements.myLanguages.click();
        driver.navigate().back();

        Assert.assertTrue(elements.changePassword.isDisplayed(),"Change Password Not Displayed!");
        elements.changePassword.click();
        driver.navigate().back();

        Assert.assertTrue(driver.getCurrentUrl().equals("https://demo.openmrs.org/openmrs/adminui/myaccount/myAccount.page"));

    }

}

