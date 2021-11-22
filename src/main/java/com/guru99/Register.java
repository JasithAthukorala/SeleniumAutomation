package com.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {

    public void setFirstName(WebDriver driver, String firstName){
        waitUntilNextElementAppears(driver,By.name("firstName"),20);
        driver.findElement(By.name("firstName")).sendKeys(firstName);
    }

    public void setLastName(WebDriver driver, String lastName){
        driver.findElement(By.name("lastName")).sendKeys(lastName);
    }

    public void setPhoneNo(WebDriver driver, String phoneNo){
        driver.findElement(By.name("phone")).sendKeys(phoneNo);
    }

    public void setEmail(WebDriver driver, String email){
        driver.findElement(By.id("userName")).sendKeys(email);
    }

    public void setUserName(WebDriver driver, String userName){
        driver.findElement(By.id("email")).sendKeys(userName);
    }

    public void setPassword(WebDriver driver, String password){
        driver.findElement(By.name("password")).sendKeys(password);
    }

    public void setConfirmPassword(WebDriver driver, String confirmPassword){
        driver.findElement(By.name("confirmPassword")).sendKeys(confirmPassword);
    }

    public void submit(WebDriver driver){
        driver.findElement(By.name("submit")).click();
    }



    public WebElement waitUntilNextElementAppears(WebDriver driver, By Locator, int timeOut) {
        WebElement element = new WebDriverWait(driver, timeOut).until(
                ExpectedConditions.presenceOfElementLocated(Locator)
        );

        return element;
    }


}
