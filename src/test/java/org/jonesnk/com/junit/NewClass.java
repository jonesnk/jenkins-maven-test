package org.jonesnk.com.junit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by bgi056 on 7/16/16.
 */
public class NewClass {


    private WebDriver driver;
    @Test
    public void testEasy() {
        driver.get("http://www.guru99.com/selenium-tutorial.html");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Free Selenium Tutorials"));
    }





}
