package ru.geekbrains.HomeWork6.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.HomeWork6.base.BasePage;

public class NewContactFacePage extends BasePage {

    @FindBy(name = "crm_contact[lastName]")
    private WebElement lastNameInput;
    @FindBy(name = "crm_contact[firstName]")
    private WebElement firstNameInput;
    @FindBy(xpath = "//span[@class='select2-arrow']")
    private WebElement clickDropDownMenu;
    @FindBy(xpath = "//div[@class='select2-result-label' and text()='Test Organisation_100']")
    private WebElement choiceDropDownMenu;
    @FindBy(name = "crm_contact[jobTitle]")
    private WebElement jobTitleInput;
    @FindBy(css = "button[class='btn btn-success action-button']")
    private WebElement submitAndSaveButton;

    public NewContactFacePage(WebDriver driver) {
        super(driver);
    }

    @Step("Enter lastName {description}")
    public NewContactFacePage enterLastName(String description) {
        lastNameInput.sendKeys(description);
        return this;
    }

    @Step("Enter firstName {description}")
    public NewContactFacePage enterFirstName(String description) {
        firstNameInput.sendKeys(description);
        return this;
    }

    @Step("Click DropDown {description}")
    public NewContactFacePage clickDropDown() {
        clickDropDownMenu.click();
        return this;
    }

    @Step("Choice DropDown {description}")
    public NewContactFacePage choiceDropDown() {
        choiceDropDownMenu.click();
        return this;
    }

    @Step("Enter lastName {description}")
    public NewContactFacePage enterJobTitle(String description) {
        jobTitleInput.sendKeys(description);
        return this;
    }

    @Step("click 'submit'")
    public ContactFacePage clickSubmit() {
        submitAndSaveButton.click();
        return new ContactFacePage(driver);
    }
}
