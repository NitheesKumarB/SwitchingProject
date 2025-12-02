package com.pages;

import com.locators.XpathClass;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;

import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static com.pages.BasePage.context;
import static com.pages.BasePage.page;

public class AmazonPage {
//  Page newTab;
//    Locator loc;
    public boolean clickMethod(String eleId) throws Exception {
Locator loc;
        switch (eleId){
//            case "HeadPhones":
//                loc = XpathClass.headphones();
//                break;
//            case "BoatHeadPhone":
//                loc = XpathClass.boatPods();
//                break;
//            case "BoultHeadphones":
//                loc = XpathClass.boultPods();
//                break;
//            case "Submit":
//                loc = XpathClass.submitButton();
//                break;
            case "date Picker":
                loc = XpathClass.dateColumn();
                break;
            default : throw new Exception();
        }
        page.waitForLoadState();
        loc.waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
//        page.evaluate("document.querySelector('xpath').click();");

        loc.click();
        return true;
    }

//    public void clickAndHandle() throws Exception {
//        Page newTab = context.waitForPage(() ->XpathClass.boatPods().click());
//             newTab.waitForTimeout(5000);
//             newTab.close();
//             page.bringToFront();
////        switch (eleId){
////            case "Tab Close":
//              List<Page>  pages = context.pages();

//                 Page newTab = pages.get(pages.size());
//                 newTab.waitForTimeout(3000);
////                 if(!newTab.isClosed()){
//                     newTab.close();
////                 }
////
////                if (!page.isClosed()){
//                    page.bringToFront();
////                }
//                Page mainPage = (Page) pages.stream()
//                        .filter(page -> page.title().contains("Headphones - Up to 80% Off on Headphones, Headset, Earphones Online | Free Delivery"))
//                        .findFirst().orElseThrow(()->new Exception("Main page not found"));
//                Page currentTab = pages.get(pages.size()-1);
//                if(!currentTab.isClosed() && currentTab != mainPage){
//                    currentTab.close();
//                }
//                if (!mainPage.isClosed()){
//                    mainPage.bringToFront();
//                }
//
//                break;
////
//            default:  throw new Exception();\


//    public void uploadFiles(String eleId,String filePath) throws Exception {
//        Locator loc;
//        switch(eleId){
//            case "file chosen":
//                loc = XpathClass.upload();
//                break;
//            default: throw new Exception();
//        }
//        page.waitForLoadState();;
//        loc.setInputFiles(Paths.get(filePath));
//    }

  public void datePick(String eleId) throws Exception {

      String tab;
      switch(eleId){
          case "tab picker":
              tab = XpathClass.todayDate();
              break;
          default:throw new Exception();
      }

//      List<Locator> allDates = page.locator("(//div[@class='dayContainer'])[1]/span").all();
//      for(Locator date:allDates){
//          System.out.println("date "+date.innerText());
//      }
LocalDate todayDate = LocalDate.now();
String day = String.valueOf(todayDate.getDayOfMonth());
//      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
//      String formattedDate =todayDate.format(formatter);
//      System.out.println(formattedDate);
      String formattedDateXapth = String.format(tab,day);
//      System.out.println(formattedDateXapth);
      page.locator(formattedDateXapth).waitFor();
      page.locator(formattedDateXapth).click();


  }




        }




