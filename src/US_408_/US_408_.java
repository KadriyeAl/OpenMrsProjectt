package US_408_;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class US_408_ extends BaseDriver {

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

        WebElement logInButton = driver.findElement(By.id("loginButton"));
        logInButton.click();

        WebElement fprButton = driver.findElement(By.cssSelector("a[id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']"));
        fprButton.click();

        List<WebElement> totalNumber = driver.findElements(By.xpath("//tbody[@role='alert']/tr"));
        String num= String.valueOf(totalNumber.size());
        System.out.println("num = " + num);

        WebElement lineNumber = driver.findElement(By.xpath("//div[@class='dataTables_info']"));
        String aa=lineNumber.getText();
        System.out.println("aa = " + aa);

        Assert.assertTrue(aa.contains(num), "Toplam sayiyle Satir sayisi ayni");
    }
}