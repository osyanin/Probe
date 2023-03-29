package e2e.core;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import e2e.main.pages.AuthorizationPage;
import e2e.main.pages.AuthorizedPage;
import e2e.main.pages.MainPage;
import e2e.main.pages.RegistrationPage;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.addListener;
import static io.qameta.allure.selenide.LogType.BROWSER;
import static java.util.logging.Level.WARNING;

public class TestBase {
    protected static MainPage mainPage;
    protected static AuthorizationPage authorizationPage;
    protected static AuthorizedPage authorizedPage;
    protected static RegistrationPage registrationPage;
    protected static final SiteConnection siteConnection = SiteConnection.load();
    protected static final User admin = new User(siteConnection.getAdmin(), siteConnection.getPassword());
    protected static final User manager = new User(siteConnection.getManager(), siteConnection.getManagerPassword());
    protected static final User manager1 = new User(siteConnection.getManager1(), siteConnection.getManager1Password());
    protected static final User seoManager = new User(siteConnection.getSeoManager(), siteConnection.getSeoManagerPassword());
    protected static final User seoManager2 = new User(siteConnection.getSeoManager2(), siteConnection.getSeoManager2Password());

    protected final SiteVariables vars = SiteVariables.generate();

    @BeforeAll
    @Step
    static void setUp() {
        addListener(new Highlighter());
        closeWebDriver();
        Configuration.baseUrl          = siteConnection.getUrl();
        Configuration.browserSize      = "1920x1080";
        Configuration.browser          = System.getProperty("browser");
        Configuration.timeout          = 20000;

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false).includeSelenideSteps(true).enableLogs(BROWSER, WARNING));

        open("/");
    }

    protected final SelenideElement dataTestId(String id) {
        return $(byAttribute("data-test-id", id));
    }
    protected String newUserEmail;
    protected String newUserPassword;
}