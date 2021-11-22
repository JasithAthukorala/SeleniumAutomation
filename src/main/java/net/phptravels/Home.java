package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {


    public void selectAccountsMenu(WebDriver driver) {
        waitUntilNextElementAppears(driver,By.linkText("ACCOUNTS"),10);
        driver.findElement(By.linkText("ACCOUNTS")).click();
    }






    public WebElement waitUntilNextElementAppears(WebDriver driver,By Locator, int timeOut) {
        WebElement element = new WebDriverWait(driver, timeOut).until(
                ExpectedConditions.presenceOfElementLocated(Locator)
        );

        return element;
    }




}
