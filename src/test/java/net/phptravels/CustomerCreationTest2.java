package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.PropertyFileReader;

public class CustomerCreationTest2 {

    PropertyFileReader prop = new PropertyFileReader();
    String baseURL = prop.getProperty("config", "url");
    WebDriver driver;

    @BeforeMethod
    public void setUP() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\QATrainingProgramme\\Day03\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();
        waitUntilNextElementAppears(By.name("email"),30);

        Login login = new Login();
        login.loginSuccess(driver, "admin@phptravels.com", "demoadmin");

        Home home = new Home();
        home.selectAccountsMenu(driver);
        home.selectAccountsMenu(driver);

        CustomerManagement customerManagement = new CustomerManagement();
        customerManagement.addCustomer(driver);

    }

    @Test
    public void testCustomerCreation() throws InterruptedException {

        CustomerCreation customerCreation = new CustomerCreation();
        customerCreation.setFirstName(driver,"Jasith");
        customerCreation.setLastName(driver,"Athukorala");
        customerCreation.setEmail(driver,"jasith@gmail.com");
        customerCreation.setPassword(driver,"J123456");
        customerCreation.setMobileNumber(driver,"0771568265");
        customerCreation.setAddress1(driver,"Bandarawaththa");
        customerCreation.setAddress2(driver,"Gampaha");



    }


    public WebElement waitUntilNextElementAppears(By Locator, int timeOut) {
        WebElement element = new WebDriverWait(driver, timeOut).until(
                ExpectedConditions.presenceOfElementLocated(Locator)
        );

        return element;
    }



}
