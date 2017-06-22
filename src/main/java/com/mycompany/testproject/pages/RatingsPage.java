/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testproject.pages;

import com.mycompany.testproject.CoreTest;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author m.prytkova
 */

public class RatingsPage extends CoreTest {

    private final WebDriver driver;

    public RatingsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String url = "http://www.livejournal.com/ratings/";
    
    public void openTopSettings(){
    this.startScript(driver, "jQuery('.b-mainpage-intro-settings-icon').click()");
    }

}
