package com.abeyis.step_definitions;

import com.abeyis.pages.HastaKayitPage;
import com.abeyis.pages.LoginPage;
import com.abeyis.pages.MuayenekayitPage;
import com.abeyis.utilities.BrowserUtils;
import com.abeyis.utilities.ConfigurationReader;
import com.abeyis.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;

import static com.abeyis.utilities.BrowserUtils.waitForVisibility;
import static org.junit.Assert.assertEquals;

public class US02_MuayeneKayit_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    MuayenekayitPage muayenekayitPage = new MuayenekayitPage();
    HastaKayitPage hastaKayitPage = new HastaKayitPage();
    Faker faker = new Faker();
     Actions actions = new Actions(Driver.getDriver());
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/19yy");

    @When("User go to the Hasta Kayit page")
    public void user_go_to_the_hasta_kayit_page() {

        hastaKayitPage.HastaKayit.click();

    }

    @And("User enters the patient information without ID Card and ID Number")
    public void userEntersThePatientInformationWithoutIDCardAndIDNumber() throws InterruptedException {

        hastaKayitPage.hastaKayitGiris("999", "0");

        BrowserUtils.waitFor(3);
        hastaKayitPage.HastaTuru.click();
        hastaKayitPage.Kimliksiz.click();
        hastaKayitPage.KimliksizSec.click();
        hastaKayitPage.KaydetF10.click();

        BrowserUtils.waitFor(2);
        hastaKayitPage.islemBasariliKapat.click();
        hastaKayitPage.Kapat.click();

        hastaKayitPage.GelisSekli.click();
        Select select1 = new Select(hastaKayitPage.GelisSekli);
        select1.selectByVisibleText("Ayaktan");

    }

    @Then("Patient is saved to the muayene kayit module.")
    public void patient_is_saved_to_the_muayene_kayit_module() throws InterruptedException {

       hastaKayitPage.Kaydet.click();
        BrowserUtils.waitFor(2);
       hastaKayitPage.MuayeneKayitTamam.click();

    }


   @And("User enters the patient passport information as a Health Tourism option")
    public void userEntersThePatientPassportInformationAsAHealthTourismOption() throws InterruptedException {

       hastaKayitPage.hastaKayitGiris("999", "2");

        BrowserUtils.waitFor(3);
        hastaKayitPage.HastaTuru.click();
        hastaKayitPage.SaglıkTurizmi.click();
        hastaKayitPage.SaglıkTurizmSec.click();

        hastaKayitPage.Uyrugu.click();

        Select select2 = new Select(hastaKayitPage.Uyrugu);
        select2.selectByVisibleText("ALMANYA");

        BrowserUtils.waitFor(3);

       hastaKayitPage.pasaportgiris();

        BrowserUtils.waitFor(3);
        hastaKayitPage.islemBasariliKapat.click();
        hastaKayitPage.Kapat.click();

       hastaKayitPage.AraOdeme.click();

        BrowserUtils.waitFor(3);
        hastaKayitPage.GelisSekli.click();
        Select select1 = new Select(hastaKayitPage.GelisSekli);
        select1.selectByVisibleText("Ayaktan");

    }

    @Then("Health Tourism Patient is saved to the muayene kayit module.")
    public void healthTourismPatientIsSavedToTheMuayeneKayitModule() {
        hastaKayitPage.Kaydet.click();
        hastaKayitPage.AraOdeme.click();
        hastaKayitPage.MuayeneKayitTamam.click();

    }

    @And("User enters the patient passport information as a Victim of Human Trafficking option")
    public void userEntersThePatientPassportInformationAsAVictimOfHumanTraffickingOption() throws InterruptedException {


        hastaKayitPage.hastaKayitGiris("99999", "2");

        BrowserUtils.waitFor(3);
        hastaKayitPage.HastaTuru.click();
        hastaKayitPage.insanTicaretMagduru.click();
        hastaKayitPage.insanTicaretMagduruSec.click();

        hastaKayitPage.Uyrugu.click();

        Select select2 = new Select(hastaKayitPage.Uyrugu);
        select2.selectByVisibleText("AFGANISTAN");

        BrowserUtils.waitFor(3);

        hastaKayitPage.pasaportgiris();

        BrowserUtils.waitFor(3);
        hastaKayitPage.islemBasariliKapat.click();

        hastaKayitPage.Kapat.click();

        hastaKayitPage.GelisSekli.click();
        Select select1 = new Select(hastaKayitPage.GelisSekli);
        select1.selectByVisibleText("Ayaktan");

    }
    @And("User enters the patient passport information as a Tourist option")
    public void userEntersThePatientPassportInformationAsATouristOption() throws InterruptedException {


        hastaKayitPage.hastaKayitGiris("999", "2");


        BrowserUtils.waitFor(3);
        hastaKayitPage.HastaTuru.click();
        hastaKayitPage.turist.click();
        hastaKayitPage.turistSec.click();

        hastaKayitPage.Uyrugu.click();

        Select select2 = new Select(hastaKayitPage.Uyrugu);
        select2.selectByVisibleText("BULGARISTAN");

        BrowserUtils.waitFor(3);

        hastaKayitPage.pasaportgiris();

        BrowserUtils.waitFor(3);
        hastaKayitPage.islemBasariliKapat.click();
        hastaKayitPage.Kapat.click();

        hastaKayitPage.AraOdeme.click();

        hastaKayitPage.GelisSekli.click();
        Select select1 = new Select(hastaKayitPage.GelisSekli);
        select1.selectByVisibleText("Ayaktan");

    }

    @Then("Tourist patient is saved to the muayene kayit module.")
    public void touristPatientIsSavedToTheMuayeneKayitModule() {

        hastaKayitPage.Kaydet.click();
        hastaKayitPage.AraOdeme.click();
        hastaKayitPage.MuayeneKayitTamam.click();


    }






    @When("user clicks Hasta Kayıt button")
    public void userClicksHastaKayıtButton() {
        BrowserUtils.waitFor(2);
        muayenekayitPage.patientRegisterButton.click();
    }
    @And("user clicks Türk Soylu Yabancılar option within Hasta Türü Dropdown menu.")
    public void userClicksTürkSoyluYabancılarOptionWithinHastaTürüDropdownMenu() {
        muayenekayitPage.patientTypeDropDwn.click();
        muayenekayitPage.patientTypeCode.sendKeys("10" + Keys.ENTER);
//        patientRegistrationPage.patientTypeSelect.click();
        BrowserUtils.waitFor(2);
        BrowserUtils.doubleClick(muayenekayitPage.patientTypeSelect);

    }
    @And("user selects one country other than Türkiye from Uyruğu dropdown box.")
    public void userSelectsOneCountryOtherThanTürkiyeFromUyruğuDropdownBox() {
        Select select = new Select(muayenekayitPage.patientNationalityDropDwn);
        select.selectByVisibleText("ALMANYA");
    }

    @And("user selects {string} from Uyruğu dropdown box.")
    public void userSelectsFromUyruğuDropdownBox(String countryName) {
        Select select = new Select(muayenekayitPage.patientNationalityDropDwn);
        select.selectByVisibleText(countryName);
    }
    //    @And("user selects one option from Kurumu dropdown menu.")
    //    public void userSelectsOneOptionFromKurumuDropdownMenu() {
    //    BrowserUtils.doubleClick(patientRegistrationPage.institution);
    //    patientRegistrationPage.mainInstitutionCode.sendKeys("10073"+Keys.ENTER);
    //    BrowserUtils.doubleClick(patientRegistrationPage.mainInstListSelect);

    //    }
    @And("user selects one option from Kurumu dropdown menu.")
    public void userSelectsOneOptionFromKurumuDropdownMenu() {

        muayenekayitPage.institution.click();
        muayenekayitPage.institution.sendKeys("99999" + Keys.ENTER);

    }

    @And("user selects one option from Kurum Detay dropdown menu.")
    public void userSelectsOneOptionFromKurumDetayDropdownMenu() {
        muayenekayitPage.subInstitution.click();
        muayenekayitPage.subInstitution.sendKeys("3" + Keys.ENTER);

    }

    @And("user fills out related Information.")
    public void userFillsOutRelatedInformation() {
        Select selectGender = new Select(muayenekayitPage.genderDropDwn);
        muayenekayitPage.patientName.sendKeys(faker.name().firstName());
        muayenekayitPage.patientSurname.sendKeys(faker.name().lastName());
        muayenekayitPage.dateOfBirth.sendKeys(sdf.format(faker.date().birthday())+Keys.ENTER);
        selectGender.selectByVisibleText("ERKEK");
        muayenekayitPage.fatherName.sendKeys(faker.name().firstName());
        muayenekayitPage.motherName.sendKeys(faker.name().firstName());
        muayenekayitPage.placeOfBirth.sendKeys(faker.address().city());
        muayenekayitPage.patientCellPhoneNo.sendKeys(faker.phoneNumber().cellPhone());
        muayenekayitPage.patientAdress1.sendKeys(faker.address().fullAddress().substring(0,20));
        muayenekayitPage.passportId.sendKeys(faker.numerify("#####"));
        muayenekayitPage.passportNo.sendKeys(faker.numerify("####"));
        muayenekayitPage.passportSerialNo.sendKeys(faker.numerify("######"));


    }

    @Then("user clicks on Save icon and confirms registration success message.")
    public void userClicksOnSaveIconAndConfirmsRegistrationSuccessMessage() {
        muayenekayitPage.saveBtn.click();
        muayenekayitPage.patientRegisterCloseTab.click();
        muayenekayitPage.patientRegisterClosePage.click();

    }
    @When("user enters the idNumber")
    public void user_enters_the_id_number() {
        muayenekayitPage.identityNumberInput.sendKeys
                (ConfigurationReader.getProperty("patientIdentityNumber") + Keys.ENTER);
    }


    @And("user clicks Polyclinic \\(Poliklinik) and enters PolyclinicCode {string} to select Polyclinic")
    public void userClicksPolyclinicPoliklinikAndEntersPolyclinicCodeToSelectPolyclinic(String polyclinicCode) {
        BrowserUtils.waitFor(1);
        BrowserUtils.doubleClick(muayenekayitPage.polyclinicCodeInput);
        muayenekayitPage.selectPolyclinic(Integer.parseInt(polyclinicCode));
    }

    @And("user clicks Beneficiary Type \\(Hak Sah.Tip) and selects {string}")
    public void userClicksBeneficiaryTypeHakSahTipAndSelects(String beneficiaryType) {
        Select select = new Select(muayenekayitPage.beneficiaryTypeDropdown);
        select.selectByVisibleText(beneficiaryType);
    }

    @And("user clicks Arrival Type \\(Geliş Şekli) and selects {string}")
    public void userClicksArrivalTypeGelişŞekliAndSelects(String arrivalType) {
        Select select = new Select(muayenekayitPage.arrivalTypeDropdown);
        select.selectByVisibleText(arrivalType);
    }

    @Then("user clicks Save \\(Kaydet) button")
    public void userClicksSaveKaydetButton() {
        muayenekayitPage.saveButton.click();
    }


    @Then("user asserts the alert message as {string}")
    public void userAssertsTheAlertMessageAs(String alertMessage) {

        Assert.assertTrue(muayenekayitPage.alertMessage.getAttribute("textContent").contains(alertMessage));
    }


    @Then("user confirms the message and closes the window")
    public void userConfirmsTheMessageAndClosesTheWindow() {
        muayenekayitPage.confirmMessage.click();
    }

    @And("user clicks cancelAppointment \\(Geliş İptal) button")
    public void userClicksCancelAppointmentGelişİptalButton() {
        muayenekayitPage.cancelArrivalButton.click();
    }

    @And("user clicks Cancellation Status \\(İptal Durumu) and select a reason as {string} for cancelation")
    public void userClicksCancellationStatusİptalDurumuAndSelectAReasonAsForCancelation(String cancellationReason) {
        Select select = new Select(muayenekayitPage.arrivalCancelCode);
        select.selectByVisibleText(cancellationReason);
    }

    @And("user clicks appointment cancellation Save button")
    public void userClicksAppointmentCancellationSaveButton() {
        muayenekayitPage.popupSaveButton.click();
    }

    @And("user clicks getPatientCurrentAppointmentButton")
    public void userClicksGetPatientCurrentAppointmentButton() {
        muayenekayitPage.getPatientCurrentAppointmentButton.click();
    }

    @And("the user clicks changePolyclinicButton \\(Değ.)")
    public void theUserClicksChangePolyclinicButtonDeğ() {
        muayenekayitPage.changePolyclinicButton.click();
    }

    @And("user enters PolyclinicCode {string} to select Polyclinic")
    public void userEntersPolyclinicCodeToSelectPolyclinic(String polyclinicCode) {
        muayenekayitPage.selectPolyclinic(Integer.parseInt(polyclinicCode));
    }

    @Then("user confirms the message and closes pop up window")
    public void userConfirmsTheMessageAndClosesPopUpWindow() {
        muayenekayitPage.closePopupWindowButton.click();
    }

    @And("user clicks clear button")
    public void userClicksClearButton() {
        actions.click(muayenekayitPage.clearPage).perform();
    }

    @And("user clicks continuePatientAppointmentButton")
    public void userClicksContinuePatientAppointmentButton() {
        actions.click(muayenekayitPage.continuePatientAppointmentButton).perform();
    }

    @And("user enters a future appointment date")
    public void userEntersAFutureAppointmentDate() {
        muayenekayitPage.changeTimeButton.click();
        muayenekayitPage.arrivalDateInputInCalender.click();
        muayenekayitPage.arrivalDateInputInCalender.clear();
        muayenekayitPage.arrivalDateInputInCalender.sendKeys("22.04.2023 11:00" + Keys.ENTER);
        //BrowserUtils.waitFor(4);
        muayenekayitPage.changeArrivalDateButton.click();

    }

    @And("user confirms the \\(Vaka kaydı yapmak ister misiniz) pop up message")
    public void userConfirmsTheVakaKaydıYapmakIsterMisinizPopUpMessage() {
        actions.sendKeys(Keys.ENTER).perform();
    }

    @And("user confirms the \\(Vaka Gelişi Kaydı) pop up message")
    public void userConfirmsTheVakaGelişiKaydıPopUpMessage() {
        muayenekayitPage.confirmationButtonOfVakaGelisKayitForm.click();
    }


    @Then("user verifies that the arrival type is \\(Kontrol Muayene) for the last appointment")
    public void userVerifiesThatTheArrivalTypeIsKontrolMuayeneForTheLastAppointment() {
        String actualTextContent = muayenekayitPage.patientArrivalListDataRow1.getAttribute("textContent");
        String expectedContent = "Kontrol Muayene";
        assertEquals(expectedContent, actualTextContent);
    }

    @When("User fills out {string} placeholder with valid ID Number {string}")
    public void user_fills_out_placeholder_with_valid_ıd_number(String idNumberPlaceHolder, String idNumber) {
        muayenekayitPage.fillOutInfo(idNumberPlaceHolder, idNumber);

    }

    @When("User fill out {string} with a valid date {string}")
    public void user_fill_out_with_a_valid_date(String dateOfBirthPlaceHolder, String dateOfBirth) {
        // Write code here that turns the phrase above into concrete actions
        muayenekayitPage.fillOutInfo(dateOfBirthPlaceHolder, dateOfBirth);
    }

    @When("User taps on the Verification Button")
    public void user_taps_on_the_verification_button() {
        muayenekayitPage.verificationButton.click();
    }


    @When("User should be on the patient appointment registiration page")
    public void userShouldBeOnThePatientAppointmenthastaKayitPage() {
        muayenekayitPage.clickOnTheAppointmentRegistrationButton();
    }

    @Then("ID Number verification page pop-up should be seen and verify ID Number {string}")
    public void ıdNumberVerificationPagePopUpShouldBeSeenAndVerifyIDNumber(String idNumber) {
        Assert.assertTrue(muayenekayitPage.idVericationPopUpMethod().equals(idNumber));
    }


    @And("User clicks on enter button on {string} field")
    public void userClicksOnEnterButtonOnField(String inputFieldName) {

        muayenekayitPage.getWebElementMethod(inputFieldName).sendKeys(Keys.ENTER);

    }

    @Then("Verify that “Geçerli bir kimlik numarası giriniz.” pop up message should be seen")
    public void verifyThatGeçerliBirKimlikNumarasıGirinizPopUpMessageShouldBeSeen() {
        waitForVisibility(muayenekayitPage.wrongIDNumberPopUpMessage, 5);
        Assert.assertTrue(muayenekayitPage.wrongIDNumberPopUpMessage.getText().contains("Geçerli bir kimlik numarası giriniz."));
    }

    @Then("Birth order, birth week and birth day sections should be open")
    public void birthOrderBirthWeekAndBirthDaySectionsShouldBeOpen() {
        Assert.assertTrue(hastaKayitPage.birthWeekInput.isEnabled()&&hastaKayitPage.birthDayInputNewborn.isDisplayed()&&hastaKayitPage.birtOrderInputField.isDisplayed());


    }

    @And("User clicks on the newborn checkbox")
    public void userClicksOnTheNewbornCheckbox() {
        hastaKayitPage.yenidogan.click();

    }

    @When("User clicks on the patient registiration button")
    public void userClicksOnThePatientRegistirationButton() {
        muayenekayitPage.patientRegisterButton.click();
    }

    @Given("the user selects Poliklinik Muayene Kayit")
    public void select_poliklinik_muayene_kayit() {

//        BrowserUtils.sleep(100);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(muayenekayitPage.hastaislemleri));

        muayenekayitPage.hastaislemleri.click();
        muayenekayitPage.AyaktanHastaislemleri.click();
        muayenekayitPage.PoliklinikMuayeneKayit.click();

    }

    String SOYADI ="";
    String ADI ="";

    @Given("Register foreign patient")
    public void register_foreign_patient() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/19yy");

        muayenekayitPage.hastaButton.click();

        Actions actions = new Actions(Driver.getDriver());

        Faker faker = new Faker();

        // hasta kayit icin
        String dogumTarihi = sdf.format(faker.date().birthday());
        SOYADI = faker.name().lastName();
        ADI = faker.name().firstName();

        actions.doubleClick(hastaKayitPage.kurumu).perform();
        hastaKayitPage.digerKurum.click();

        actions.doubleClick(hastaKayitPage.kurumDetay).perform();
        hastaKayitPage.kurumDetayDiger.click();

        hastaKayitPage.dogumTarihi.sendKeys(dogumTarihi);
        hastaKayitPage.soyadi.sendKeys(SOYADI);
        hastaKayitPage.adi.sendKeys(ADI);
        hastaKayitPage.selectCinsiyetList().selectByValue("1");
        hastaKayitPage.selectUyrukList().selectByValue("2");
        hastaKayitPage.HastaTuruButton.click();
        hastaKayitPage.TIKA_Tarafindan_Getirilen_Hastalar.click();
        hastaKayitPage.babaADI.sendKeys(faker.name().firstName());
        hastaKayitPage.anaADI.sendKeys(faker.name().firstName());

        hastaKayitPage.pasaportID.sendKeys(faker.numerify("#####"));

        hastaKayitPage.pasaportNoSeri.sendKeys(faker.letterify("??").toUpperCase());

        hastaKayitPage.pasaportNO.sendKeys(faker.numerify("#####"));

        hastaKayitPage.kaydet.click();

        hastaKayitPage.islemBasariliKapatButton.click();

        hastaKayitPage.kapatButton.click();

//        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOf(muayenekayitPage.poliklinik));
        actions.doubleClick(muayenekayitPage.poliklinik).perform();
        muayenekayitPage.AileHekimligi2Pol.click();
        muayenekayitPage.kaydet.click();
        muayenekayitPage.muayeneKayitTamam.click();
    }

    @Then("the foreign patient is registered")
    public void the_foreign_patient_is_registered() {

        Assert.assertTrue(muayenekayitPage.Kodu.isDisplayed());
    }

    //

    @Given("enter foreign patient number to change patient registry")
    public void enter_foreign_patient_number_to_change_patient_registry() {

        muayenekayitPage.hastaNo.sendKeys(ConfigurationReader.getProperty("TestHastaNo") + Keys.ENTER);
        muayenekayitPage.hastaButton.click();

    }

    String yeniSOYADI = "";
    String yeniADI = "";

    String actualSOYADI = "";
    String actualADI = "";

    @Given("change patient registry")
    public void change_patient_registry() throws InterruptedException {

        actualSOYADI = hastaKayitPage.soyadi.getAttribute("value");
        actualADI = hastaKayitPage.adi.getAttribute("value");

        hastaKayitPage.soyadi.clear();
        hastaKayitPage.adi.clear();

        // enter new input
        yeniSOYADI = ConfigurationReader.getProperty("TestADIDegisiklik");
        yeniADI = ConfigurationReader.getProperty("TestSOYADIDegisiklik");

        hastaKayitPage.soyadi.sendKeys(yeniSOYADI);
        hastaKayitPage.adi.sendKeys(yeniADI);

        hastaKayitPage.kaydet.click();

        hastaKayitPage.islemBasariliKapatButton.click();

        hastaKayitPage.kapatButton.click();

        Thread.sleep(1000);

    }

    @Then("foreign patient record is changed")
    public void foreign_patient_record_is_changed() {

        Assert.assertEquals(yeniADI.toLowerCase(), muayenekayitPage.adi.getAttribute("value").toLowerCase());
        Assert.assertEquals(yeniSOYADI.toLowerCase(), muayenekayitPage.soyadi.getAttribute("value").toLowerCase());

    }

    @Then("registration has been restored")
    public void registration_has_been_restored() {

        muayenekayitPage.hastaButton.click();

        hastaKayitPage.soyadi.clear();
        hastaKayitPage.adi.clear();

        // enter original input
        hastaKayitPage.soyadi.sendKeys(actualSOYADI);
        hastaKayitPage.adi.sendKeys(actualADI);
        hastaKayitPage.kaydet.click();
        hastaKayitPage.islemBasariliKapatButton.click();
        hastaKayitPage.kapatButton.click();
    }


}
    

