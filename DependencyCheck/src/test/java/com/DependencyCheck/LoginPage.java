package com.DependencyCheck;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;

public class LoginPage {
    private static String login_input = """
                        //*[@id=\"field_email\"]
            """;
    private static String password_input = """
            //*[@id="field_password"]""";
//    private static String button = """/html/body/div[11]/div[5]/div[3]/div[1]/div/div/div/div[1]/div[3]/div/div/div/div/div/div/div[1]/div[2]/div/div[2]/div[2]/div[1]/form/div[4]/input""";
    public void login(User user){
           $(byXpath(login_input)).val(user.login);
           $(byXpath(password_input)).val(user.password);
    }
}
