package com.vj.qacart.todo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewTodoPage {

    private static NewTodoPage newTodoPage;
    // Elements
    private final By inpNewTodo = By.cssSelector("[data-testid='new-todo']");
    private final By btnSubmit = By.cssSelector("[data-testid='submit-newTask']");

    // Constructor
    private NewTodoPage() {}

    public static NewTodoPage getInstance() {
        if(newTodoPage == null) {
            newTodoPage = new NewTodoPage();
        }
        return newTodoPage;
    }

    // Methods
    public void clickNewTodoInp(WebDriver driver) {
        driver.findElement(inpNewTodo).sendKeys("Learn Selenium");
    }

    public void clickSubmitBtn(WebDriver driver) {
        driver.findElement(btnSubmit).click();
    }



}
