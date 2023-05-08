package com.abeyis.step_definitions;

import com.abeyis.pages.LoginPage;
import com.abeyis.pages.MuayenekayitPage;
import com.abeyis.utilities.BrowserUtils;
import com.abeyis.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US05_Logout_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    MuayenekayitPage muayenekayitPage = new MuayenekayitPage();

    Actions actions = new Actions(Driver.getDriver());

    @And("Hover over to the username")
    public void hoverOverToTheUsername() {


        actions.moveToElement(muayenekayitPage.username);
    }

    @And("Click the cikis option")
    public void clickTheCikisOption() {

        BrowserUtils.waitFor(3);
        actions.moveToElement(muayenekayitPage.cikis).click(muayenekayitPage.cikis).perform();
    }

    @Then("User on the HYBS enterance page")
    public void userOnTheHYBSEnterancePage() {




    }
}
