package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {


    @Test
    public void testLoginSuccess() {

        System.setProperty("webdriver.chrome.driver", "F:\\QATrainingProgramme\\Day03\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://soundmouse.net/admintools/ml-test/signin");


        //Maximize the window size
        driver.manage().window().maximize();


        driver.findElement(By.name("email")).sendKeys("jasith@adelanka.com");
        driver.findElement(By.name("password")).sendKeys("Jasith123!@#");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/button")).click();

      //  driver.findElement(By.name("password")).submit();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        String actualMessage = driver.findElement(By.xpath("//*[contains(text(),'Hi Admin!')]")).getText();
        Assert.assertEquals(actualMessage,"Hi Admin!","Failed : Login to the System");

        driver.findElement(By.id("logout")).click();

        driver.quit();

    }


}
