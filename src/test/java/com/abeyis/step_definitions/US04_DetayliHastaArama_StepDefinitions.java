package com.abeyis.step_definitions;

import com.abeyis.pages.DetayliAramaPage;
import com.abeyis.pages.MuayenekayitPage;
import com.abeyis.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US04_DetayliHastaArama_StepDefinitions {

    MuayenekayitPage muayenekayitPage = new MuayenekayitPage();
    DetayliAramaPage detayliAramaPage = new DetayliAramaPage();


    @When("User goes to Detailed Patient Search page")
    public void userGoesToDetailedPatientSearchPage() {

        muayenekayitPage.DetayliHastaAra.click();
    }


    @And("User enters the patient TC Kimlik No")
    public void userEntersThePatientTCKimlikNo() {

        BrowserUtils.waitFor(2);

        detayliAramaPage.TCKimlikNo.sendKeys("30493625282");
    }


    @And ("User clicks the search button")
    public void user_clicks_the_search_button()  {

        detayliAramaPage.Sorgula.click();

        BrowserUtils.waitFor(5);
    }


     @And("User enters the patient Protokol No")
    public void userEntersThePatientProtokolNo() {

         BrowserUtils.waitFor(3);

         detayliAramaPage.ProtokolNo.sendKeys("501071189");
    }


    @And("User enters the patient Hasta No")
    public void userEntersThePatientHastaNo() {

        BrowserUtils.waitFor(3);

        detayliAramaPage.HastaNo.sendKeys("2012250777");
    }


    @And("User clicks the Sadece Bugun Gelis checkbox")
    public void userClicksTheSadeceBugunGelisCheckbox(){

        BrowserUtils.waitFor(3);

        detayliAramaPage.sadeceBugunGelis.click();
    }


    @Then("User sees the patient information")
    public void userSeesThePatientInformation() {

        Assert.assertTrue(detayliAramaPage.Sec.isDisplayed());

    }


    @And("User enters the dead person ID number")
    public void userEntersTheDeadPersonIDNumber() {

        BrowserUtils.waitFor(2);

        detayliAramaPage.TCKimlikNo.sendKeys("11854494792");
    }


    @And ("User clicks the patient information")
    public void userClicksThePatientInformation() {

        detayliAramaPage.Sec.click();
    }


    @And("User clicks the dogrula button")
    public void userClicksTheDogrulaButton(){

        BrowserUtils.waitFor(3);

        detayliAramaPage.dogrulaButton.click();
    }


    @Then("User sees the death date of the dead person")
    public void userSeesTheDeathDateOfTheDeadPerson() {

        String expectedResult = "";

        String actualResult = detayliAramaPage.olumTarihi.getAttribute("value");

        System.out.println("Ölüm Tarihi = " + detayliAramaPage.olumTarihi.getAttribute("value"));

        Assert.assertEquals(expectedResult, actualResult);
    }


    @And("User clicks the left Gelis Tarihi field")
    public void userClicksTheLeftGelisTarihiField() {


        BrowserUtils.waitFor(3);

        detayliAramaPage.solGelisTarihi.click();
    }


    @And("User selects May two on the first pop up window")
    public void userSelectsMayTwoOnTheFirstPopUpWindow() {

        detayliAramaPage.solIkiMayis.click();
    }


    @And("User selects May two on the second pop up window")
    public void userSelectsMayTwoOnTheSecondPopUpWindow() {

        detayliAramaPage.sagIkiMayis.click();
    }


    @And("User clicks the right Gelis Tarihi field")
    public void userClicksTheRightGelisTarihiField() {

        BrowserUtils.waitFor(3);

        detayliAramaPage.sagGelisTarihi.click();
    }
}