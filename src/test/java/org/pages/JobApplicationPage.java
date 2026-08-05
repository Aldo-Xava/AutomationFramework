package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobApplicationPage {
    WebDriver driver;
    By salutation = By.xpath("//input[@name=\"salutation\"]");
    By firstName = By.xpath("//input[@name=\"firstName\"]");

    public JobApplicationPage(WebDriver driver){
        this.driver = driver;
    }

    public void setFirstName(String arg1){
        driver.findElement(firstName).sendKeys(arg1);
    }

    public void setSalutation(String arg1){
        driver.findElement(salutation).sendKeys(arg1);
    }
}
