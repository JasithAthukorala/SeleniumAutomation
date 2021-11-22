package utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class TestApp {

    private WebDriver driver;
    private static TestApp myObj;
    // public static WebDriver driver;
    utils.PropertyFileReader property = new PropertyFileReader();

    public static TestApp getInstance() {
        if (myObj == null) {
            myObj = new TestApp();
            return myObj;
        } else {
            return myObj;
        }
    }

    //get the selenium driver
    public WebDriver getDriver() {
        return driver;
    }

    //when selenium opens the browsers it will automatically set the web driver
    private void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public static void setMyObj(TestApp myObj) {
        TestApp.myObj = myObj;
    }

    public void openBrowser() {
        //String chromeDriverPath = property.getProperty("config", "chrome.driver.path");
        //String chromeDriverPath = property.getProperty("config", getChromeDriverFilePath());
        System.setProperty("webdriver.chrome.driver", getChromeDriverFilePath());
       // ChromeOptions options = new ChromeOptions();
      //  options.addArguments("--disable-notifications");
       // options.addArguments("disable-infobars");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void navigateToURL() {
        String url =property.getProperty("config","url");
        driver.get(url);
    }

    public void closeBrowser() {
        driver.quit();
    }

    public WebElement waitForElement(By locator, int timeout) {
        WebElement element = new WebDriverWait(TestApp.getInstance().getDriver(), timeout).until
                (ExpectedConditions.presenceOfElementLocated(locator));
        return element;
    }

    private String getChromeDriverFilePath(){
        URL res = getClass().getClassLoader().getResource("chromedriver");
        File file = null;
        try {
            file = Paths.get(res.toURI()).toFile();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return file.getAbsolutePath();
    }

}
