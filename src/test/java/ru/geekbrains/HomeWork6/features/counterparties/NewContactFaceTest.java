package ru.geekbrains.HomeWork6.features.counterparties;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import ru.geekbrains.HomeWork6.enums.CounterpartiesSubMenuButtons;
import ru.geekbrains.HomeWork6.pages.ContactFacePage;
import ru.geekbrains.HomeWork6.pages.LoginPage;
import ru.geekbrains.HomeWork6.base.BaseTest;
import ru.geekbrains.HomeWork6.enums.NavigationBarTabs;

import static ru.geekbrains.HomeWork6.common.Configuration.STUDENT_LOGIN;
import static ru.geekbrains.HomeWork6.common.Configuration.STUDENT_PASSWORD;

@Feature("NewContactFaceTest")
public class NewContactFaceTest extends BaseTest {

    @Test
    void createNewContactFaceTest() throws InterruptedException {
        ContactFacePage contactFacePage = (ContactFacePage) new LoginPage(driver)
                .authorize(STUDENT_LOGIN, STUDENT_PASSWORD)
                .getPageNavigation()
                .moveCursorToNavigationTab(NavigationBarTabs.COUNTER_PARTIES)
                .clickSubMenuButton(CounterpartiesSubMenuButtons.CONTACT_FACE);

        contactFacePage
                .clickOnCreateNewContactButton()
                .enterLastName("iG_LastName")
                .enterFirstName("iG_FirstName")
                .clickDropDown()
                .choiceDropDown()
                .enterJobTitle("iG_Position")
                .clickSubmit()
                .checkNewContactPopUp();
    }
}
