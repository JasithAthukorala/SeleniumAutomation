package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerCreationTest {

    WebDriver driver;

    @BeforeMethod
     public void setUP() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\QATrainingProgramme\\Day03\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/admin");
        driver.manage().window().maximize();
        waitUntilNextElementAppears(By.name("email"),30);
        driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
        driver.findElement(By.name("password")).sendKeys("demoadmin");
        driver.findElement(By.xpath("//*[@class=\"btn btn-primary btn-block ladda-button fadeIn animated btn-lg\"]")).click();

        waitUntilNextElementAppears(By.linkText("ACCOUNTS"),10);
        driver.findElement(By.linkText("ACCOUNTS")).click();

        waitUntilNextElementAppears(By.linkText("Customers"),7);
        driver.findElement(By.linkText("Customers")).click();

        waitUntilNextElementAppears(By.className("add_button"),20);
        driver.findElement(By.className("add_button")).click();


    }

    @Test
    public void testCustomerCreation() throws InterruptedException {

        waitUntilNextElementAppears(By.name("fname"),20);
        driver.findElement(By.name("fname")).sendKeys("Jasith");
        driver.findElement(By.name("lname")).sendKeys("Athukorala");
        driver.findElement(By.name("email")).sendKeys("jasith@gmail.com");
        driver.findElement(By.name("password")).sendKeys("J123456");
        driver.findElement(By.name("mobile")).sendKeys("0771568265");
        driver.findElement(By.name("address1")).sendKeys("Bandarawaththa");
        driver.findElement(By.name("address2")).sendKeys("Gampaha");


        //DropDownText
        Select dropDownCountry = new Select(driver.findElement(By.name("country")));
        dropDownCountry.selectByVisibleText("Finland");
        dropDownCountry.selectByValue("LK");
        dropDownCountry.selectByIndex(6);

        Select dropDownStatus = new Select(driver.findElement(By.name("status")));
        dropDownStatus.selectByVisibleText("Disabled");


        driver.findElement(By.xpath("//button[text()='Submit']")).click();



    }


    public WebElement waitUntilNextElementAppears(By Locator, int timeOut) {
        WebElement element = new WebDriverWait(driver, timeOut).until(
                ExpectedConditions.presenceOfElementLocated(Locator)
        );

        return element;
    }


}
