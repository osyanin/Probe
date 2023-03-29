package e2e.main.pages;

import com.codeborne.selenide.SelenideElement;
import e2e.core.TestBase;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class RegistrationPage extends TestBase {
    private final SelenideElement inputEmail = dataTestId("test-input-register-email");
    private final SelenideElement inputPassword = dataTestId("test-input-register-password");
    private final SelenideElement inputPasswordRepeat = dataTestId("test-input-register-repeat-password");

    @Step("Проверка, что мы на странице регистрации")
    public RegistrationPage checkWeAreHere() {
        inputEmail.shouldBe(visible);
        return page(RegistrationPage.class);
    }

    @Step("Регистрация нового пользователя")
    public AuthorizedPage registerNewUser() {
        newUserEmail = vars.getNewUserMail();
        newUserPassword =vars.getNewUserPassword();

        inputEmail.setValue(newUserEmail);
        inputPassword.setValue(newUserPassword);
        inputPasswordRepeat.setValue(newUserPassword);

        return page(AuthorizedPage.class);
    }
}
