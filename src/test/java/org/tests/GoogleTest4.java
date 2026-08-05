package org.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class GoogleTest4 {
    WebDriver driver;
    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
    }

    String title;
    @Test (priority = 1)
    public void checkTitle() {
        driver.get("https://www.google.com");
        title = driver.getTitle();
        Assert.assertEquals(title,"Googl3","Title Wrong!!!");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
