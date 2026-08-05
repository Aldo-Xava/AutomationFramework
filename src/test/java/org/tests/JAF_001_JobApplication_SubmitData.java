package org.tests;
import org.pages.JobApplicationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class JAF_001_JobApplication_SubmitData {

    WebDriver driver;
    String FIRST_NAME = "Aldo";
    String SALUTATION = "TEST";
    JobApplicationPage page;


    @BeforeMethod (alwaysRun = true)
    void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.cnarios.com/challenges/job-application-form#challenge");
        page = new JobApplicationPage(driver);
    }

    @Test (groups = {"smoke"})
    void fillInfo() throws InterruptedException {
        Thread.sleep(2000);
        page.setFirstName(FIRST_NAME);
        page.setSalutation(SALUTATION);
        Thread.sleep(2000);
    }

    @AfterMethod (alwaysRun = true)
    void tearDown(){
        driver.quit();
    }

}
