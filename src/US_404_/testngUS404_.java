package US_404_;

import Utility.BaseDriver;

import Utility.Tools;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

import java.util.List;

public class testngUS404_ extends BaseDriver {

    @Test


    public void Login() throws AWTException {
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

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='icon-user']")));
        WebElement registerApatient = driver.findElement(By.cssSelector("[class='icon-user']"));
        registerApatient.click();

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='fr7074-field']")));
        WebElement givenName = driver.findElement(By.xpath("//input[@name='givenName']"));
        actions.sendKeys(givenName)
                .sendKeys("Jane")
                .sendKeys(Keys.TAB)
                .sendKeys("Annie")
                .sendKeys(Keys.TAB)
                .sendKeys("Parker")
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
                .sendKeys("20")
                .sendKeys(Keys.TAB)
                .click().perform();

        WebElement dropdownElement = driver.findElement(By.cssSelector("[id='birthdateMonth-field']"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue("8");
        actions.click(dropdownElement)
                .sendKeys(Keys.TAB)
                .sendKeys("1985")
                .sendKeys(Keys.TAB)
                .perform();

       // WebElement confirmButton2=driver.findElement(By.xpath("//input[@class='submitButton confirm right focused']"));
       // confirmButton2.click();

        WebElement adress=driver.findElement(By.id("address1"));
        adress.sendKeys("456 Oak St, Dallas, TX");

        WebElement city=driver.findElement(By.id("cityVillage"));
        city.sendKeys("Dallas");

        WebElement state=driver.findElement(By.id("stateProvince"));
        state.sendKeys("Texas");

        WebElement country=driver.findElement(By.cssSelector("[id='country']"));
        country.sendKeys("USA");

        WebElement confirmButton2=driver.findElement(By.id("next-button"));
        confirmButton2.click();

        WebElement phoneNumber=driver.findElement(By.cssSelector("[name='phoneNumber']"));
        phoneNumber.sendKeys("(555) 234-5678");

        WebElement confirmButton3=driver.findElement(By.id("next-button"));
        confirmButton3.click();

        WebElement selectRelative=driver.findElement(By.id("relationship_type"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[@data-val='Parent']")));
        WebElement parent=driver.findElement(By.xpath("//option[@data-val='Parent']"));
        parent.click();

        WebElement relativeName=driver.findElement(By.cssSelector("[placeholder='Person Name']"));
        relativeName.sendKeys("John Doe");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("next-button")));
        WebElement confirm4=driver.findElement(By.id("next-button"));
        confirm4.click();

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("next-button")));
        WebElement confirm5=driver.findElement(By.xpath("//input[@id='submit']"));
        confirm5.click();



        //Assert.assertTrue(driver.getCurrentUrl().contains("registrationapp"));





    }
}


               /*
                .sendKeys("(555) 234-5678")
                .sendKeys(Keys.TAB)
                .perform();

        WebElement dropdownRelative = driver.findElement(By.id("relationship_type"));
        Select relativedd = new Select(dropdownRelative);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("relationship_type")));
        relativedd.selectByVisibleText("Parent");

        WebElement parentName=driver.findElement(By.xpath("//input[@placeholder='Person Name']"));
        parentName.sendKeys("John Doe");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("next-button")));
       WebElement confirm=driver.findElement(By.id("next-button"));
        confirm.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("registrationapp"));




































    }
    }

      */

