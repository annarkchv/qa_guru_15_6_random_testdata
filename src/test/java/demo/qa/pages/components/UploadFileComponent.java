package demo.qa.pages.components;

import static com.codeborne.selenide.Selenide.$;

public class UploadFileComponent {

    public void uploadFileFromClasspath(String fileName) {
        $("#uploadPicture").uploadFromClasspath(fileName);

    }

}
