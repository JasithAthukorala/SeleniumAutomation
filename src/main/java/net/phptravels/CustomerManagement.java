package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerManagement {

    public void addCustomer(WebDriver driver) {
        waitUntilNextElementAppears(driver,By.className("add_button"),20);
        driver.findElement(By.className("add_button")).click();
    }



    public WebElement waitUntilNextElementAppears(WebDriver driver,By Locator, int timeOut) {
        WebElement element = new WebDriverWait(driver, timeOut).until(
                ExpectedConditions.presenceOfElementLocated(Locator)
        );

        return element;
    }



}
