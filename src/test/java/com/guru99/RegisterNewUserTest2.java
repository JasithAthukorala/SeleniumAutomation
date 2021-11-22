package com.guru99;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class RegisterNewUserTest2 {

    HomePage homepage;

    @BeforeMethod
    public void setUp() {

        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homepage = new HomePage();
        homepage.selectRegisterMenu();


    }


    @Test
    public void testRegisterNewUser(){


    }

}
