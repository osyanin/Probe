package e2e.main.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import e2e.core.TestBase;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.*;

public class MainPage extends TestBase {

    @Step("Переход на страницу авторизации")
    public AuthorizationPage gotoAutorizationPage() {
        $$(".secondaryButton").findBy(exactText("Войти")).click();
        return page(AuthorizationPage.class);
    }
}
