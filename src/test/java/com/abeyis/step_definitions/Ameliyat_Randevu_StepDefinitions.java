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
import org.openqa.selenium.support.ui.Select;

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
        BrowserUtils.waitFor(2);
        ameliyathanePage.ProtokolNoRandevu.sendKeys(protocolNumber, Keys.ENTER);
    }

    @And("Enters the Ameliyat-randevu {string}, {string}, {string}, {string}")
    public void entersTheAmeliyatRandevu(String ameliyat, String date, String hours, String minutes) {
        BrowserUtils.waitFor(3);
        ameliyathanePage.ameliyatKodu.click();
        ameliyathanePage.ameliyatKodu.clear();
        ameliyathanePage.ameliyatKodu.sendKeys(ameliyat, Keys.ENTER);
        BrowserUtils.waitFor(3);
        ameliyathanePage.tarihRandevu.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.tarihRandevu.sendKeys(date, Keys.ENTER);
        ameliyathanePage.saatRandevuBox.click();
        ameliyathanePage.randevuSaati.sendKeys(hours);
        BrowserUtils.waitFor(3);
        ameliyathanePage.randevuDakika.sendKeys(minutes, Keys.ENTER);
        ameliyathanePage.ameliyatRandevuKaydetButton.click();
    }

    @Then("Check the Randevu Verildi text is seen on {string}")
    public void checkTheRandevuVerildiTextIsSeenOn(String date) {
        BrowserUtils.waitFor(3);
        ameliyathanePage.RandevuTarihSon.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.RandevuTarihSon.sendKeys(date, Keys.ENTER);
        BrowserUtils.waitFor(3);
        ameliyathanePage.RandevuTarihYenile.click();
        BrowserUtils.waitFor(3);
        Assert.assertTrue(ameliyathanePage.randevuTeyit.getText().contains("Randevu Verildi"));
    }

    @And("clicks to dropdown menu")
    public void clicksToDropdownMenu() {
        BrowserUtils.waitFor(3);
        ameliyathanePage.çarksil.click();    }

    @And("Clicks Randevu sil button from dropdown")
    public void clicksRandevuSilButtonFromDropdown() {
        BrowserUtils.waitFor(3);
        ameliyathanePage.randevuSil.click();
    }

    @And("clicks to Evet")
    public void clicksToEvet() {
        BrowserUtils.waitFor(3);
        ameliyathanePage.Evet.click();
    }





    //Bilal
    @And("Select the patient from list to see the Randevu Raporu")
    public void selectThePatientFromListToSeeTheRandevuRaporu() {
    ameliyathanePage.randevuCark.click();

    }

    @And("Click the Randevu Raporu button from dropdown to access the report")
    public void clickTheRandevuRaporuButtonFromDropdownToAccessTheReport() {

        ameliyathanePage.randevuRaporu.click();
        BrowserUtils.waitFor(2);
        ameliyathanePage.ameliyatRandevuRaporu.isDisplayed();

    }

    @Then("Check the Randevu Raporu is seen and close report")
    public void checkTheRandevuRaporuIsSeenAndCloseReport() {

        Assert.assertTrue(ameliyathanePage.ameliyatRandevuRaporu.getText().contains("Ameliyat Randevu Raporu"));
        BrowserUtils.waitFor(3);
        ameliyathanePage.randevuRaporuKapat.click();


    }

    @And("Click the Yeni Ameliyat button from dropdown")
    public void clickTheYeniAmeliyatButtonFromDropdown() {

        ameliyathanePage.randevuCark.click();
        ameliyathanePage.yeniAmeliyat.click();

    }


    @Then("Check not allowed to enter new patient for surgery by using Yeni Ameliyat button")
    public void checkNotAllowedToEnterNewPatientForSurgeryByUsingYeniAmeliyatButton() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(ameliyathanePage.yetkiYokAlert.getText().contains("Yetki Yok"));
        BrowserUtils.waitFor(5);
        ameliyathanePage.yetkiYokAlertKapat.click();


    }

    @Then("Check if the daily surgery capacity is exceeded or not by having warning message")
    public void checkIfTheDailySurgeryCapacityIsExceededOrNotByHavingWarningMessage() {

        BrowserUtils.waitFor(3);
        ameliyathanePage.warningMessage.isDisplayed();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(ameliyathanePage.kayitYapilamazMessage.getText().contains("Kayıt yapılamaz! Günlük maximum kayıt sayısı :1"));
        BrowserUtils.waitFor(5);
        ameliyathanePage.hataMesajiKapat.click();
        BrowserUtils.waitFor(2);
        ameliyathanePage.yeniRandevuKapat.click();


    }

    @And("Click randevu düzenleme button and select randevu düzelt option")
    public void clickRandevuDüzenlemeButtonAndSelectRandevuDüzeltOption() {
        ameliyathanePage.randevuDuzenlemeCarki.click();
        BrowserUtils.waitFor(1);
        ameliyathanePage.randevuDuzelt.click();
    }

    @And("Clicks ameliyatErteleRandevuDropDown")
    public void clicksAmeliyatErteleRandevuDropDown() {
        BrowserUtils.jsclick(ameliyathanePage.ameliyatRandevuErteleDropdown1);

    }

    @And("Selects ameliyatErteleBtn")
    public void selectsAmeliyatErteleBtn() {
        BrowserUtils.waitFor(2);
        BrowserUtils.jsclick(ameliyathanePage.randevuErtele1);

    }


    @Then("Clicks randevuErteleKaydet button")
    public void clicksRandevuErteleKaydetButton() {
        BrowserUtils.jsclick(ameliyathanePage.randevuErtelemeKaydet);

    }

    @Then("Clicks randevuErtelemeKapat button")
    public void clicksRandevuErtelemeKapatButton() {
        ameliyathanePage.randevuErtelemeKapat.click();
    }

    @And("Enters ameliyatErteleTarihi {string} and ameliyatErteleNedeni {string}")
    public void entersAmeliyatErteleTarihiAndAmeliyatErteleNedeni(String tarih, String ertelemeNedeni) {
        ameliyathanePage.randevuErtelemeTarihi.sendKeys(tarih + Keys.ENTER);
        Select ameliyatErteleNedeniSelect= new Select(ameliyathanePage.randevuErtelemeNedeniDrpDwn);
        ameliyatErteleNedeniSelect.selectByVisibleText(ertelemeNedeni);
    }

    @And("Selects Ertelenen Randevu Listesi")
    public void selectsErtelenenRandevuListesi() {
        BrowserUtils.waitFor(2);
        BrowserUtils.jsclick(ameliyathanePage.ertelenenRandevuListesi);

    }

    @Then("Clicks randevuErtelemeListesiKapat button")
    public void clicksRandevuErtelemeListesiKapatButton() {
        BrowserUtils.waitFor(2);
        BrowserUtils.jsclick(ameliyathanePage.ertelenenRandevuListesiKapat);
    }


}
