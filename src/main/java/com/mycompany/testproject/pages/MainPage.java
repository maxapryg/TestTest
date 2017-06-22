/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testproject.pages;

/**
 *
 * @author m.prytkova
 */
import com.mycompany.testproject.CoreTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author m.prytkova
 */
public class MainPage {

    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;

    }

    public String url = "http://www.livejournal.com";

    By top = By.className("s-header-item__link--ratings");

    public RatingsPage clickTop() {
        driver.findElement(top).click();
        return new RatingsPage(driver);
    }

}
