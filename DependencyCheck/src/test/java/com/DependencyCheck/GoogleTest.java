package com.DependencyCheck;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;


public class GoogleTest {

    @Test
    public void userCanSearchKeywordWithGoogle(){
        open("http://google.com");
    }
}
