package com.abeyis.step_definitions;


import com.abeyis.pages.LoginPage;
import com.abeyis.utilities.ConfigurationReader;
import com.abeyis.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US01_Login_StepDefinitions {

 LoginPage loginPage = new LoginPage();

    @Given("the user logs in")
    public void the_user_logs_in() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login();
    }

    @When("the user hover over Ameliyathane İşlemleri and selects Dr_Ameliyathane_islemleri")
    public void theUserHoverOverAmeliyathaneİşlemleriAndSelectsDr_Ameliyathane_islemleri() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(loginPage.hastaislemleri));

        loginPage.hastaislemleri.click();
        loginPage.ameliyathaneIslemleri.click();
        loginPage.drAmeliyathaneIslemleri.click();





    }
}

