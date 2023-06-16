package com.abeyis.step_definitions;


import com.abeyis.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before(value = "@randevusil")
    public void ameliyatLissteVeRandevu(){


    }

    @After
    public void teardownScenario(Scenario scenario){


        if (scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

//    Driver.closeDriver();
}
}
