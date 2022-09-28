package demo.qa.pages.components;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;

public class DropdownComponent {

    public void setSubject(String subject) {
        $("#subjectsInput").setValue(subject).pressEnter();

    }

    public void setState(String state) {
        $("#react-select-3-input").setValue(state);
        $("#state").shouldHave(exactText(state));
        $("#react-select-3-input").pressEnter();

    }

    public void setCity(String city) {
        $("#react-select-4-input").setValue(city);
        $("#city").shouldHave(exactText(city));
        $("#react-select-4-input").pressEnter();

    }

}
