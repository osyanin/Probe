package e2e.main.pages;

import com.codeborne.selenide.SelenideElement;
import e2e.core.TestBase;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class AuthorizationPage extends TestBase {
    SelenideElement loginField = dataTestId("test-input-login-email");
    SelenideElement passwordField = dataTestId("test-input-login-password");
    SelenideElement loginSubmitButton = dataTestId("test-button-login");
    SelenideElement appTitle = $(".app-title");

    @Step("Проверка, что мы на странице авторизации")
    public AuthorizationPage checkWeAreHere() {
        loginField.shouldBe(visible);
        return page(AuthorizationPage.class);
    }

    @Step("Переход на страницу регистрации")
    public RegistrationPage gotoRegistrationPage() {
        $(byAttribute("href", "/register")).click();
        return page(RegistrationPage.class);
    }

    @Step("Авторизация новым пользователем")
    public AuthorizedPage authorizeNewUser() {
        return page(AuthorizedPage.class);
    }
}
