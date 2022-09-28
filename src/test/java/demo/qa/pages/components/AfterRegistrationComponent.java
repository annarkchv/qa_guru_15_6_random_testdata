package demo.qa.pages.components;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AfterRegistrationComponent {

    public void checkTableAppearance() {
        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(exactText("Thanks for submitting the form"));

    }

    public void checkValue(String key, String value) {
        $(".table-responsive").$(byText(key)).parent().shouldHave(exactText(key + " " + value));

    }
}
