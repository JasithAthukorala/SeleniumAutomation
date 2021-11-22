package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerCreation {

    public void setFirstName(WebDriver driver, String firstName){
        waitUntilNextElementAppears(driver,By.name("fname"),20);
        driver.findElement(By.name("fname")).sendKeys(firstName);
    }


    public void setLastName(WebDriver driver, String lastName){
        waitUntilNextElementAppears(driver,By.name("lname"),20);
        driver.findElement(By.name("lname")).sendKeys(lastName);
    }


    public void setEmail(WebDriver driver, String Email){
        waitUntilNextElementAppears(driver,By.name("email"),20);
        driver.findElement(By.name("email")).sendKeys(Email);
    }


    public void setPassword(WebDriver driver, String Password){
        waitUntilNextElementAppears(driver,By.name("password"),20);
        driver.findElement(By.name("password")).sendKeys(Password);
    }


    public void setMobileNumber(WebDriver driver, String MobileNumber){
        waitUntilNextElementAppears(driver,By.name("mobile"),20);
        driver.findElement(By.name("mobile")).sendKeys(MobileNumber);
    }


    public void setAddress1(WebDriver driver, String Address1){
        waitUntilNextElementAppears(driver,By.name("address1"),20);
        driver.findElement(By.name("address1")).sendKeys(Address1);
    }


    public void setAddress2(WebDriver driver, String Address2){
        waitUntilNextElementAppears(driver,By.name("address2"),20);
        driver.findElement(By.name("address2")).sendKeys(Address2);
    }




    public WebElement waitUntilNextElementAppears(WebDriver driver,By Locator, int timeOut) {
        WebElement element = new WebDriverWait(driver, timeOut).until(
                ExpectedConditions.presenceOfElementLocated(Locator)
        );

        return element;
    }


}
