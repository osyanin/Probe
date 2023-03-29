package e2e.main.tests;

import e2e.core.TestBase;
import e2e.main.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationTest extends TestBase {

    @Test
    @DisplayName("Основной тест регистрации нового пользователя")
    void mainRegistrationTest() {
        mainPage = open("/", MainPage.class)
                .gotoAutorizationPage()
                .checkWeAreHere()
                .gotoRegistrationPage()
                .checkWeAreHere()
                .registerNewUser()
                .logout();
    }
}
