package com.guru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.PropertyFileReader;

public class RegisterNewUserTest1 {

    PropertyFileReader prop = new PropertyFileReader();
    String baseURL = prop.getProperty("config", "url");
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "F:\\QATrainingProgramme\\Day03\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();
        Home home = new Home();
        home.selectRegisterMenu(driver);
    }

    @Test
    public void testNewUserCreation(){
        Register register = new Register();
        register.setFirstName(driver,"Jasith");
        register.setLastName(driver,"Athukorala");
        register.setPhoneNo(driver,"077123456789");
        register.setEmail(driver,"jasith@gmail.com");
        register.setUserName(driver,"Jviduranga");
        register.setPassword(driver,"Jasith99");
        register.setConfirmPassword(driver,"Jasith99");
        register.submit(driver);
        RegisterSuccess registerSuccess = new RegisterSuccess();
        String actualMessage = registerSuccess.getSalutationMessage(driver);
        Assert.assertEquals(actualMessage,"XXXXXXX","Fail to Create New User");



    }


}
