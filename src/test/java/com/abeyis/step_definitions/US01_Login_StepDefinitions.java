package com.abeyis.step_definitions;


import com.abeyis.pages.LoginPage;
import com.abeyis.utilities.BrowserUtils;
import com.abeyis.utilities.ConfigurationReader;
import com.abeyis.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US01_Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    Actions actions=new Actions(Driver.getDriver());
    @Given("the user logs in")
    public void the_user_logs_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login();
//        BrowserUtils.waitFor(4);
//        loginPage.BilgileriDegistir.click();
//        BrowserUtils.waitFor(3);
//        actions.sendKeys(Keys.PAGE_DOWN).perform();
//        loginPage.Degistir.click();

    }




}

