package com.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterSuccess {


    public String getSalutationMessage(WebDriver driver){
        waitUntilNextElementAppears(driver,By.xpath("//*[contains(text(),'Dear')]"),20);
        return driver.findElement(By.xpath("//*[contains(text(),'Dear')]")).getText();
}

    public WebElement waitUntilNextElementAppears(WebDriver driver, By Locator, int timeOut) {
        WebElement element = new WebDriverWait(driver, timeOut).until(
                ExpectedConditions.presenceOfElementLocated(Locator)
        );

        return element;
    }




}
