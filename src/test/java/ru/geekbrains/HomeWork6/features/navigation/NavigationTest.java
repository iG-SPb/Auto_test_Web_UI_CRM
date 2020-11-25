package ru.geekbrains.HomeWork6.features.navigation;

import io.qameta.allure.Feature;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.HomeWork6.pages.LoginPage;
import ru.geekbrains.HomeWork6.base.BaseTest;
import ru.geekbrains.HomeWork6.enums.NavigationBarTabs;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static ru.geekbrains.HomeWork6.common.Configuration.*;
import static ru.geekbrains.HomeWork6.common.Configuration.STUDENT_LOGIN;

@Feature("Navigation")
public class NavigationTest extends BaseTest {


    private static NavigationBarTabs[] navigationTabProvider() {
        return NavigationBarTabs.values();
    }

    @ParameterizedTest
    @MethodSource("navigationTabProvider")
    void checkMainNavigationTabsTest(NavigationBarTabs barTab) {
        new LoginPage(driver)
                .authorize(STUDENT_LOGIN, STUDENT_PASSWORD)
                .getPageNavigation()
                .checkTabVisibility(barTab);
    }
}
