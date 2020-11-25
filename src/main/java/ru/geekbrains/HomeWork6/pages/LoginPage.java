package ru.geekbrains.HomeWork6.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.HomeWork6.base.BasePage;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name='_username']")
    private WebElement inputLogin;
    @FindBy(css ="input[name='_password']")
    private WebElement inputPassword;
    @FindBy(css = "button[name='_submit']")
    private WebElement buttonSignIn;


    @Step(value = "Enter login {login}")
    public LoginPage enterLogin(String login) {
        inputLogin.sendKeys(login);
        return this;
    }
    @Step(value = "Enter password {password}")
    public LoginPage enterPassword(String password) {
        inputPassword.sendKeys(password);
        return this;
    }
    @Step(value = "Click login button")
    public HomePage clickLoginButton() {
        buttonSignIn.click();
        return new HomePage(driver);
    }

    @Step(value = "Auth with login = {login}, password = {password}")
    public HomePage authorize(String login, String password) {
        enterLogin(login);
        enterPassword(password);
        clickLoginButton();
        return new HomePage(driver);
    }
}
