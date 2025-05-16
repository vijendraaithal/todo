package com.vj.qacart.todo.base;

import com.vj.qacart.todo.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
         driver = new DriverFactory().initDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
