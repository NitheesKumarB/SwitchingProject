package com.locators;

import com.Objects.ObjectLocator;
import com.microsoft.playwright.Locator;

public class XpathClass extends ObjectLocator {


//    public static Locator upload(){
//        return ObjectLocator.getElement("input#uploadfile_0");
//    }
//
//    public static Locator submitButton(){
//        return ObjectLocator.getElement("button#submitbutton");
//
//    }

    public static Locator dateColumn(){
        return ObjectLocator.getElement("//input[@id='datetimepicker1']");
    }

    public static String todayDate(){
        return "(//span[contains(@aria-label,'March 14')])[1]";
    }

}
