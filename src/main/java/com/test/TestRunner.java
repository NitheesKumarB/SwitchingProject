package com.test;


//import cucumber.api.CucumberOptions;
//import cucumber.api.testng.TestNGCucumberRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.TestNG;

@CucumberOptions(
        features = "src\\main\\resources\\Amazon.feature"
        ,glue = "com.steps"
        ,tags = "@LaunchFp"
        ,publish = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
