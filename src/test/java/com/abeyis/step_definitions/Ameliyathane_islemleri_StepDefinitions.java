package com.abeyis.step_definitions;

import com.abeyis.pages.AmeliyathanePage;
import com.abeyis.pages.LoginPage;
import com.abeyis.utilities.BrowserUtils;
import com.abeyis.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ameliyathane_islemleri_StepDefinitions {

    AmeliyathanePage ameliyathanePage = new AmeliyathanePage();
    LoginPage loginPage = new LoginPage();


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
//        ameliyathanePage.AmeliyatBirimKodu.clear();
        ameliyathanePage.AmeliyatBirimKodu.sendKeys("1020", Keys.ENTER);
        ameliyathanePage.AmeliyatBirimKodu.sendKeys(Keys.ENTER);
        ameliyathanePage.AmeliyatBirimKodu.sendKeys("1020");
        ameliyathanePage.AmeliyatBirimKodu.sendKeys(Keys.ENTER);
    }
    @When("Clicks Yeni Randevu button")
    public void clicks_yeni_randevu_button() {
        ameliyathanePage.YeniRandevuButton.click();
    }
    @When("Selects patient using protocol number")
    public void selects_patient_using_protocol_number() {
        ameliyathanePage.ProtokolNoRandevu.sendKeys("501071678");
        ameliyathanePage.ProtokolNoRandevu.sendKeys(Keys.ENTER);
    }
    @When("Enters the Ameliyat-randevu date-time and save")
    public void enters_the_ameliyat_randevu_date_time_and_save() {
        ameliyathanePage.ameliyatAdiListe.click();
        ameliyathanePage.abdominoplastiSec.click();
        ameliyathanePage.randevuTarihi2.click();
        ameliyathanePage.selectMonth.click();
        ameliyathanePage.optionHaziran.click();
        ameliyathanePage.haziranBir.click();
        ameliyathanePage.saatSec.click();
        ameliyathanePage.saatOnBir.click();
        ameliyathanePage.ameliyatRandevuKaydetButton.click();
    }
    String expectedResult = "Randevu Verildi";
    String actualResult;
    @Then("Randevu Verildi text is seen")
    public void randevu_verildi_text_is_seen() {
        ameliyathanePage.inputTarihAna.click();
        ameliyathanePage.selectMonthAna.click();
        ameliyathanePage.optionHaziranAna.click();
        ameliyathanePage.haziranBirAna.click();
        BrowserUtils.waitFor(2);
        actualResult = ameliyathanePage.randevuVerildiText.getText();
        Assert.assertEquals(expectedResult,actualResult);
        System.out.println("actualResult = " + actualResult);


    }
//Zafer
    @When("the user hover over Ameliyathane İşlemleri and selects Ameliyathane Liste")
    public void theUserHoverOverAmeliyathaneİşlemleriAndSelectsAmeliyathaneListe() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(loginPage.hastaislemleri));
        loginPage.hastaislemleri.click();
        loginPage.ameliyathaneIslemleri.click();
        loginPage.ameliyathaneListesi.click();


    }

    @And("Selects date and service information")
    public void selectsDateAndServiceInformation() {
        BrowserUtils.waitFor(3);
        ameliyathanePage.AmeliyatTarih.click();
        ameliyathanePage.AmeliyatTarih.sendKeys("01.06.2023", Keys.ENTER);
        BrowserUtils.waitFor(3);
//        Actions actions = new Actions(Driver.getDriver());
//        actions.doubleClick(ameliyathanePage.ServisKodu);

        ameliyathanePage.ServisKodu.click();
        ameliyathanePage.ServisKodu.clear();
        ameliyathanePage.ServisKodu.sendKeys("1020", Keys.ENTER);
        BrowserUtils.waitFor(2);
        ameliyathanePage.ServisKodu2.sendKeys("1020", Keys.ENTER);

        ameliyathanePage.ServisKodu2Sec.click();
        ameliyathanePage.ServisKodu2SecKapat.click();




    }

    @And("Add Salon from Salon Islemleri")
    public void addSalonFromSalonIslemleri() {
    }

    @And("Select the patient to be operated")
    public void selectThePatientToBeOperated() {
    }

    @And("Set the operation time")
    public void setTheOperationTime() {
    }

    @And("Add operation at Hastaya Yapilacak Ameliyatlar")
    public void addOperationAtHastayaYapilacakAmeliyatlar() {
    }

    @And("Select Surgical Surgery Team at")
    public void selectSurgicalSurgeryTeamAt() {
    }

    @And("Select the person responsible for the Surgical Surgery Team")
    public void selectThePersonResponsibleForTheSurgicalSurgeryTeam() {
    }

    @And("Select Anesthesia Surgery Team")
    public void selectAnesthesiaSurgeryTeam() {
    }

    @And("Select the person responsible for the Anesthesia Surgery Team")
    public void selectThePersonResponsibleForTheAnesthesiaSurgeryTeam() {
    }

    @And("Report operating room by clicking Ameliyathane Bildir")
    public void reportOperatingRoomByClickingAmeliyathaneBildir() {
    }

    @Then("Surgery list is created Ameliyathane Bildir button disappears and a checkmark appears to the right of the salon name")
    public void surgeryListIsCreatedAmeliyathaneBildirButtonDisappearsAndACheckmarkAppearsToTheRightOfTheSalonName() {
    }








    //Refik
    @When("the user hover over Ameliyathane İşlemleri and selects Ameliyathane islemleri")
    public void theUserHoverOverAmeliyathaneİşlemleriAndSelectsAmeliyathaneIslemleri() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(loginPage.hastaislemleri));
        loginPage.hastaislemleri.click();
        loginPage.ameliyathaneIslemleri.click();
        loginPage.ameliyathaneIslemleri.click();

    }



    @And("Approve the selected salon name")
    public void approveTheSelectedSalonName() {
    }

    @And("Patient is sent to the surgery hall")
    public void patientIsSentToTheSurgeryHall() {
    }

    @Then("Ameliyathaneye indirildi is visiable")
    public void ameliyathaneyeIndirildiIsVisiable() {
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
    @And("Selects the approved salon and see the patient")
    public void selectsTheApprovedSalonAndSeeThePatient() {

    }

    @And("Click the Seansı Baslat button and see the info of patient as Anestezi Başladı")
    public void clickTheSeansıBaslatButtonAndSeeTheInfoOfPatientAsAnesteziBaşladı() {
    }

    @And("Click the Saatler button, enter the time and see the info of patient as Salona Giriş Yaptı")
    public void clickTheSaatlerButtonEnterTheTimeAndSeeTheInfoOfPatientAsSalonaGirişYaptı() {
    }
    @And("Click the Seansı Bitir button and finish the surgery")
    public void clickTheSeansıBitirButtonAndFinishTheSurgery() {
    }

    @Then("Send the patient to the service using POSTOP button")
    public void sendThePatientToTheServiceUsingPOSTOPButton() {
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



}
