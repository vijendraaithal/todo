package com.vj.qacart.todo.pages;

import org.openqa.selenium.By;

public class RegisterPage {

    // Elements
    private final By inpFirstName = By.cssSelector("[data-testid='first-name']");
    private final By inpLastName = By.cssSelector("[data-testid='last-name']");
    private final By inpEmail = By.cssSelector("[data-testid='email']");
    private final By password = By.cssSelector("[data-testid='password']");
    private final By confirmPassword = By.cssSelector("[data-testid='confirm-password']");
    private final By btnSubmit = By.cssSelector("[data-testid='submit']");
}
