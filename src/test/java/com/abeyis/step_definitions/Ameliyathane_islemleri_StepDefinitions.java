package com.abeyis.step_definitions;

import com.abeyis.pages.AmeliyathanePage;
import com.abeyis.pages.LoginPage;
import com.abeyis.utilities.BrowserUtils;
import com.abeyis.utilities.ConfigurationReader;
import com.abeyis.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ameliyathane_islemleri_StepDefinitions {

    AmeliyathanePage ameliyathanePage = new AmeliyathanePage();
    LoginPage loginPage = new LoginPage();

    Actions actions = new Actions(Driver.getDriver());

    String ameliyatTarihi = "07.06.2023";
    @When("The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu")
    public void the_user_hover_over_ameliyathane_işlemleri_and_selects_ameliyat_randevu() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(loginPage.hastaislemleri));
        loginPage.hastaislemleri.click();
        loginPage.ameliyathaneIslemleri.click();
        loginPage.ameliyathaneRandevu.click();
    }

    @When("Enter service code and selects service")
    public void enter_service_code_and_selects_service() {
        ameliyathanePage.AmeliyatBirimKodu.click();
        //ameliyathanePage.AmeliyatBirimKodu.clear();
        BrowserUtils.waitFor(3);
        ameliyathanePage.AmeliyatBirimKodu.sendKeys("1020");
        BrowserUtils.waitFor(3);
        ameliyathanePage.AmeliyatBirimKodu.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(3);
        ameliyathanePage.AmeliyatBirimKodu.sendKeys("1020");
        BrowserUtils.waitFor(3);
        ameliyathanePage.AmeliyatBirimKodu.sendKeys(Keys.ENTER);
    }

    @When("Clicks Yeni Randevu button")
    public void clicks_yeni_randevu_button() {
        BrowserUtils.waitFor(3);
        ameliyathanePage.YeniRandevuButton.click();
    }

    @When("Selects patient using protocol number")
    public void selects_patient_using_protocol_number() {
        BrowserUtils.waitFor(3);
        ameliyathanePage.ProtokolNoRandevu.sendKeys("501071678",Keys.ENTER);

    }

    @When("Enters the Ameliyat-randevu date-time and save")
    public void enters_the_ameliyat_randevu_date_time_and_save() {
        BrowserUtils.waitFor(3);
        ameliyathanePage.ameliyatAdiListe.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.abdominoplastiSec.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.tarihRandevu.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.tarihRandevu.sendKeys(ameliyatTarihi, Keys.ENTER);
//        ameliyathanePage.randevuTarihi2.click();
//        ameliyathanePage.selectMonth.click();
//        ameliyathanePage.optionHaziran.click();
//        ameliyathanePage.haziranBir.click();
        ameliyathanePage.saatSec.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.saatOnBir.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.ameliyatRandevuKaydetButton.click();
    }

    String expectedResult = "Randevu Verildi";
    String actualResult;

    @Then("Randevu Verildi text is seen")
    public void randevu_verildi_text_is_seen() {
//        ameliyathanePage.inputTarihAna.click();
//        ameliyathanePage.selectMonthAna.click();
//        ameliyathanePage.optionHaziranAna.click();
//        ameliyathanePage.haziranBirAna.click();
//        BrowserUtils.waitFor(2);
//        actualResult = ameliyathanePage.randevuVerildiText.getText();
//        Assert.assertEquals(expectedResult, actualResult);
//        System.out.println("actualResult = " + actualResult);
        BrowserUtils.waitFor(3);
        ameliyathanePage.RandevuTarihSon.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.RandevuTarihSon.sendKeys(ameliyatTarihi, Keys.ENTER);
        BrowserUtils.waitFor(3);
        ameliyathanePage.RandevuTarihYenile.click();
        BrowserUtils.waitFor(3);
        Assert.assertTrue(ameliyathanePage.randevuTeyit.getText().contains("Randevu Verildi"));


    }

    //Zafer
    @When("the user hover over Ameliyathane İşlemleri and selects Ameliyathane Liste")
    public void theUserHoverOverAmeliyathaneİşlemleriAndSelectsAmeliyathaneListe() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(loginPage.hastaislemleri));
        BrowserUtils.jsclick(loginPage.hastaislemleri);
        loginPage.ameliyathaneIslemleri.click();
        loginPage.ameliyathaneListesi.click();
    }
    @And("Selects date and service information")
    public void selectsDateAndServiceInformation() {
        BrowserUtils.waitFor(3);
        ameliyathanePage.AmeliyatTarih.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.AmeliyatTarih.sendKeys(ameliyatTarihi, Keys.ENTER);
        BrowserUtils.waitFor(3);
        ameliyathanePage.ServisKodu.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.ServisKodu.clear();
        BrowserUtils.waitFor(3);
        // ameliyathanePage.ServisKodu.sendKeys("1020", Keys.ENTER);
        BrowserUtils.waitFor(3);
        BrowserUtils.doubleClick(ameliyathanePage.ServisKodu);
        BrowserUtils.waitFor(3);
        ameliyathanePage.ServisKodu2.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.ServisKodu2.sendKeys("1020",Keys.ENTER);
        BrowserUtils.waitFor(3);
        ameliyathanePage.ServisKodu2Sec.click();
        BrowserUtils.waitFor(3);
    }
    @And("Add Salon from Salon Islemleri")
    public void addSalonFromSalonIslemleri() {
        BrowserUtils.waitFor(3);
        BrowserUtils.jsclick(ameliyathanePage.Salonİslemleri);
        BrowserUtils.waitFor(3);
        BrowserUtils.jsclick(ameliyathanePage.SalonEkle);
        BrowserUtils.waitFor(3);
        BrowserUtils.jsclick(ameliyathanePage.SalonEkledenSec);
        BrowserUtils.waitFor(3);
        BrowserUtils.jsclick(ameliyathanePage.Kbb);
        BrowserUtils.waitFor(3);
        BrowserUtils.jsclick(ameliyathanePage.Salonİslemleri);
        BrowserUtils.waitFor(3);
        BrowserUtils.jsclick(ameliyathanePage.SalonIptal);
        BrowserUtils.waitFor(3);
        ameliyathanePage.Evet.click();
    }
    @And("Select the patient to be operated")
    public void selectThePatientToBeOperated() {
        BrowserUtils.waitFor(3);
        BrowserUtils.doubleClick(ameliyathanePage.Hastasec);
    }
    @And("Set the operation time")
    public void setTheOperationTime() {
        BrowserUtils.waitFor(3);
        BrowserUtils.waitFor(3);
        actions.click(ameliyathanePage.AmeliyatSaat).sendKeys("14:40").perform();
    }
    @And("Add operation at Hastaya Yapilacak Ameliyatlar")
    public void addOperationAtHastayaYapilacakAmeliyatlar() {
        BrowserUtils.waitFor(3);
        ameliyathanePage.AmeliyatEkle.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.YapilacakAmeliyat.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.YapilacakAmeliyatSec.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.KesBilgisi.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.KesBilgisi.sendKeys("1");
        BrowserUtils.waitFor(2);
        ameliyathanePage.DoktorSecUcNokta.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.DoktorSec.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.Kaydet.click();
    }
    @And("Select Surgical Surgery Team at")
    public void selectSurgicalSurgeryTeamAt() {
        BrowserUtils.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        BrowserUtils.waitFor(3);
        BrowserUtils.jsclick(ameliyathanePage.AmeliyatEkibiEkle);
        BrowserUtils.waitFor(3);
        BrowserUtils.jsclick(ameliyathanePage.AmeliyatDoktorListe1);
        BrowserUtils.waitFor(3);
        BrowserUtils.jsclick(ameliyathanePage.AmeliyatDoktorListe2);
        BrowserUtils.waitFor(3);
        ameliyathanePage.AmeliyatDoktorListeSecKapat.click();
    }
    @And("Select the person responsible for the Surgical Surgery Team")
    public void selectThePersonResponsibleForTheSurgicalSurgeryTeam() {
        BrowserUtils.waitFor(3);
        BrowserUtils.jsclick(ameliyathanePage.AmeliyatDoktorSorumluSec);
    }
    @And("Select Anesthesia Surgery Team")
    public void selectAnesthesiaSurgeryTeam() {
        BrowserUtils.waitFor(2);
        BrowserUtils.jsclick(ameliyathanePage.AnestesiAmeliyatEkibiEkle);
        BrowserUtils.waitFor(2);
        BrowserUtils.jsclick(ameliyathanePage.AnestesiAmeliyatEkibiListe1);
        BrowserUtils.jsclick(ameliyathanePage.AnestesiAmeliyatEkibiListe2);
        BrowserUtils.jsclick(ameliyathanePage.AmeliyatDoktorListeSecKapat);
    }
    @And("Select the person responsible for the Anesthesia Surgery Team")
    public void selectThePersonResponsibleForTheAnesthesiaSurgeryTeam() {
        BrowserUtils.waitFor(2);
        BrowserUtils.jsclick(ameliyathanePage.AnestesiDoktorSorumluSec);
    }
    @And("Report operating room by clicking Ameliyathane Bildir")
    public void reportOperatingRoomByClickingAmeliyathaneBildir() {
        BrowserUtils.waitFor(2);
        actions.sendKeys(Keys.PAGE_UP);
        BrowserUtils.waitFor(2);
        ameliyathanePage.İslemler.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.AmeliyathaneBildir.click();
    }
    @Then("Surgery list is created Ameliyathane Bildir button disappears and a checkmark appears to the right of the salon name")
    public void surgeryListIsCreatedAmeliyathaneBildirButtonDisappearsAndACheckmarkAppearsToTheRightOfTheSalonName() {
        BrowserUtils.waitFor(2);
        Assert.assertFalse(ameliyathanePage.AmeliyathaneBildir.isDisplayed());
        BrowserUtils.waitFor(2);
        Assert.assertTrue(ameliyathanePage.TıkButonu.isDisplayed());
    }


    //Refik
    @When("the user hover over Ameliyathane İşlemleri and selects Ameliyathane islemleri")
    public void theUserHoverOverAmeliyathaneİşlemleriAndSelectsAmeliyathaneIslemleri() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(loginPage.hastaislemleri));
        loginPage.hastaislemleri.click();
        BrowserUtils.waitFor(2);
        loginPage.ameliyathaneIslemleri.click();
        BrowserUtils.waitFor(2);
        loginPage.ameliyathaneIslem.click();

    }


    @And("user selects surgery department in order to approve KBB")
    public void userSelectsSurgeryDepartmentInOrderToApprove() {
        BrowserUtils.waitFor(3);
        ameliyathanePage.KBBMasasi.click();
    }

    @And("user taps on the Salon Islemleri")
    public void userTapsOnTheSalonIslemleri() {
        BrowserUtils.waitFor(3);
        actions.moveToElement(ameliyathanePage.salonIslemleri).perform();
    }

    @And("Approve the selected salon name")
    public void approveTheSelectedSalonName() {
        BrowserUtils.waitFor(5);
        actions.moveToElement(ameliyathanePage.salonOnayla).perform();
        BrowserUtils.waitFor(5);
        ameliyathanePage.salonOnayla.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.salonOnaylaEvet.click();
        BrowserUtils.waitFor(5);
        ameliyathanePage.tablotıkla.click();
        BrowserUtils.waitFor(3);

    }

    @And("Patient is sent to the surgery hall")
    public void patientIsSentToTheSurgeryHall() {
        actions.sendKeys(Keys.PAGE_DOWN);
        BrowserUtils.waitForClickablility(ameliyathanePage.linkHastaGiriYap, 10);
        BrowserUtils.jsclick(ameliyathanePage.linkHastaGiriYap);
    }

    @Then("Ameliyathaneye indirildi is visible")
    public void ameliyathaneyeIndirildiIsVisible() {
        actions.sendKeys(Keys.PAGE_UP);
        BrowserUtils.waitFor(5);
        Assert.assertTrue(ameliyathanePage.hastaDurumuAcıklaması.getText().contains("Ameliyathaneye İndirildi"));
    }


    @And("User selects appointment date")
    public void userSelectsAppointmentDate() {
        BrowserUtils.waitFor(3);
        BrowserUtils.waitForClickablility(ameliyathanePage.AmeliyatTarih,10);
        ameliyathanePage.AmeliyatTarih.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.AmeliyatTarih.sendKeys(ameliyatTarihi, Keys.ENTER);
        BrowserUtils.waitFor(3);
        ameliyathanePage.refreshMethod();
    }

    @And("Approve pop-up message")
    public void approvePopUpMessage() {

        BrowserUtils.waitFor(3);
        ameliyathanePage.approveMessage();
        BrowserUtils.waitFor(3);

    }



    @And("User selects patient from protocol number {string}")
    public void userSelectsPatientFromProtocolNumber(String protocolNumber) {
        BrowserUtils.waitFor(3);
        ameliyathanePage.selectedPatient.sendKeys(ConfigurationReader.getProperty("protokolNo"));
        BrowserUtils.waitFor(3);
        BrowserUtils.jsclick(ameliyathanePage.HastaBul);

    }

    @And("Clicks pop-up message")
    public void clicksPopUpMessage() {
        BrowserUtils.waitFor(3);
        ameliyathanePage.popUpMessage.click();
    }
    //Timur
    @When("the user hover over Ameliyathane İşlemleri and selects Ameliyathane Malzeme")
    public void theUserHoverOverAmeliyathaneİşlemleriAndSelectsAmeliyathaneMalzeme() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(loginPage.hastaislemleri));
        loginPage.hastaislemleri.click();
        loginPage.ameliyathaneIslemleri.click();
        loginPage.ameliyathaneMalzemeIslem.click();
    }

    @And("The user Selects date and service information")
    public void theUserSelectsDateAndServiceInformation() {
        BrowserUtils.waitFor(3);
        ameliyathanePage.AmeliyatTarih.click();
        ameliyathanePage.AmeliyatTarih.sendKeys(ameliyatTarihi, Keys.ENTER);
        BrowserUtils.waitFor(3);
        ameliyathanePage.malzemeKBB.sendKeys("KBB", Keys.ENTER);

    }

    @And("The user clicks one of the patient from the patient raw")
    public void theUserClicksOneOfThePatientFromThePatientRaw() {
        BrowserUtils.waitFor(5);
        ameliyathanePage.ameliyatHastaSec1.click();
    }

    @And("The user clicks Sablon Uygula Button")
    public void theUserClicksSablonUygulaButton() {
        BrowserUtils.waitFor(3);
        ameliyathanePage.sablonUygula.click();
    }

    @And("The user selects one of the option from the Sablon Menu")
    public void theUserSelectsOneOfTheOptionFromTheSablonMenu() {
        BrowserUtils.waitFor(3);
        ameliyathanePage.sablon1Sec.click();
    }

    @And("The user clicks Tumunu Sec button from the Malzeme Ekle Menu")
    public void theUserClicksTumunuSecButtonFromTheMalzemeEkleMenu() {
        BrowserUtils.waitFor(3);
//        ameliyathanePage.sablonTumunuSec.click();
//   BrowserUtils.jsclick(ameliyathanePage.sablonTumunuSec);
        BrowserUtils.waitFor(3);
        BrowserUtils.jsclick(ameliyathanePage.malzemeOnay1);
//        BrowserUtils.waitFor(3);
//        BrowserUtils.jsclick(ameliyathanePage.malzemeOnay2);
//    ameliyathanePage.malzemeOnay3.click();
//    ameliyathanePage.malzemeOnay4.click();
    }

    @And("The user selects necessary options from the Ilac Ekle Menu")
    public void theUserSelectsNecessaryOptionsFromTheIlacEkleMenu() {
        BrowserUtils.waitFor(10);
        ameliyathanePage.ilacOnay1.click();
        BrowserUtils.waitFor(5);
        ameliyathanePage.ilacOnay2.click();
    }

    @And("The user selects Malzeme Isle & Guncelle Button")
    public void theUserSelectsMalzemeIsleGuncelleButton() {
        BrowserUtils.waitFor(5);
        ameliyathanePage.malzemeIsleGuncelle.click();
    }

    @And("The user selects Evet from the pop Up menu")
    public void theUserSelectsEvetFromThePopUpMenu() {
       BrowserUtils.waitForVisibility(ameliyathanePage.malzemeIsleOnayTamam, 10);
       ameliyathanePage.malzemeIsleOnayTamam.click();
    }

    @And("The user selects Tamam from the pop Up menu")
    public void theUserSelectsTamamFromThePopUpMenu() {
        BrowserUtils.waitFor(5);
        ameliyathanePage.malzemeIsleUyariOnayTamam.click();
    }

    @And("The user selects Ilaclari Isle & Guncelle Button")
    public void theUserSelectsIlaclariIsleGuncelleButton() {
        BrowserUtils.waitFor(3);
        ameliyathanePage.ilacIsleGuncelle.click();
    }


    // Bilal

    @When("the user hover over Ameliyathane İşlemleri and selects Dr_Ameliyathane_islemleri")
    public void theUserHoverOverAmeliyathaneİşlemleriAndSelectsDr_Ameliyathane_islemleri() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(loginPage.hastaislemleri));

        loginPage.hastaislemleri.click();
        loginPage.ameliyathaneIslemleri.click();
        loginPage.drAmeliyathaneIslemleri.click();


    }

    @And("Enters the operation date and click Yenile button")
    public void entersTheOperationDateAndClickYenileButton() {

        BrowserUtils.waitFor(5);
        ameliyathanePage.KayitKapat.click();
        BrowserUtils.waitFor(3);
        ameliyathanePage.AmeliyatTarih.click();
        ameliyathanePage.AmeliyatTarih.sendKeys(ameliyatTarihi, Keys.ENTER);
        BrowserUtils.waitFor(5);
        BrowserUtils.jsclick(ameliyathanePage.Yenile);

    }

    @And("Selects the approved salon and click sec button")
    public void selectsTheApprovedSalonAndClickSecButton() {
        BrowserUtils.waitFor(5);
       BrowserUtils.jsclick(ameliyathanePage.SalonAc);
//        BrowserUtils.waitFor(3);
//        ameliyathanePage.Masa.sendKeys("KBB");
//        ameliyathanePage.Masa.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(3);
        BrowserUtils.jsclick(ameliyathanePage.SalonSec);
//
//

//       actions.moveToElement(ameliyathanePage.Masa).click().perform();
//        ameliyathanePage.Masa.sendKeys("KBB");
//        ameliyathanePage.Masa.sendKeys(Keys.ENTER);
//        ameliyathanePage.salonServisKodu.sendKeys("1020", Keys.ENTER);
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
//        wait.until(ExpectedConditions.visibilityOf(ameliyathanePage.SalonKBB));
//        ameliyathanePage.SalonKBB.click();
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
//        wait.until(ExpectedConditions.visibilityOf(ameliyathanePage.SalonSec));
//        BrowserUtils.waitFor(5);
//        BrowserUtils.jsclick(ameliyathanePage.SalonSec);



    }

    @And("Selects the patient and clicks the Seansı Baslat button, see the info of patient as Anestezi Başladı")
    public void selectsThePatientAndClicksTheSeansıBaslatButtonSeeTheInfoOfPatientAsAnesteziBaşladı() {

        BrowserUtils.waitFor(5);
        BrowserUtils.jsclick(ameliyathanePage.HastaSecin);

        BrowserUtils.waitFor(5);
        ameliyathanePage.SeansBaslat.click();
        BrowserUtils.waitFor(5);
//        ameliyathanePage.uyariKapat.click();
        ameliyathanePage.SeansBaslatOnay.click();


    }

    @And("Clicks the Seansı Bitir button and finish the surgery")
    public void clicksTheSeansıBitirButtonAndFinishTheSurgery() {
        BrowserUtils.waitFor(5);
        ameliyathanePage.SeansBitir.click();
        BrowserUtils.waitFor(5);
        ameliyathanePage.SeansBitirOnay.click();
//      ameliyathanePage.SeansBitirIptal.click();

    }


    @Then("See the patient as Servise Gönderildi by using POSTOP button")
    public void seeThePatientAsServiseGönderildiByUsingPOSTOPButton() {

        ameliyathanePage.Postop.click();
        BrowserUtils.waitFor(5);
        ameliyathanePage.PostopTarih.click();
        ameliyathanePage.PostopTarih.sendKeys(ameliyatTarihi, Keys.ENTER);
        BrowserUtils.waitFor(5);
        ameliyathanePage.PostopYenile.click();
        BrowserUtils.waitFor(5);
        Assert.assertTrue(ameliyathanePage.PostopMessage.getText().contains("Servise Gönderildi"));
        BrowserUtils.waitFor(3);
        ameliyathanePage.PostopKapat.click();

    }

}
