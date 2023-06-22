package com.abeyis.step_definitions;

import com.abeyis.pages.AmeliyathanePage;
import com.abeyis.pages.LoginPage;
import com.abeyis.utilities.BrowserUtils;
import com.abeyis.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.abeyis.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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
        ameliyathanePage.RandevuTarihBas.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.RandevuTarihBas.sendKeys(date, Keys.ENTER);
        BrowserUtils.waitFor(3);
        BrowserUtils.waitFor(3);
        ameliyathanePage.RandevuTarihBit.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.RandevuTarihBit.sendKeys(date, Keys.ENTER);
        BrowserUtils.waitFor(3);
        ameliyathanePage.RandevuTarihYenile.click();
        BrowserUtils.waitFor(3);
        Assert.assertTrue(ameliyathanePage.randevuTeyit.getText().contains("Randevu Verildi"));
    }

    @And("clicks to dropdown menu")
    public void clicksToDropdownMenu() {
        BrowserUtils.waitFor(3);
        ameliyathanePage.çarksil.click();
    }

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

    //Refik
    @And("Clicks Randevu iptal Et button from dropdown")
    public void clicksRandevuIptalEtButtonFromDropdown() {
        BrowserUtils.waitForClickablility(ameliyathanePage.randevuIptalEtButonu, 5);
        ameliyathanePage.randevuIptalEtButonu.click();
    }

    @And("Selects the cancellation reason and save")
    public void selectsTheCancellationReasonAndSave() {

        //ilk sayfada bulunan randevu iptal nedenleri bir Map'te toplanarak her test döngüsünde farklı bir iptal nedeninin gelmesi sağlanmıştır.
        Map<Integer, String> iptalNedenleri = new HashMap<Integer, String>();
        iptalNedenleri.put(1, "/1 GÜN SONRASI İÇİN  OPERASYONA KARAR VERİLDİ");
        iptalNedenleri.put(2, "ACİL OLARAK OPERE EDİLMİŞ");
        iptalNedenleri.put(4, "Vital bulgu değerlerinde değişiklik");
        iptalNedenleri.put(5, "Operasyon için kullanılacak malzemenin olmaması/yetersizliği");
        iptalNedenleri.put(6, "Hipoglisemi/Hiperglisemi");
        iptalNedenleri.put(7, "Hipotiroid/Hipertiroid");
        iptalNedenleri.put(8, "Anemi");
        iptalNedenleri.put(9, "Hastanın ameliyat olmak istememesi/başka hastaneye gitmek istemesi");
        iptalNedenleri.put(10, "Hekim değişikliği");
        iptalNedenleri.put(11, "Hasta gelmedi");
        iptalNedenleri.put(12, "Hastaya anestezi verilememesi");
        iptalNedenleri.put(13, "Bilgilendirme kurallarına uymama");
        iptalNedenleri.put(14, "Ameliyat süresinin uzaması");
        iptalNedenleri.put(15, "Malzeme / Cihaz Eksikligi");
        iptalNedenleri.put(16, "Hastada enfeksiyon tespit edilmesi");


        Random randomNum = new Random();
        int randomReason = randomNum.nextInt(17);
        System.out.println("Randevu İptal Nedeni = " + iptalNedenleri.get(randomReason));
        String randomReasonCasting = "" + randomReason;

        WebElement iptalNedenleriInput = Driver.getDriver().findElement(By.name("IPTAL_NEDEN"));
        iptalNedenleriInput.click();
        BrowserUtils.waitFor(2);
        iptalNedenleriInput.sendKeys(Keys.ENTER);

        BrowserUtils.waitForVisibility(Driver.getDriver().findElement(By.xpath("(//div[@class='PopupContent'])[2]")), 5);
        Driver.getDriver().findElement(By.id("AmeliyatIptalNedenListe_DXFREditorcol1_I")).click();
        Driver.getDriver().findElement(By.id("AmeliyatIptalNedenListe_DXFREditorcol1_I")).sendKeys(randomReasonCasting);

        WebElement iptalNedeniSeçmeButonu = Driver.getDriver().findElement(By.xpath("//a[@data-lookupvalue=" + randomReason + "]"));
        BrowserUtils.waitForVisibility(iptalNedeniSeçmeButonu, 3);
        iptalNedeniSeçmeButonu.click();

        WebElement iptalNedeniKaydetButonu = Driver.getDriver().findElement(By.id("PopupSaveButton_0"));
        iptalNedeniKaydetButonu.click();
        BrowserUtils.waitFor(1);


    }

    @And("clicks the iptaller button")
    public void clicksTheIptallerButton() {

        BrowserUtils.waitFor(1);
        ameliyathanePage.randevuİptallerCheck.click();
        BrowserUtils.waitFor(1);

        WebElement randevusuIptalEdilenHasta = Driver.getDriver().findElement(By.xpath("//tr[@data-hasta-no='2011021193']"));
        BrowserUtils.waitForVisibility(randevusuIptalEdilenHasta, 5);
        actions.moveToElement(randevusuIptalEdilenHasta).click().perform();


    }

    @Then("The user confirms the cancellation of the appointment")
    public void theUserConfirmsTheCancellationOfTheAppointment() {

        Assert.assertTrue(ameliyathanePage.randevuiptal.getText().contains("İptal Edildi"));
    }

    @And("Clicks iptal Geri Al button to restore cancellation and approve")
    public void clicksIptalGeriAlButtonToRestoreCancellationAndApprove() {

        ameliyathanePage.iptalGeriAl.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.iptalGeriAlOnay.click();

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
        BrowserUtils.jsclick(ameliyathanePage.randevuDuzenlemeCarki);

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
        Select ameliyatErteleNedeniSelect = new Select(ameliyathanePage.randevuErtelemeNedeniDrpDwn);
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


    @And("The user confirms the deletion of the appointment")
    public void theUserConfirmsTheDeletionOfTheAppointment() {
        System.out.println("randevu sil tablo= " + ameliyathanePage.randevuSilTablo.getText());
        Assert.assertTrue(ameliyathanePage.randevuSilTablo.getText().contains("15175989"));
    }

    @And("The user created Ameliyat Listesi and Ameliyat İslemleri")
    public void theUserCreatedAmeliyatListesiAndAmeliyatİslemleri() {
        //ameliyat listesi
        Ameliyathane_islemleri_StepDefinitions ameliyathane_islemleri = new Ameliyathane_islemleri_StepDefinitions();
        ameliyathane_islemleri.theUserHoverOverAmeliyathaneİşlemleriAndSelectsAmeliyathaneListe();
        ameliyathane_islemleri.selectsDateAndServiceInformation();
        ameliyathane_islemleri.addSalonFromSalonIslemleri();
        ameliyathane_islemleri.selectThePatientToBeOperated();
        ameliyathane_islemleri.setTheOperationTime();
        ameliyathane_islemleri.addOperationAtHastayaYapilacakAmeliyatlar();
        ameliyathane_islemleri.selectSurgicalSurgeryTeamAt();
        ameliyathane_islemleri.selectThePersonResponsibleForTheSurgicalSurgeryTeam();
        ameliyathane_islemleri.selectAnesthesiaSurgeryTeam();
        ameliyathane_islemleri.selectThePersonResponsibleForTheAnesthesiaSurgeryTeam();
        ameliyathane_islemleri.reportOperatingRoomByClickingAmeliyathaneBildir();
        ameliyathane_islemleri.surgeryListIsCreatedAmeliyathaneBildirButtonDisappearsAndACheckmarkAppearsToTheRightOfTheSalonName();
        //Ameliyathane işlemleri
        ameliyathane_islemleri.theUserHoverOverAmeliyathaneİşlemleriAndSelectsAmeliyathaneIslemleri();
        ameliyathane_islemleri.userSelectsAppointmentDate();
        ameliyathane_islemleri.userTapsOnTheSalonIslemleri();
        ameliyathane_islemleri.approveTheSelectedSalonName();
        ameliyathane_islemleri.patientIsSentToTheSurgeryHall();
        ameliyathane_islemleri.clicksPopUpMessage();
        ameliyathane_islemleri.ameliyathaneyeIndirildiIsVisible();
    }

    @And("The user enters the unit code and then presses refresh")
    public void theUserEntersTheUnitCodeAndThenPressesRefresh() {
        BrowserUtils.waitFor(3);
        ameliyathanePage.AmeliyatBirimKodu.click();
        ameliyathanePage.AmeliyatBirimKodu.clear();
        BrowserUtils.waitFor(1);
        ameliyathanePage.AmeliyatBirimKodu.sendKeys("1020", Keys.ENTER);
        ameliyathanePage.btnAmeliyatRandevuListele.click();
    }



}
