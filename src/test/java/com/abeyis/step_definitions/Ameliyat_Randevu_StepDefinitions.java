package com.abeyis.step_definitions;

import com.abeyis.pages.AmeliyathanePage;
import com.abeyis.pages.LoginPage;
import com.abeyis.utilities.BrowserUtils;
import com.abeyis.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import com.abeyis.utilities.ConfigurationReader;

public class Ameliyat_Randevu_StepDefinitions {

    AmeliyathanePage ameliyathanePage = new AmeliyathanePage();
    LoginPage loginPage = new LoginPage();

    Actions actions = new Actions(Driver.getDriver());




    @And("Enter {string} and selects service")
    public void enterAndSelectsService(String serviceCode) {
        BrowserUtils.waitFor(3);
        ameliyathanePage.AmeliyatBirimKodu.click();
        ameliyathanePage.AmeliyatBirimKodu.clear();
        BrowserUtils.waitFor(1);
        ameliyathanePage.AmeliyatBirimKodu.sendKeys(serviceCode, Keys.ENTER);
    }

    @And("Selects patient using {string}")
    public void selectsPatientUsing(String protocolNumber) {
        BrowserUtils.waitFor(1);
        ameliyathanePage.ProtokolNoRandevu.sendKeys(protocolNumber, Keys.ENTER);
    }

    @And("Enters the Ameliyat-randevu {string}, {string}, {string}, {string}")
    public void entersTheAmeliyatRandevu(String ameliyat, String date, String hours, String minutes) {
        BrowserUtils.waitFor(3);
        ameliyathanePage.ameliyatKodu.click();
        ameliyathanePage.ameliyatKodu.clear();
        ameliyathanePage.ameliyatKodu.sendKeys(ameliyat, Keys.ENTER);
        BrowserUtils.waitFor(1);
        ameliyathanePage.tarihRandevu.click();
        BrowserUtils.waitFor(1);
        ameliyathanePage.tarihRandevu.sendKeys(date, Keys.ENTER);
        ameliyathanePage.saatRandevuBox.click();
        ameliyathanePage.randevuSaati.sendKeys(hours);
        BrowserUtils.waitFor(1);
        ameliyathanePage.randevuDakika.sendKeys(minutes, Keys.ENTER);
        ameliyathanePage.ameliyatRandevuKaydetButton.click();
    }

    @Then("Check the Randevu Verildi text is seen on {string}")
    public void checkTheRandevuVerildiTextIsSeenOn(String date) {
        BrowserUtils.waitFor(3);
        ameliyathanePage.RandevuTarihSon.click();
        BrowserUtils.waitFor(1);
        ameliyathanePage.RandevuTarihSon.sendKeys(date, Keys.ENTER);
        BrowserUtils.waitFor(3);
        ameliyathanePage.RandevuTarihYenile.click();
        BrowserUtils.waitFor(3);
        Assert.assertTrue(ameliyathanePage.randevuTeyit.getText().contains("Randevu Verildi"));
    }

    @And("clicks to dropdown menu")
    public void clicksToDropdownMenu() {



    }

    @And("Clicks Randevu sil button from dropdown")
    public void clicksRandevuSilButtonFromDropdown() {
    }

    @And("clicks to Evet")
    public void clicksToEvet() {
    }





    //Bilal
    @And("Select the patient from list to see the Randevu Raporu")
    public void selectThePatientFromListToSeeTheRandevuRaporu() {


    }

    @And("Click the Randevu Raporu button from dropdown to access the report")
    public void clickTheRandevuRaporuButtonFromDropdownToAccessTheReport() {


    }

    @Then("Check the Randevu Raporu is seen and close report")
    public void checkTheRandevuRaporuIsSeenAndCloseReport() {



    }

    @And("Click the Yeni Ameliyat button from dropdown")
    public void clickTheYeniAmeliyatButtonFromDropdown() {



    }


    @Then("Check not allowed to enter new patient by using Yeni Ameliyat button")
    public void checkNotAllowedToEnterNewPatientByUsingYeniAmeliyatButton() {



    }

    @And("Click randevu düzenleme button and select randevu düzelt option")
    public void clickRandevuDüzenlemeButtonAndSelectRandevuDüzeltOption() {
        ameliyathanePage.randevuDuzenlemeCarki.click();
        BrowserUtils.waitFor(1);
        ameliyathanePage.randevuDuzelt.click();
    }
}
