package e2e.main.pages;

import e2e.core.TestBase;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.page;

public class AuthorizedPage extends TestBase {
    @Step("Логаут")
    public MainPage logout() {
        return page(MainPage.class);
    }
}
