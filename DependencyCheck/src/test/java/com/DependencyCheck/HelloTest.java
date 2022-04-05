package com.DependencyCheck;

import org.junit.jupiter.api.Test;

import com.DependencyCheck.User;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class HelloTest {
    @Test
    public void userCanSearch() {
        open("https://duckduckgo.com");
        new GooglePage().searchFor("selenide java");

        SearchResultsPage results = new SearchResultsPage();
        results.getResults().shouldHave(sizeGreaterThan(1));
        results.getResult(0).shouldHave(text("Selenide: concise UI tests in Java"));

    }

    @Test
    public void userCanLoginOk() {
        User user = new User("+79611619556", "sucksomecock", "Иоганн Трахтенберг" );
        open("https://ok.ru");
        new LoginPage().login(user);

//        href = /profile/599788983855
//        /html/body/div[11]/div[5]/div[5]/div[1]/div/div[2]/div[1]/div[3]/div[1]/div/div/div[3]/div/div/div/a[1]
        MainPage result = new MainPage();
        result.getLinkObj().shouldHave(text(user.name));
    }
}
