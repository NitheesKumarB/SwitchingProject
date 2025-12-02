plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
//    testImplementation(platform("org.junit:junit-bom:5.10.0"))
//    testImplementation("org.junit.jupiter:junit-jupiter")
//    // https://mvnrepository.com/artifact/io.cucumber/cucumber-java
//    implementation("io.cucumber:cucumber-java:7.14.1")
//    // https://mvnrepository.com/artifact/io.cucumber/cucumber-junit
//    testImplementation("io.cucumber:cucumber-junit:7.14.1")
//// https://mvnrepository.com/artifact/io.cucumber/cucumber-junit
//    testImplementation("io.cucumber:cucumber-core:7.14.1")
//    // https://mvnrepository.com/artifact/com.microsoft.playwright/playwright
//    implementation("com.microsoft.playwright:playwright:1.49.0")
//// https://mvnrepository.com/artifact/org.testng/testng
//    testImplementation("org.testng:testng:7.9.0")
//
//// https://mvnrepository.com/artifact/io.cucumber/cucumber-testng
//    implementation("io.cucumber:cucumber-testng:7.14.1")
    implementation("org.codehaus.gpars:gpars:1.2.1")

    implementation("net.masterthought:cucumber-sandwich:5.7.8")
// Dependencies for cucumber2


    implementation("io.cucumber:cucumber-java:7.7.0")

    implementation("io.cucumber:cucumber-testng:7.7.0")
// Dependencies for commons


    implementation("org.apache.commons:commons-lang3:3.17.0")
// Rest. Assured


    implementation("io.rest-assured:rest-assured:5.5.0")
// Appium Dependencies


    implementation("io.appium:java-client:7.0.0")
//    Json Handling
//
//
//
//            implementation
    implementation("com.jayway.jsonpath:json-path:2.9.0")
//    "org. json: json:20240303")


// Excel
    implementation("com.googlecode.json-simple:json-simple:1.1.1")


// Infra Related dependencies
    implementation("org.apache.poi:poi-ooxml:5.3.0")

//    implementation("com.ms.infra.rr:cxfutils:2024.09.05")


//    implementation'com.ms. infra.rr:cxfutils: 2024.09.05'
//    implementation'com.ms. infra.rr: kerberos:2024.09.05'
//// other utilities
//    implementation'javax.mail:mail:1.4.7'
//    implementation
//    *com. opencsv: opencsv:5.9'
////PDFBox
//    implementation 'org.apache.pdfbox:pdfbox:2.0.24'
////TestNG
    implementation("org.testng:testng:7.4.0")
////Playwright Dependency
//    implementation "com.microsoft.playwright:playwright:$playwrightVersion"
////Dependency for Playwright Framework
//    implementation"com.ms.wmt.sqe.frmwrk:pwframework:$playwrightFrameworkVersion"
//// Dependencies for Accessibility Testing
    implementation("com.deque.html.axe-core:playwright:4.9.1")
////Test Manager Adaptor and other dependencies required by testmanageadaptor impLementation 'com.ms.wmt.sqe.testmanager:testmanageadaptor:cuc2.4.4'
//    implementation 'org.slf4j:slf4j-ext:2.0.16' impLementation 'org-projectlombok:Lombok: 1.18.34*
    
}

tasks.test {
    useTestNG()
}