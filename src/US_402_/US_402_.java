package US_402_;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_402_ extends BaseDriver {
    @Test(dataProvider = "userPassword")
    public Object[][] Test() {
        driver.get("https://openmrs.org/tr/");

        WebElement demo = driver.findElement(By.cssSelector("li[class='menu-item tg-header-button-wrap tg-header-button-one']>a"));
        demo.click();


        WebElement explore = driver.findElement(By.xpath("(//div[@class='elementor-button-wrapper'])[2]"));
        explore.click();

        WebElement enterOpen = driver.findElement(By.xpath("(//div[@class='elementor-button-wrapper'])[4]"));
        enterOpen.click();

        WebElement username = driver.findElement(By.id("input[id='username']"));
        username.sendKeys("admin");

        WebElement password = driver.findElement(By.id("input[id='password']"));
        password.sendKeys("Admin123");

        WebElement location = driver.findElement(By.cssSelector("ul[class='select']>:nth-child(1)"));
        location.click();

        WebElement login = driver.findElement(By.className("input[class='btn confirm']"));

        Assert.assertTrue(driver.getCurrentUrl().contains("home"), "Giriş yapılamadı");


        return new Object[0][];
    }
}

