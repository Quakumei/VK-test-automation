package com.DependencyCheck;

public class MainPage {
    private static String myProfileLink = """/html/body/div[11]/div[5]/div[5]/div[1]/div/div[2]/div[1]/div[3]/div[1]/div/div/div[3]/div/div/div/a[1]""";
    public String getLinkObj(){
        return $(By.xpath(myProfileLink));
    }
}
