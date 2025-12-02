package com.pages;

import com.microsoft.playwright.*;

import java.util.Arrays;

public class BasePage {
    private static Playwright playwright;
    private static Browser browser;
    public static Page page;
    public static BrowserContext context;

    public static Page getPage() {
        if (playwright == null) {
            playwright = Playwright.create();
            browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)
                    .setArgs(Arrays.asList(new String[]{"--start-fullscreen"})));
            context = browser.newContext();
            page = context.newPage();
        }
        return page;
    }

    public static Page closeBrowser() {
        if (browser != null) {
            browser.close();
            playwright.close();
        }
        return page;
    }
}
