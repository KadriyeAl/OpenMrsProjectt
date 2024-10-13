package US_404_;
import Utility.BaseDriver;
import Utility.Tools;
import com.beust.jcommander.Parameter;
import org.junit.Test;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class testing404POM extends BaseDriver {

    @Test
    @Parameter(names = "login")

    public void Testing404() {
        Elements_404_ elements = new Elements_404_();


        driver.get("https://openmrs.org/tr/");

        elements.demoButton.click();

        //wait.until(ExpectedConditions.visibilityOfElementLocated(EnterTheOpenMRS2Demo)
        elements.EnterTheOpenMRS2Demo.click();

        elements.userName.sendKeys("admin");
        elements.password.sendKeys("Admin123");


        int randomNum = Tools.randomGenerator(elements.sessionLocation.size());
        System.out.println("randomNum = " + randomNum);

        String sessionLocationName = elements.sessionLocation.get(randomNum).getText();
        elements.sessionLocation.get(randomNum).click();

        elements.logInBuuton.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.registerApatient));
        elements.registerApatient.click();

        elements.givenName.sendKeys("Jane");
        elements.middelName.sendKeys("Annie");
        elements.familyName.sendKeys("Parker");
        elements.nextButton.click();

        elements.gender.click();
        elements.genderSelect.click();


        elements.birthdaySection.click();
        elements.EstimatedYear.sendKeys("39");
        elements.EstimatedMonth.sendKeys("08");

        elements.confirmButton.click();







        }
    }



