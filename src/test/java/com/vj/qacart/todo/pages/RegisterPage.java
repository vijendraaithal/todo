package com.vj.qacart.todo.pages;

import com.vj.qacart.todo.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    private static RegisterPage registerPage;
    // Elements
    private final By inpFirstName = By.cssSelector("[data-testid='first-name']");
    private final By inpLastName = By.cssSelector("[data-testid='last-name']");
    private final By inpEmail = By.cssSelector("[data-testid='email']");
    private final By inpPassword = By.cssSelector("[data-testid='password']");
    private final By inpConfirmPassword = By.cssSelector("[data-testid='confirm-password']");
    private final By btnSubmit = By.cssSelector("[data-testid='submit']");

    // Constructor
    private RegisterPage() {}

    public static RegisterPage getInstance() {
        if(registerPage == null) {
            registerPage = new RegisterPage();
        }
        return registerPage;
    }

    // Methods
    public void load(WebDriver driver) {
        driver.get("https://todo.qacart.com/signup");
    }
    public void register(WebDriver driver, User user) {
        driver.findElement(inpFirstName).sendKeys(user.getFirstName());
        driver.findElement(inpLastName).sendKeys(user.getLastName());
        driver.findElement(inpEmail).sendKeys(user.getEmail());
        driver.findElement(inpPassword).sendKeys("Simple1!");
        driver.findElement(inpConfirmPassword).sendKeys("Simple1!");
        driver.findElement(btnSubmit).click();
    }
}
