package ru.geekbrains.HomeWork6.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.HomeWork6.base.BasePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProjectsPage extends BasePage {
    @FindBy(xpath = "//a[@href='/project/create/']/parent::div")
    private WebElement createNewProjectsButton;

    public ProjectsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Click 'new project' button")
    public NewProjectsPage clickOnCreateNewProjectsButton() {
        createNewProjectsButton.click();
        return new NewProjectsPage(driver);
    }

    @Step("Check 'new project' popup visibility")
    public ProjectsPage checkNewProjectsPopUp() {
        String message = wait10second.until(ExpectedConditions
                .presenceOfElementLocated(By.cssSelector("div[class='message']")))
                .getText();
        assertTrue(message.contains("Проект сохранен"));
        return this;
    }
}
