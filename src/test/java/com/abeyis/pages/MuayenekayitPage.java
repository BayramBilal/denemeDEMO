package com.abeyis.pages;

import com.abeyis.utilities.BrowserUtils;
import com.abeyis.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.abeyis.utilities.BrowserUtils.waitForClickablility;
import static com.abeyis.utilities.BrowserUtils.waitForVisibility;


public class MuayenekayitPage extends BasePage {

    public MuayenekayitPage() {


        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "pageTitle")
    public WebElement muayenekayit;

    @FindBy(xpath = "//input[@id='POLIKLINIK_KODU']")
    public WebElement Poliklinik;

    @FindBy(id = "TC_KIMLIK_NO")
    public WebElement IdentityNoInput;

    @FindBy(id = "DOGUM_TARIHI_YASI")
    public WebElement DateOfBirthInput;

    @FindBy(xpath = "//a[.=\"Doğrula\"]")
    public WebElement ConfirmButton;

    @FindBy(id = "HASTA_NO")
    public WebElement PatientNoInput;

    @FindBy(id = "SOYADI")
    public WebElement SurnameInput;

    @FindBy(xpath = "//a[.=\"Ara\"]")
    public WebElement SearchButton;

    @FindBy(xpath = "//a[.=\"Hasta\"]")
    public WebElement PatientRegisterButton;

    @FindBy(id = "ADI")
    public WebElement NameInput;

    @FindBy(id = "YASI")
    public WebElement AgeInput;

    @FindBy(id = "BABA_ADI")
    public WebElement FatherNameInput;

    @FindBy(id = "GELIS_TARIHI")
    public WebElement AdmissionDate;

    @FindBy(id = "GELIS_SAATI")
    public WebElement AdmissionTime;

    @FindBy(xpath = "//a[@title=\"Geliş Zamanını Değiştir\"]")
    public WebElement ChangeTimeButton;

    @FindBy(id = "ILK_GELIS_SAYISI")
    public WebElement FirstAdmissionCount;

    @FindBy(id = "HASTA_DR_TERCIHI")
    public WebElement PatientsChoiceOfDoctor;

    @FindBy(id = "POLIKLINIK_KODU")
    public WebElement PolyclinicCodeInput;

    @FindBy(xpath = "//a[@title=\"Poliklinik Değiştir\"]")
    public WebElement ChangePolyclinicButton;

    @FindBy(id = "DOKTOR_KODU")
    public WebElement DoctorCodeInput;

    @FindBy(id = "CAGRI_TIPI")
    public WebElement CallTypeInput;

    @FindBy(id = "INDIRIM_TIPI")
    public WebElement DiscountTypeInput;

    @FindBy(id = "ACIKLAMA")
    public WebElement InformationBox;


    @FindBy(xpath = "//input[@id='SOYADI']")
    public WebElement Soyadi;


    @FindBy(xpath = "//a[@class='open adm']")
    public WebElement username;

    @FindBy(xpath = "//a[@href='/HBYS_WEB_PROEAH/Giris/KullaniciCikis']")
    public WebElement cikis;


    @FindBy(xpath = "//span[.='Uygulamadan çıkış yaptınız, iyi günler.']")
    public WebElement loginPageHYBS;


// Timur

    @FindBy(xpath = "(//a[.=\"Hasta İşlemleri\"])[1]")
    public WebElement patientProcedures;

    @FindBy(xpath = "(//a[.=\"Ayaktan Hasta İşlemleri\"])[1]")
    public WebElement outPatientProcedures;

    @FindBy(xpath = "(//a[.=\"Poliklinik Muayene Kayıt\"])[1]")
    public WebElement polyclinicExamRegistration;

    @FindBy(id = "TC_KIMLIK_NO")
    public WebElement identityNoInput;

    @FindBy(id = "DOGUM_TARIHI_YASI")
    public WebElement dateOfBirthInput;

    @FindBy(xpath = "//a[.=\"Doğrula\"]")
    public WebElement confirmButton;

    @FindBy(id = "HASTA_NO")
    public WebElement patientNoInput;

    @FindBy(id = "SOYADI")
    public WebElement surnameInput;

    @FindBy(xpath = "//a[.=\"Ara\"]")
    public WebElement searchButton;

    @FindBy(xpath = "//a[.=\"Hasta\"]")
    public WebElement patientRegisterButton;

    @FindBy(id = "ADI")
    public WebElement nameInput;

    @FindBy(id = "YASI")
    public WebElement ageInput;

    @FindBy(id = "BABA_ADI")
    public WebElement fatherNameInput;

    @FindBy(id = "GELIS_TARIHI")
    public WebElement admissionDate;

    @FindBy(id = "GELIS_SAATI")
    public WebElement admissionTime;

    @FindBy(xpath = "//a[@title=\"Geliş Zamanını Değiştir\"]")
    public WebElement changeTimeButton;

    @FindBy(id = "ILK_GELIS_SAYISI")
    public WebElement firstAdmissionCount;

    @FindBy(id = "HASTA_DR_TERCIHI")
    public WebElement patientsChoiceOfDoctor;

    @FindBy(id = "POLIKLINIK_KODU")
    public WebElement polyclinicCodeInput;

    @FindBy(xpath = "//a[@title=\"Poliklinik Değiştir\"]")
    public WebElement changePolyclinicButton;

    @FindBy(id = "DOKTOR_KODU")
    public WebElement doctorCodeInput;

    @FindBy(id = "CAGRI_TIPI")
    public WebElement callTypeInput;

    @FindBy(id = "INDIRIM_TIPI")
    public WebElement discountTypeInput;

    @FindBy(id = "ACIKLAMA")
    public WebElement informationBox;

    @FindBy(id = "TELEFON")
    public WebElement telephone;

    @FindBy(id = "E_MAIL")
    public WebElement email;

    @FindBy(id = "ANA_KURUM_KODU")
    public WebElement institutionCode;

    @FindBy(id = "ALT_KURUM_KODU")
    public WebElement institutionDetail;

    @FindBy(id = "TSS_KURUM_ID")
    public WebElement tssInstitutionId;

    @FindBy(id = "TSS_FIYAT_TIPI")
    public WebElement tssPaymentTypeCheckBox;

    @FindBy(id = "ADLI_VAKA")
    public WebElement beneficiaryType;

    @FindBy(id = "GSS_SORGU_TURU")
    public WebElement gssSearchType;

    @FindBy(id = "GELIS_SEKLI_KODU")
    public WebElement arrivalType;


    @FindBy(id = "TXT_HASTA_KAYIT_ANA_KURUM_KODU")
    public WebElement institution;

    @FindBy(id = "TXT_HASTA_KAYIT_ALT_KURUM_KODU")
    public WebElement subInstitution;

    @FindBy(xpath = "//span[.=\"Kaydet(F10)\"]")
    public WebElement saveBtn;

    @FindBy(xpath = "//span[.=\"Ekranı Temizle\"]")
    public WebElement cleanScreenBtn;

    @FindBy(xpath = "//span[.=\"Barkod Bas\"]")
    public WebElement printBarcodeBtn;

    @FindBy(xpath = "//span[@class=\"dropbtn\"]")
    public WebElement patientProcedureBtn;

    @FindBy(id = "DIV_HASTA_KAYIT_DOGUM_SIRASI")
    public WebElement newBornCheckBox;

    @FindBy(id = "CHK_HASTA_KAYIT_MAVIKART")
    public WebElement blueCardCheckBox;

    @FindBy(id = "TXT_HASTA_KAYIT_TC_KIMLIK_NO")
    public WebElement idNoPatientReg;

    @FindBy(id = "TXT_HASTA_KAYIT_DOGUM_TARIHI")
    public WebElement dateOfBirth;

    @FindBy(id = "TXT_HASTA_KAYIT_SOYADI")
    public WebElement patientSurname;

    @FindBy(id = "TXT_HASTA_KAYIT_ADI")
    public WebElement patientName;

    @FindBy(id = "CMB_HASTA_KAYIT_CINSIYET")
    public WebElement genderDropDwn;

    @FindBy(id = "TXT_HASTA_KAYIT_MEDENI_HAL")
    public WebElement maritalStatusBox;

    @FindBy(id = "TXT_HASTA_KAYIT_INDIRIM_TIPI")
    public WebElement dicountType;

    @FindBy(id = "TXT_HASTA_KAYIT_INDIRIM")
    public WebElement discount;

    @FindBy(id = "CMB_HASTA_KAYIT_UYRUK")
    public WebElement patientNationalityDropDwn;

    //    @FindBy (xpath = "//*[@id=\"57941799_50e0_4f00_a24a_0b1f310d6af2\"]/input[3]")
    @FindBy(xpath = "(//input[@value=\"...\"])[4]")
    public WebElement patientTypeDropDwn;

    @FindBy(id = "TXT_HASTA_KAYIT_BABA_ADI")
    public WebElement fatherName;

    @FindBy(id = "TXT_HASTA_KAYIT_ANA_ADI")
    public WebElement motherName;

    @FindBy(id = "TXT_HASTA_KAYIT_ANNE_TC_KIMLIK_NO")
    public WebElement motherIdNo;

    @FindBy(id = "TXT_HASTA_KAYIT_ANNE_DOGUM_TARIHI")
    public WebElement motherDateOfBirth;

    @FindBy(xpath = "//a[.=\"Doğrula-F1\"]")
    public WebElement verifyBtn;

    @FindBy(id = "CMB_HASTA_KAYIT_ANKET_CEVAP_ID")
    public WebElement applicationType;

    @FindBy(id = "TXT_HASTA_KAYIT_TEL")
    public WebElement patientPhoneNo;

    @FindBy(id = "TXT_HASTA_KAYIT_CEP_TEL")
    public WebElement patientCellPhoneNo;

    @FindBy(id = "TXT_HASTA_KAYIT_EMAIL")
    public WebElement patientEmail;

    @FindBy(id = "TXT_HASTA_KAYIT_ADRES_1")
    public WebElement patientAdress1;

    @FindBy(id = "TXT_HASTA_KAYIT_ADRES_2")
    public WebElement patientAdress2;

    @FindBy(xpath = "//span[.=\"Kapat\"]")
    public WebElement closeBtn;

    @FindBy(id = "CHK_HASTA_KAYIT_SMS_GONDERILEBILIR")
    public WebElement smsCheckBox;

    @FindBy(id = "CHK_HASTA_KAYIT_KIMLIK_FOTOKOPISI")
    public WebElement idCopiedCheckBox;

    @FindBy(id = "CHK_HASTA_KAYIT_EMAIL_GONDERILEBILIR")
    public WebElement idSendableCheckBox;

    @FindBy(id = "CHK_HASTA_KAYIT_KVKK_ONAM")
    public WebElement kvkkTakenCheckBox;

    @FindBy(id = "HastaTuruList_DXFREditorcol0_I")
    public WebElement patientTypeCode;

    //    @FindBy (xpath = "//a[.=\"Seç\"]")
    @FindBy(id = "HastaTuruList_DXDataRow0")
    public WebElement patientTypeSelect;

    @FindBy(id = "KurumList_DXFREditorcol1_I")
    public WebElement mainInstitutionCode;

    @FindBy(id = "KurumList_DXDataRow0")
    public WebElement mainInstListSelect;

    @FindBy(id = "KurumList_DXFREditorcol2")
    public WebElement subInstitutionCode;

    @FindBy(xpath = "//a[.=\"Seç\"]")
    public WebElement subInstCodeSelect;
    @FindBy(id = "TXT_HASTA_KAYIT_DOGUM_YERI")
    public WebElement placeOfBirth;
    @FindBy(id = "TXT_HASTA_KAYIT_TAHSIS_NO")
    public WebElement passportId;

    @FindBy(id = "TXT_HASTA_KAYIT_KARNE_SERI")
    public WebElement passportNo;

    @FindBy(xpath = "//p[.='İşlem Başarılı']")
    public WebElement patientRegisterSuccessMessage;

    @FindBy(xpath = "(//span[.='Kapat'])[1]")
    public WebElement patientRegisterCloseTab;

    @FindBy(xpath = "(//span[.=\"Kapat\"])")
    public WebElement patientRegisterClosePage;

    @FindBy(id = "TXT_HASTA_KAYIT_KARNE_NO")
    public WebElement passportSerialNo;

// kamuran

    @FindBy(id = "TC_KIMLIK_NO")
    public WebElement identityNumberInput;


    @FindBy(id = "HASTA_NO")
    public WebElement patientNumInput;

    @FindBy(id = "ADI")
    public WebElement firstNameInput;

    @FindBy(id = "BABA_ADI")
    public WebElement fathersNameInput;

    @FindBy(id = "HASTA_DR_TERCIHI")
    public WebElement patientDrChoosen;

    @FindBy(id = "ADLI_VAKA")
    public WebElement beneficiaryTypeDropdown;

    @FindBy(id = "GELIS_SEKLI_KODU")
    public WebElement arrivalTypeDropdown;

    @FindBy(xpath = "//h2")
    public WebElement successOrFailMessage;

    //    @FindBy(xpath="//*[@id=\"basariliIcerik\"]/div/div[.=\"Bilgiler kaydedildi.\"]")
//    public WebElement successMessage;
    @FindBy(css = ".alertText p")
    public WebElement alertMessage;

    @FindBy(xpath = "//p[.]")
    public WebElement samePolyclinicWarning;

    @FindBy(xpath = "//span[.=\"Tamam\"]")
    public WebElement confirmMessage;

    @FindBy(xpath = "//span[.=\"Kapat\"]")
    public WebElement closePopupWindowButton;

    @FindBy(xpath = "//a[.=\"Kaydet\"]")
    public WebElement saveButton;

    @FindBy(xpath = "//a[.=\"Geliş İptal\"]")
    public WebElement cancelArrivalButton;

    @FindBy(id = "PopupSaveButton_0")
    public WebElement popupSaveButton;

    @FindBy(id = "IPTAL_KODU")
    public WebElement arrivalCancelCode;

    @FindBy(id = "btn2")
    public WebElement getPatientCurrentAppointmentButton;

    @FindBy(id = "btn3")
    public WebElement continuePatientAppointmentButton;

    @FindBy(id = "gelZam")
    public WebElement arrivalDateInputInCalender;
    @FindBy(id = "GELIS_TARIHI")
    public WebElement arrivalDateInput;

    @FindBy(id = "btnGelZamDeg")
    public WebElement changeArrivalDateButton;

    @FindBy(xpath = "//button[.=\"Tamam\"]")
    public WebElement confirmationButtonOfVakaGelisKayitForm;

    @FindBy(id = "hastaGelisListeGrid_DXDataRow1")
    public WebElement patientArrivalListDataRow1;

    @FindBy(id = "hastaGelisListeGrid_DXDataRow0")
    public WebElement patientArrivalListDataRow0;

    @FindBy(xpath = "//a[@title=\"Temizle(F5)\"]")
    public WebElement clearPage;


    @FindBy(xpath = "//a[.='Detaylı Hasta Arama']")
    public WebElement DetayliHastaAra;

    // Ali
    @FindBy(id = "HASTA_NO")
    public WebElement hastaNo;

    @FindBy(id = "SOYADI")
    public WebElement soyadi;

    @FindBy(id = "ADI")
    public WebElement adi;

    @FindBy(xpath = "//a[@title = \"Hasta Kayıt(F6)\"]")
    public WebElement hastaButton;

    @FindBy(id = "POLIKLINIK_KODU")
    public WebElement poliklinik;

    @FindBy(xpath = "//*[@id=\"polkList_tccell8_14\"]/a")
    public WebElement AileHekimligi2Pol;

    @FindBy(xpath = "//a[@title=\"Kaydet(F10)\"]")
    public WebElement kaydet;

    @FindBy(xpath = "//span[.=\"Tamam\"]")
    public WebElement muayeneKayitTamam;

    @FindBy(xpath = "//*[@id=\"hastaTetkikListeGrid_tccell0_1\"]")
    public WebElement Kodu;


    public static void selectPolyclinic(int polyclinicCode) {
        BrowserUtils.doubleClick(Driver.getDriver().findElement(By.xpath("//table[@id=\"polkList_DXMainTable\"]" +
                "//tr//td[.=\"" + polyclinicCode + "\"]")));
    }


    @FindBy(xpath = "//a[@class='btnTcDogrulaPop  text_btn text_btn_ok pBtn']")
    public WebElement verificationButton;

    @FindBy(id = "TXT_TC_DOGRULAMA_TC_KIMLIK_NO")
    public WebElement idVerificationPagePopUpIdNoPlace;

    //by using this method we can locate any webelement which has id tag
    //TC_KIMLIK_NO, DOGUM_TARIHI_YASI, HASTA_NO, SOYADI, ADI, BABA_ADI, ACIKLAMA, PROTOKOL_NO, GELIS_SAYISI, HASTA_TIPI
    //TELEFON, E_MAIL, YASI, GELIS_TARIHI, GELIS_SAATI, ILK_GELIS_SAYISI, HASTA_DR_TERCIHI, POLIKLINIK_ADI, DOKTOR_ADI, CAGRI_TIPI_ADI
    //INDIRIM_TIPI_ACIKLAMA, SOSYAL_GUVENCE, ANA_KURUM_ADI, KURUM_ADI, TSS_FIYAT_TIPI (checkbox),
    public WebElement getWebElementMethod(String inputFieldName) {

        WebElement inputField = Driver.getDriver().findElement(By.id(inputFieldName));
        return inputField;

    }


    public void clickOnTheElement(String inputFieldName) {
        getWebElementMethod(inputFieldName).click();
    }

    public void fillOutInfo(String inputFieldName, String info) {
        waitForClickablility(getWebElementMethod(inputFieldName), 5);
        getWebElementMethod(inputFieldName).click();
        getWebElementMethod(inputFieldName).sendKeys(info);

    }

    public String idVericationPopUpMethod() {
        waitForVisibility(idVerificationPagePopUpIdNoPlace, 5);
        String result = idVerificationPagePopUpIdNoPlace.getAttribute("value");
        return result;
    }

    @FindBy(xpath = "//p[contains(text(),'Geçerli bir kimlik numarası giriniz.')]")
    public WebElement wrongIDNumberPopUpMessage;



}


