package com.vj.qacart.todo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewTodoPage {
    // Elements
    private final By inpNewTodo = By.cssSelector("[data-testid='new-todo']");
    private final By btnSubmit = By.cssSelector("[data-testid='submit-newTask']");

    // Methods
    public void clickNewTodoInp(WebDriver driver) {
        driver.findElement(inpNewTodo).sendKeys("Learn Selenium");
    }

    public void clickSubmitBtn(WebDriver driver) {
        driver.findElement(btnSubmit).click();
    }



}
