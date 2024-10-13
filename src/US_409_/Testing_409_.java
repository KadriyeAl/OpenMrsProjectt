package US_409_;

import Utility.BaseDriver;

import Utility.Tools;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class Testing_409_ extends BaseDriver {
    @Test
    public void Login2()  {

        driver.get("https://openmrs.org/tr/");
        Actions actions = new Actions(driver);


        WebElement demoButton = driver.findElement(By.xpath("//a[@class='zak-button']"));
        demoButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'elementor-widget')]//a/span)[4]")));
        WebElement EnterTheOpenMRS2Demo = driver.findElement(By.xpath("(//div[contains(@class,'elementor-widget')]//a/span)[4]"));
        EnterTheOpenMRS2Demo.click();

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("admin");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Admin123");

        List<WebElement> sessionLocation = driver.findElements(By.xpath("//ul[@id='sessionLocation']/li"));


        int randomNum = Tools.randomGenerator(sessionLocation.size());
        System.out.println("randomNum = " + randomNum);

        String sessionLocationName = sessionLocation.get(randomNum).getText();
        sessionLocation.get(randomNum).click();

        WebElement logInBuuton = driver.findElement(By.id("loginButton"));
        logInBuuton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("registrationapp-basicRegisterPatient-homepageLink-registrationapp-basicRegisterPatient-homepageLink-extension")));
        WebElement registerApatient = driver.findElement(By.id("registrationapp-basicRegisterPatient-homepageLink-registrationapp-basicRegisterPatient-homepageLink-extension"));
        registerApatient.click();

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='fr7074-field']")));
        WebElement givenName = driver.findElement(By.xpath("//input[@name='givenName']"));
        actions.sendKeys(givenName)
                .sendKeys("Olivia")
                .sendKeys(Keys.TAB)
                .sendKeys("Rose")
                .sendKeys(Keys.TAB)
                .sendKeys("Johnson")
                .sendKeys(Keys.TAB)
                .perform();


        WebElement gender = driver.findElement(By.cssSelector("span[id='genderLabel']"));
        gender.click();

        WebElement gencerSelect = driver.findElement(By.cssSelector("option[value='F']"));
        gencerSelect.click();

        WebElement BirthDaySection = driver.findElement(By.cssSelector("span[id='birthdateLabel']"));
        BirthDaySection.click();

        WebElement birthDay = driver.findElement(By.cssSelector("[id='birthdateDay-field']"));
        actions.sendKeys(birthDay)
                .sendKeys("30")
                .sendKeys(Keys.TAB)
                .click().perform();

        WebElement dropdownElement = driver.findElement(By.cssSelector("[id='birthdateMonth-field']"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue("1");
        actions.click(dropdownElement)
                .sendKeys(Keys.TAB)
                .sendKeys("42")
                .sendKeys(Keys.TAB)
                .sendKeys("Rose Lane, San Francisco, CA")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("San Francisco")
                .sendKeys(Keys.TAB)
                .sendKeys("California")
                .sendKeys(Keys.TAB)
                .sendKeys("USA")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("(555) 678-9012")
                .sendKeys(Keys.TAB)
                .perform();

        WebElement dropdownRelative = driver.findElement(By.id("relationship_type"));
        Select relativedd = new Select(dropdownRelative);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("relationship_type")));
        relativedd.selectByVisibleText("Parent");

        WebElement parentName = driver.findElement(By.xpath("//input[@placeholder='Person Name']"));
        parentName.sendKeys("Jane Parker");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("next-button")));
        WebElement confirm = driver.findElement(By.id("next-button"));
        confirm.click();

       // Assert.assertTrue(driver.getCurrentUrl().contains("registrationapp"));

        WebElement iconHome=driver.findElement(By.xpath("//a[@href='/openmrs/index.htm']//i"));
        iconHome.click();

        WebElement dataManengement=driver.findElement(By.id("coreapps-datamanagement-homepageLink-coreapps-datamanagement-homepageLink-extension"));
        dataManengement.click();

        WebElement mergePatient=driver.findElement(By.id("coreapps-mergePatientsHomepageLink-app"));
        mergePatient.click();

        WebElement patientId=driver.findElement(By.id("patient1-text"));
        patientId.sendKeys("100HYE");

        WebElement patientId2=driver.findElement(By.id("patient2-text"));
        patientId2.sendKeys("100JAN");

        WebElement contunieButton=driver.findElement(By.id("confirm-button"));
        contunieButton.click();

        WebElement secondPatient=driver.findElement(By.cssSelector("[id='second-patient']"));
        secondPatient.click();

        WebElement yesContinue=driver.findElement(By.xpath("//input[@id='confirm-button']"));
        yesContinue.click();

        String expectedUrl="https://demo.openmrs.org/openmrs/coreapps/patientdashboard/patientDashboard.page?patientId=604&";
        String actualUrl=driver.getCurrentUrl();

        Assert.assertTrue(expectedUrl==actualUrl, "Merge is done");







    }
}
