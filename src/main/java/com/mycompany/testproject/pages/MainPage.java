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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 *
 * @author m.prytkova
 */
public class MainPage {

    public String url = "http://www.livejournal.com";

    public void clickTop(final WebDriver driver) {
        driver.findElement(By.cssSelector(".s-header-item__link.s-header-item__link--ratings")).click();
    }
}
