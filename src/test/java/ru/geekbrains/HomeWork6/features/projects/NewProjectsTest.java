package ru.geekbrains.HomeWork6.features.projects;

import com.github.javafaker.Faker;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import ru.geekbrains.HomeWork6.enums.ProjectsSubMenuButtons;
import ru.geekbrains.HomeWork6.pages.ProjectsPage;
import ru.geekbrains.HomeWork6.pages.LoginPage;
import ru.geekbrains.HomeWork6.base.BaseTest;
import ru.geekbrains.HomeWork6.enums.NavigationBarTabs;

import static ru.geekbrains.HomeWork6.common.Configuration.STUDENT_LOGIN;
import static ru.geekbrains.HomeWork6.common.Configuration.STUDENT_PASSWORD;

@Feature("NewProjectsTest")
public class NewProjectsTest extends BaseTest{

    static Faker faker = new Faker();
    String tmpName = faker.pokemon().name();

    @Test
    void createNewProjectsTest() throws InterruptedException {
        ProjectsPage projectPage = (ProjectsPage) new LoginPage(driver)
                .authorize(STUDENT_LOGIN, STUDENT_PASSWORD)
                .getPageNavigation()
                .moveCursorToNavigationTab(NavigationBarTabs.PROJECTS)
                .clickSubMenuButton(ProjectsSubMenuButtons.ALL_PROJECTS);

        projectPage
                .clickOnCreateNewProjectsButton()
                .enterProjectName(tmpName)
                .clickDropDownOrganization()
                .choiceDropDownOrganization()
                .selectBusinessUnit(1)
                .clickDropDownContactFace()
                .sendDropDownContactFace()
                .choiceDropDownContactFace()
                .enterCuratorName("Student Student")
                .enterRpName("Student Student")
                .enterAdministratorName("Student Student")
                .enterManagerName("Student Student")
                .clickSubmit()
                .checkNewProjectsPopUp();
        Thread.sleep(3000);
    }
}
