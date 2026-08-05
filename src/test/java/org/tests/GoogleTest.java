package org.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleTest {

    private WebDriver driver;

    @BeforeClass (alwaysRun = true)
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test(groups = {"smoke"})
    public void testGoogleTitle() {
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Google");
    }

    @AfterClass (alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
