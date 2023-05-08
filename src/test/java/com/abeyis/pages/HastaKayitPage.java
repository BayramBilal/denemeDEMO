package com.abeyis.pages;

import com.abeyis.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HastaKayitPage extends BasePage {


    Faker faker = new Faker();

    public HastaKayitPage() {


        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(xpath = "//input[@id='POLIKLINIK_KODU']")
    public WebElement Poliklinik;

    @FindBy(xpath = "//a[@title='Hasta Kayıt(F6)']")
    public WebElement HastaKayit;

    @FindBy(id = "TXT_HASTA_KAYIT_ANA_KURUM_KODU")
    public WebElement Kurumu;

    @FindBy(id = "TXT_HASTA_KAYIT_ANA_KURUM_ADI")
    public WebElement KurumAdi;

    @FindBy(id = "TXT_HASTA_KAYIT_ALT_KURUM_KODU")
    public WebElement KurumDetay;

    @FindBy(id = "TXT_HASTA_KAYIT_ALT_KURUM_ADI")
    public WebElement AltKurumAdi;


    @FindBy(id = "TXT_HASTA_KAYIT_TC_KIMLIK_NO")
    public WebElement TCKimlikNo;


    @FindBy(id = "TXT_HASTA_KAYIT_DOGUM_TARIHI")
    public WebElement DogT;

    @FindBy(xpath = "//div[@id='ui-datepicker-div']//button[2]")
    public WebElement DogTKapat;

    @FindBy(id = "TXT_HASTA_KAYIT_SOYADI")
    public WebElement Soyadi;

    @FindBy(id = "TXT_HASTA_KAYIT_ADI")
    public WebElement Adi;

    @FindBy(id = "CMB_HASTA_KAYIT_CINSIYET")
    public WebElement Cinsiyet;

    @FindBy(id = "TXT_HASTA_KAYIT_MEDENI_HAL")
    public WebElement MedeniHal;

    @FindBy(id = "TXT_HASTA_KAYIT_BABA_ADI")
    public WebElement BabaAdi;

    @FindBy(id = "TXT_HASTA_KAYIT_ANA_ADI")
    public WebElement AnaAdi;

    @FindBy(id = "TXT_HASTA_KAYIT_DOGUM_YERI")
    public WebElement DogumYeri;

    @FindBy(id = "TXT_HASTA_KAYIT_CEP_TEL")
    public WebElement CepTelefon;

    @FindBy(id = "TXT_HASTA_KAYIT_EMAIL")
    public WebElement Email;

    @FindBy(id = "TXT_HASTA_KAYIT_ADRES_1")
    public WebElement Adres;

    @FindBy(xpath = "//a[@title='Değerleri temizle']/../input[3]")
    public WebElement HastaTuru;

    @FindBy(xpath = "//table[@id='HastaTuruList_DXMainTable']/tbody//td[.='KİMLİKSİZ HASTA']")
    public WebElement Kimliksiz;

    @FindBy(xpath = "//table[@id='HastaTuruList_DXMainTable']/tbody//td[@id='HastaTuruList_tccell4_2']")
    public WebElement KimliksizSec;

    @FindBy(xpath = "//table[@id='HastaTuruList_DXMainTable']/tbody//td[.='SAĞLIK TURİZMİ']")
    public WebElement SaglıkTurizmi;

    @FindBy(xpath = "//table[@id='HastaTuruList_DXMainTable']/tbody//td[@id='HastaTuruList_tccell5_2']")
    public WebElement SaglıkTurizmSec;


    @FindBy(xpath = "//table[@id='HastaTuruList_DXMainTable']/tbody//td[.='İNSAN TİCARETİ MAĞDURU']")
    public WebElement insanTicaretMagduru;

    @FindBy(xpath = "//table[@id='HastaTuruList_DXMainTable']/tbody//td[@id='HastaTuruList_tccell3_2']")
    public WebElement insanTicaretMagduruSec;


    @FindBy(xpath = "//table[@id='HastaTuruList_DXMainTable']/tbody//td[.='TURİSTİN SAĞLIĞI']")
    public WebElement turist;

    @FindBy(xpath = "//table[@id='HastaTuruList_DXMainTable']/tbody//td[@id='HastaTuruList_tccell9_2']")
    public WebElement turistSec;

    @FindBy(id = "CMB_HASTA_KAYIT_UYRUK")
    public WebElement Uyrugu;


    @FindBy(id = "TXT_HASTA_KAYIT_TAHSIS_NO")
    public WebElement PassportID;

    @FindBy(id = "TXT_HASTA_KAYIT_KARNE_SERI")
    public WebElement PassportNoSeri;

    @FindBy(id = "TXT_HASTA_KAYIT_KARNE_NO")
    public WebElement PassportKarneNo;

    @FindBy(xpath = "//span[@class='warning item']")
    public WebElement AraOdeme;

    @FindBy(xpath = "//a[@id='PopupSaveButton_0']")
    public WebElement KaydetF10;

    @FindBy(xpath = "//span[@class='info item']")
    public WebElement islemBasariliKapat;

    @FindBy(xpath = "//a[@title='Kapat']")
    public WebElement Kapat;

    @FindBy(id = "GELIS_SEKLI_KODU")
    public WebElement GelisSekli;

    @FindBy(xpath = "//a[@title='Kaydet(F10)']")
    public WebElement Kaydet;

    @FindBy(xpath = "//span[.='Tamam']")
    public WebElement MuayeneKayitTamam;


    @FindBy(xpath = "//a[@title='Sil(F8)']")
    public WebElement Sil;

    // Ali
    @FindBy(xpath = "//span[.=\"Kaydet(F10)\"]")
    public WebElement kaydet;

    // Kurumu
    @FindBy(id = "CMB_HASTA_KAYIT_KURUM_ULKE_KODU")
    public WebElement selectKurumUlke;

    public Select selectKurumUlkeList() {
        return new Select(selectKurumUlke);
    }

    @FindBy(id = "TXT_HASTA_KAYIT_ANA_KURUM_KODU")
    public WebElement kurumu;


    @FindBy(xpath = "//*[@id=\"KurumList_tccell0_5\"]/a")
    public WebElement digerKurum;

    // Kurumu = Diger
    @FindBy(id = "TXT_HASTA_KAYIT_ALT_KURUM_KODU")
    public WebElement kurumDetay;

    // Kurum Detay = Diger (Alt Kurum Kodu = 3)
    @FindBy(xpath = "//*[@id=\"KurumList_tccell1_5\"]/a")
    public WebElement kurumDetayDiger;

    @FindBy(id = "CHK_HASTA_KAYIT_YENIDOGAN")
    public WebElement yenidogan;

    @FindBy(id = "TXT_HASTA_KAYIT_DOGUM_TARIHI")
    public WebElement dogumTarihi;

    @FindBy(id = "TXT_HASTA_KAYIT_SOYADI")
    public WebElement soyadi;

    @FindBy(id = "TXT_HASTA_KAYIT_ADI")
    public WebElement adi;

    @FindBy(id = "CMB_HASTA_KAYIT_CINSIYET")
    public WebElement selectCinsiyet;

    public Select selectCinsiyetList() {
        return new Select(selectCinsiyet);
    }

    @FindBy(id = "TXT_HASTA_KAYIT_TAHSIS_NO")
    public WebElement pasaportID;

    @FindBy(id = "TXT_HASTA_KAYIT_KARNE_SERI")
    public WebElement pasaportNoSeri;

    @FindBy(id = "TXT_HASTA_KAYIT_KARNE_NO")
    public WebElement pasaportNO;

    @FindBy(id = "CMB_HASTA_KAYIT_UYRUK")
    public WebElement selectUyruk;

    public Select selectUyrukList() {
        return new Select(selectUyruk);
    }

    @FindBy(xpath = "(//input[@class=\"lookupOpenButton\"])[4]")
    public WebElement HastaTuruButton;

    @FindBy(xpath = "//*[@id=\"HastaTuruList_tccell8_2\"]/a")
    public WebElement TIKA_Tarafindan_Getirilen_Hastalar;

    @FindBy(id = "TXT_HASTA_KAYIT_BABA_ADI")
    public WebElement babaADI;

    @FindBy(id = "TXT_HASTA_KAYIT_ANA_ADI")
    public WebElement anaADI;

    @FindBy(id = "CMB_HASTA_KAYIT_ANKET_CEVAP_ID")
    public WebElement selectBasvuruSekli;

    public Select selectBasvuruSekliList() {
        return new Select(selectBasvuruSekli);
    }

    @FindBy(id = "CMB_HASTA_KAYIT_STATUS")
    public WebElement selectStatu;

    public Select selectStatuList() {
        return new Select(selectStatu);
    }

    @FindBy(id = "CMB_HASTA_KAYIT_OGRENIM")
    public WebElement selectOgrenim;

    public Select selectOgreminList() {
        return new Select(selectOgrenim);
    }

    @FindBy(id = "CMB_HASTA_KAYIT_KAN_GRUBU")
    public WebElement kanGrubuSelect;

    public Select kanGrubuSelectList() {
        return new Select(kanGrubuSelect);
    }

    @FindBy(xpath = "//span[.=\"Kapat\"]")
    public WebElement islemBasariliKapatButton;

    @FindBy(xpath = "//span[.=\"Kapat\"]")
    public WebElement kapatButton;

    @FindBy(id = "TXT_HASTA_KAYIT_DOGUM_SIRASI")
    public WebElement birtOrderInputField;

    @FindBy(id = "TXT_HASTA_KAYIT_BEBEK_DOGUM_HAFTA")
    public WebElement birthWeekInput;

    @FindBy(id = "TXT_HASTA_KAYIT_BEBEK_DOGUM_HAFTA_GUN")
    public WebElement birthDayInputNewborn;

    @FindBy(id = "HastaTuruList_DXFREditorcol0_I")
    public WebElement patientTypeCode;

    //    @FindBy (xpath = "//a[.=\"Seç\"]")
    @FindBy(id = "HastaTuruList_DXDataRow0")
    public WebElement patientTypeSelect;


    @FindBy(xpath = "(//input[@value=\"...\"])[4]")
    public WebElement patientTypeDropDwn;


    public void hastaKayitGiris(String KurumKodu, String KurumDetayKodu) {

        Kurumu.sendKeys(KurumKodu);
        KurumAdi.click();
        KurumDetay.sendKeys(KurumDetayKodu);
        AltKurumAdi.click();
        DogT.sendKeys("10/03/1980");
        DogTKapat.click();
        Soyadi.sendKeys(faker.name().lastName());
        Adi.sendKeys(faker.name().firstName());
        Select select = new Select(Cinsiyet);
        select.selectByVisibleText("KADIN");
        MedeniHal.sendKeys("Bekar");
        BabaAdi.sendKeys(faker.name().firstName());
        AnaAdi.sendKeys(faker.name().firstName());
        DogumYeri.sendKeys("İzmir");
        CepTelefon.sendKeys(faker.numerify("##########"));
        Email.sendKeys("aylaa@gmail.com");
        Adres.sendKeys("İzmir cad. No.3452 Bornova");

    }

    public void pasaportgiris() {

        PassportID.sendKeys(faker.numerify("#####"));
        PassportNoSeri.sendKeys(faker.bothify("###"));
        PassportKarneNo.sendKeys(faker.numerify("######"));
        KaydetF10.click();


    }


}
