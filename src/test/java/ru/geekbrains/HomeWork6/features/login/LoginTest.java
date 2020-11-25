package ru.geekbrains.HomeWork6.features.login;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;
import ru.geekbrains.HomeWork6.pages.LoginPage;
import ru.geekbrains.HomeWork6.base.BaseTest;

import static ru.geekbrains.HomeWork6.common.Configuration.*;

@Feature("Login")
@Severity(SeverityLevel.BLOCKER)
public class LoginTest extends BaseTest {

    @Test
    void loginTest() {
        new LoginPage(driver)
                .authorize(STUDENT_LOGIN, STUDENT_PASSWORD)
                .checkUrl(BASE_URL);
    }
}
