package com.vj.qacart.todo.testcases;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TodoTest {

    @Test
    public void shouldBeAbleToAddATodo() {
        Faker faker = new Faker();
        String firsName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().safeEmailAddress();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.manage().window().maximize();
        driver.get("https://todo.qacart.com/signup");
        driver.findElement(By.cssSelector("[data-testid='first-name']")).sendKeys(firsName);
        driver.findElement(By.cssSelector("[data-testid='last-name']")).sendKeys(lastName);
        driver.findElement(By.cssSelector("[data-testid='email']")).sendKeys(email);
        driver.findElement(By.cssSelector("[data-testid='password']")).sendKeys("Simple1!");
        driver.findElement(By.cssSelector("[data-testid='confirm-password']")).sendKeys("Simple1!");
        driver.findElement(By.cssSelector("[data-testid='submit']")).click();
        boolean isWelcomeHeaderDisplayed = driver.findElement(By.cssSelector("[data-testid='welcome']")).isDisplayed();
        Assert.assertTrue(isWelcomeHeaderDisplayed);
        driver.findElement(By.cssSelector("[data-testid='add']")).click();
        driver.findElement(By.cssSelector("[data-testid='new-todo']")).sendKeys("Learn Selenium");
        driver.findElement(By.cssSelector("[data-testid='submit-newTask']")).click();
        String actualTodo = driver.findElement(By.cssSelector("[data-testid='todo-text']")).getText();
        Assert.assertEquals(actualTodo, "Learn Selenium");
        driver.quit();
    }

    @Test
    public void shouldBeAbleToDeleteAddedTodo() {
        Faker faker = new Faker();
        String firsName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().safeEmailAddress();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.manage().window().maximize();
        driver.get("https://todo.qacart.com/signup");
        driver.findElement(By.cssSelector("[data-testid='first-name']")).sendKeys(firsName);
        driver.findElement(By.cssSelector("[data-testid='last-name']")).sendKeys(lastName);
        driver.findElement(By.cssSelector("[data-testid='email']")).sendKeys(email);
        driver.findElement(By.cssSelector("[data-testid='password']")).sendKeys("Simple1!");
        driver.findElement(By.cssSelector("[data-testid='confirm-password']")).sendKeys("Simple1!");
        driver.findElement(By.cssSelector("[data-testid='submit']")).click();
        boolean isWelcomeHeaderDisplayed = driver.findElement(By.cssSelector("[data-testid='welcome']")).isDisplayed();
        Assert.assertTrue(isWelcomeHeaderDisplayed);
        driver.findElement(By.cssSelector("[data-testid='add']")).click();
        driver.findElement(By.cssSelector("[data-testid='new-todo']")).sendKeys("Learn Selenium");
        driver.findElement(By.cssSelector("[data-testid='submit-newTask']")).click();
        String actualTodo = driver.findElement(By.cssSelector("[data-testid='todo-text']")).getText();
        Assert.assertEquals(actualTodo, "Learn Selenium");
        driver.findElement(By.xpath("(//button[@aria-label='delete'])[2]")).click();
        boolean isNoAvailableTodosDisplayed = driver.findElement(By.cssSelector("[data-testid='no-todos']")).isDisplayed();
        Assert.assertTrue(isNoAvailableTodosDisplayed);
        driver.quit();
    }
}
