package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseDriverParameter {

    public static WebDriver driver;
    public  WebDriverWait wait;

    @BeforeClass
    @Parameters("BrowserTipi")
    public void BaslangicIslemleri(String BrowserTipi){
       // System.out.println("Başlangıç işlemleri yapılıyor");

        switch (BrowserTipi.toLowerCase())
        {
            case "firefox":driver= new FirefoxDriver();break;
            case "edge":driver=new EdgeDriver();break;
            default:driver=new ChromeDriver();

        }



        //driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));


    }

    @AfterClass
    public void KapanisIslemleri(){
        //System.out.println("Kapanis işlemleri yapılıyor");

        Tools.Bekle(3);
        driver.quit();
    }


}
