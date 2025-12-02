package com.steps;

import com.common.Hooks;
import com.locators.XpathClass;
import com.microsoft.playwright.Page;
import com.pages.AmazonPage;
import com.pages.BasePage;
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import io.cucumber.java.en.And;
import com.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.File;
import java.time.LocalDate;

import static com.pages.BasePage.page;

public class MyStepdefs extends BasePage {

    AmazonPage ap = new AmazonPage();

//    @Given("User Launch the application {string}")
//    public void user_launch_the_application(String string) {
//
//    }
//
//    @Then("i click the headphones tab {string}")
//    public void iClickTheHeadphonesTab(String arg0) throws Exception {
//
//    }


//    @Then("i click the boat headphones {string}")
//    public void iClickTheBoatHeadphones(String arg0) throws Exception {
//
//
//    }




//    @Given("^User Launch the application \"([^\"]*)\"$")
//    public void userLaunchTheApplication(String arg0) throws Throwable {
//
//    }



//    @And("^i click the chose file button \"([^\"]*)\"$")
//    public void iClickTheChoseFileButton(String arg0) throws Throwable{
//        String filePath = ConfigReader.getProperty("filepath");
//        File file = new File(filePath);
//        if (file.exists()) {
//            ap.uploadFiles(arg0,filePath);
//        } else {
//            throw new RuntimeException("File not found: " + filePath);
//        }
//      page.waitForTimeout(5000);
//    }

//    @Then("^i click the submit button \"([^\"]*)\"$" )
//    public void iClickTheSubmitButton(String arg0) throws Throwable{
//       ap.clickMethod(arg0);
//       Thread.sleep(3000);
//    }

    @Given("^I am on the booking page \"([^\"]*)\"$")
    public void iAmOnTheBookingPage(String arg0) throws InterruptedException {
        Page page = Hooks.setUp();

        page.navigate(arg0);
        Thread.sleep(3000);
    }


    @When("I click the date picker {string}")
    public void iClickTheDatePicker(String arg0) throws Exception {
        ap.clickMethod(arg0);
        Thread.sleep(3000);
    }


    @And("I select date from the {string}")
    public void iSelectDateFromThe(String arg0) throws Exception {
        ap.datePick(arg0);

    }
}
