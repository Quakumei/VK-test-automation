package com.DependencyCheck;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import com.codeborne.selenide.SelenideElement;

public class MainPage {
    private String myProfileLink = """
        /html/body/div[11]/div[5]/div[5]/div[1]/div/div[2]/div[1]/div[3]/div[1]/div/div/div[3]/div/div/div/a[1]""";

    public SelenideElement getLinkObj(){
        return $(byXpath(this.myProfileLink));
    }
}
