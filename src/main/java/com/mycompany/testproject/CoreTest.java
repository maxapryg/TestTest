/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testproject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author m.prytkova
 */
public class CoreTest {

    public void startScript(WebDriver driver, String script) {
        ((JavascriptExecutor) driver).executeScript(script);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {;
        }
    }

}
