package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    public void loginSuccess(WebDriver driver,String userName,String Password) {
        driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
        driver.findElement(By.name("password")).sendKeys("demoadmin");
        driver.findElement(By.xpath("//*[@class=\"btn btn-primary btn-block ladda-button fadeIn animated btn-lg\"]")).click();




    }

}



