package com.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestApp;

public class HomePage {

    WebDriver driver = TestApp.getInstance().getDriver();

    public void selectRegisterMenu(){
        TestApp.getInstance().waitForElement(By.linkText("REGISTER"),20);
        driver.findElement(By.linkText("REGISTER")).click();

    }
}
