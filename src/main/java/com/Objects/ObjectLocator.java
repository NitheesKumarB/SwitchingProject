package com.Objects;

import com.microsoft.playwright.Locator;

import static com.pages.BasePage.page;

public class ObjectLocator {

    public static Locator getElement(String locator){
        Locator loc = page.locator(locator);
        return loc;
    }

}
