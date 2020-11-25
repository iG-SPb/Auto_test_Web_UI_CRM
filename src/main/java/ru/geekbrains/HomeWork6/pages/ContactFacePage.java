package ru.geekbrains.HomeWork6.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.HomeWork6.base.BasePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContactFacePage extends BasePage {
    @FindBy(xpath = "//a[@href='/contact/create']/parent::div")
    private WebElement createNewContactButton;

    public ContactFacePage(WebDriver driver) {
        super(driver);
    }

    @Step("Click 'new contact' button")
    public NewContactFacePage clickOnCreateNewContactButton() {
        createNewContactButton.click();
        return new NewContactFacePage(driver);
    }

    @Step("Check 'new contact' popup visibility")
    public ContactFacePage checkNewContactPopUp() {
        String message = wait10second.until(ExpectedConditions
                .presenceOfElementLocated(By.cssSelector("div[class='message']")))
                .getText();
        assertTrue(message.contains("Контактное лицо сохранено"));
        return this;
    }
}
