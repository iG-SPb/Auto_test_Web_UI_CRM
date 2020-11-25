package ru.geekbrains.HomeWork6.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import ru.geekbrains.HomeWork6.base.BasePage;

public class NewProjectsPage extends BasePage {

    @FindBy(name = "crm_project[name]")
    private WebElement projectsNameInput;

    @FindBy(xpath = "(//span[@class='select2-arrow'])[1]")
    private WebElement clickDropDownMenu_organization;

    @FindBy(xpath = "//div[@class='select2-result-label' and text()='Test Organisation_100']")
    private WebElement choiceDropDownMenu_organization;

    @FindBy(xpath = "//*[@class='select2-container select2']")  // "(//span[@class='select2-arrow'])[2]")
    private WebElement clickDropDownMenu_ContactFace;

    @FindBy(css = ".select2-focused")
    private WebElement sendDropDownMenu_ContactFace;

    @FindBy(css = ".select2-result-label")
    private WebElement choiceDropDownMenu_ContactFace;

    @FindBy(name = "crm_project[businessUnit]")
    private WebElement businessUnitDropDownSelect;

    @FindBy(name = "crm_project[businessUnit]")
    private WebElement businessUnitNameInput;
    // Research & Development

    @FindBy(name = "crm_project[curator]")
    private WebElement curatorNameInput;
    // Student Student

    @FindBy(name = "crm_project[rp]")
    private WebElement rpNameInput;

    @FindBy(name = "crm_project[administrator]")
    private WebElement administratorNameInput;

    @FindBy(name = "crm_project[manager]")
    private WebElement managerNameInput;

    @FindBy(css = "button[class='btn btn-success action-button']")
    private WebElement submitAndSaveButton;

    public NewProjectsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Enter projectName {description}")
    public NewProjectsPage enterProjectName(String description) {
        projectsNameInput.sendKeys(description);
        return this;
    }

    @Step("Click DropDown {description}")
    public NewProjectsPage clickDropDownOrganization() {
        clickDropDownMenu_organization.click();
        return this;
    }

    @Step("Choice DropDown {description}")
    public NewProjectsPage choiceDropDownOrganization() {
        choiceDropDownMenu_organization.click();
        return this;
    }

    @Step("Click DropDown {description}")
    public NewProjectsPage clickDropDownContactFace() {
        clickDropDownMenu_ContactFace.click();
        return this;
    }

    @Step("Send DropDown {description}")
    public NewProjectsPage sendDropDownContactFace() {
        sendDropDownMenu_ContactFace.sendKeys("Иванов Антон");
        return this;
    }

    @Step("Choice DropDown {description}")
    public NewProjectsPage choiceDropDownContactFace() {
        choiceDropDownMenu_ContactFace.click();
        return this;
    }

    @Step("select business unit value {value}")
    public NewProjectsPage selectBusinessUnit(int value){
        Select businessUnitDropDown = new Select(businessUnitDropDownSelect);
        businessUnitDropDown.selectByIndex(value);
        return this;
    }

    @Step("Enter curatorName {description}")
    public NewProjectsPage enterCuratorName(String description) {
        curatorNameInput.sendKeys(description);
        return this;
    }

    @Step("Enter rpName {description}")
    public NewProjectsPage enterRpName(String description) {
        rpNameInput.sendKeys(description);
        return this;
    }

    @Step("Enter administratorName {description}")
    public NewProjectsPage enterAdministratorName(String description) {
        administratorNameInput.sendKeys(description);
        return this;
    }

    @Step("Enter managerName {description}")
    public NewProjectsPage enterManagerName(String description) {
        managerNameInput.sendKeys(description);
        return this;
    }

    @Step("click 'submit'")
    public ProjectsPage clickSubmit() {
        submitAndSaveButton.click();
        return new ProjectsPage(driver);
    }
}
