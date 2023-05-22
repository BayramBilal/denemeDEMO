package com.abeyis.pages;

import com.abeyis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmeliyathanePage {

    public AmeliyathanePage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    // Ameliyat Randevu Oluşturma - Veli

    @FindBy(xpath = "//*[@id=\"BIRIM_KODU_ANA\"]")
    public WebElement AmeliyatBirimKodu;
    @FindBy(xpath = "//*[@id=\"divAmeliyatRandevu\"]/div[1]/a[2]")
    public WebElement YeniRandevuButton;
    @FindBy(xpath = "//a[@onclick='fSaatler()']")
    public WebElement saatSec;
    @FindBy(xpath = "//a[@data-saat='11 : 00']")
    public WebElement saatOnBir;
    @FindBy(xpath = "//*[@id=\"PROTOKOL_NO_RND\"]")
    public WebElement ProtokolNoRandevu;
    @FindBy(xpath = "/html/body/div[7]/div[2]/div[2]/div/div[2]/div/div[8]/div/input[3]")
    public WebElement ameliyatAdiListe;
    @FindBy(xpath = "//a[@data-lookupvalue='603500']")
    public WebElement abdominoplastiSec;
    @FindBy(id = "RANDEVU_TARIHI")
    public WebElement randevuTarihi2;
    @FindBy(xpath = "//select[@data-handler='selectMonth']")
    public WebElement selectMonth;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div/select[1]/option[6]")
    public WebElement optionHaziran;
    @FindBy(xpath = "/html/body/div[6]/table/tbody/tr[1]/td[4]/a")
    public WebElement haziranBir;
    @FindBy(id = "PopupSaveButton_0")
    public WebElement ameliyatRandevuKaydetButton;
    @FindBy(xpath = "//*[@id='TXT_TARIH']")
    public WebElement inputTarihAna;
    @FindBy(xpath = "//select[@data-handler='selectMonth']")
    public WebElement selectMonthAna;
    @FindBy(xpath = "//option[@value='5']")
    public WebElement optionHaziranAna;
    @FindBy(xpath = "/html/body/div[6]/table/tbody/tr[1]/td[4]/a")
    public WebElement haziranBirAna;
    @FindBy(xpath = "//td[contains(@style, 'hite')]")
    public WebElement randevuVerildiText;
    @FindBy(xpath = "//*[@id=\"divAmeliyatRandevu\"]/div[1]/div[6]/div/a")
    public WebElement AmeliyatIslemlerCarki;
    @FindBy(xpath = "//*[@id=\"divAmeliyatRandevu\"]/div[1]/div[6]/div/ul/li[1]/a")
    public WebElement AmeliyatBirimTanimlari;
    @FindBy(xpath = "//*[@id=\"Ameliyat_Birim_Tanim_Liste_DXFREditorcol0_I\"]")
    public WebElement AmeliyatBirimTanimlariBirimAlani;
    @FindBy(xpath = "//*[@id=\"Ameliyat_Birim_Tanim_Liste_tccell0_4\"]/a[1]")
    public WebElement AmeliyatBirimTanimlariBirimDuzenle;
    @FindBy(xpath = "//*[@id=\"GUNLUK_MAKS_KAYIT\"]")
    public WebElement AmeliyatBirimTanimlariGunlukMax;
    @FindBy(xpath = "//*[@id='btnTanimiKaydet']")
    public WebElement AmeliyatBirimTanimlariKaydet;
    @FindBy(xpath = "//*[@id=\"1684305088\"]/div[2]/div[1]/a")
    public WebElement AmeliyatBirimTanimlariKapat;



    // Ameliyat Listesi Oluşturma - Ali (Zafer)

    @FindBy(id = "AMELIYAT_LST_TARIH")
    public WebElement AmeliyatTarih;
    @FindBy(id = "lstServis-SERVIS_KODU")
    public WebElement ServisKodu;
    @FindBy(id = "lstServis_DXFREditorcol1_I")
    public WebElement ServisKodu2;
    @FindBy(xpath= "//tbody//td[@id='lstServis_tccell0_2']")
    public WebElement ServisKodu2Sec;
    @FindBy(xpath= "//span[.='Kapat']")
    public WebElement ServisKodu2SecKapat;
    @FindBy(xpath= "//*[@class='dropdown no-margin']") //a[@class='text_btn text_btn_islem backWhite']
    public WebElement Salonİslemleri;
    @FindBy(xpath= "//a[.='Salon Ekle']")//a[@onclick='lstBtnSalonEkle(this)']
    public WebElement SalonEkle;
    @FindBy(xpath= "//a[.='Seç']")//tbody//td[@id='lstSalonMasaListesi_tccell0_4']  (//*[contains(text(),'Seç')])[9]
    public WebElement SalonEkledenSec;
    @FindBy(xpath= "//tbody//tr[@id='dxGridHastaListe_DXDataRow0']")
    public WebElement Hastasec;
    @FindBy(id = "HastaAmlSaat_501071678_849_I")
    public WebElement AmeliyatSaat;
    @FindBy(xpath = "//a[.='Ameliyat Ekle']")
    public WebElement AmeliyatEkle;
    @FindBy(xpath = "(//*[@class='inpt  lookupOpenButton'])[8]")
    public WebElement YapilacakAmeliyat;
    @FindBy(xpath= "(//*[@class='LookupSelectButton text_btn text_btn_ok backWhite'])[1]")
    public WebElement YapilacakAmeliyatSec;
    @FindBy(id = "OrganYon")
    public WebElement AmeliyatYon;
    @FindBy(id = "KesiCombo")
    public WebElement KesBilgisi;
    @FindBy(xpath = "(//*[@class='inpt  lookupOpenButton'])[9]")
    public WebElement DoktorSecUcNokta;
    @FindBy(xpath = "//tbody//td[@id='sevkEdenDoktorList_tccell0_2']")
    public WebElement DoktorSec;
    @FindBy(xpath = "//a[.='Kaydet']")
    public WebElement Kaydet;
    @FindBy(xpath = "//span[.='Kapat']")
    public WebElement Kapat;
    @FindBy(xpath = "//tbody//td[@id='dxGridAmeliyatEkibi_tcheader3']")//(//*[@class=text_btn backWhite])[1]
    public WebElement AmeliyatEkibiEkle;
    @FindBy(xpath = "//tbody//td[@id='AmeliyatDoktorListe_tccell0_2']") //*[@id=AmeliyatDoktorListe_tccell0_2]
    public WebElement AmeliyatDoktorListe1;
    @FindBy(xpath = "//tbody//td[@id='AmeliyatDoktorListe_tccell1_2']")  //*[@id=AmeliyatDoktorListe_tccell1_2]
    public WebElement AmeliyatDoktorListe2;
    @FindBy(xpath = "//tbody//td[@id='AmeliyatDoktorListe_tcheader2']")
    public WebElement AmeliyatDoktorListeSecKapat;
    @FindBy(xpath = "//tbody//td[@id='dxGridAmeliyatEkibi_tccell0_2']")//tbody//td//input[@id='cbEkipSorumlu_682']
    public WebElement AmeliyatDoktorSorumluSec;
    @FindBy(xpath = "//tbody//td[@id='dxGridAmeliyatEkibiAnestezi_tcheader3']")
    public WebElement AnestesiAmeliyatEkibiEkle;
    @FindBy(xpath = "//tbody//td[@id='AmeliyatDoktorListe_tccell0_2']")
    public WebElement AnestesiAmeliyatEkibiListe1;
    @FindBy(xpath = "//tbody//td[@id='AmeliyatDoktorListe_tccell1_2']")
    public WebElement AnestesiAmeliyatEkibiListe2;
    @FindBy(xpath = "//tbody//td[@id='dxGridAmeliyatEkibiAnestezi_tccell0_2']")//(//tbody//td[@class='dxgv dx-ac'])[4]
    public WebElement AnestesiDoktorSorumluSec;
    @FindBy(xpath = "//*[contains(text(),'Ameliyathane Bildir')]")
    public WebElement AmeliyathaneBildir;

    // Ameliyathane İşlemleri Oluşturma - Refik




    // Doktor Ameliyathane İşlemleri - Bilal

    @FindBy(xpath = "//tbody//td[@id='dxGridAmeliyatHastaListesi_tccell0_2']")
    public WebElement HastaSatirNo1;



    @FindBy(xpath = "//a[.='Seans Başlat']")
    public WebElement SeansBaslat;

    @FindBy(xpath = "//a[.='Seans Bitir']")
    public WebElement SeansBitir;

    @FindBy(xpath = "//a[@onclick='funcSeansBaslat(this)']")
    public WebElement linkSeansBasLat;

    @FindBy(xpath = "//a[@onclick='funcSeansBaslat(this)']")
    public WebElement linkSeansIptal;

    @FindBy(xpath = "//label[@for='cbHastaMd_837']")
    public WebElement labelCheckMarginIlksatir;

    @FindBy(xpath = "//a[@onclick=\\\"funcAnesteziBaslatBitir('4')\\\"]")
    public WebElement linkAnesteziBasLat;

    @FindBy(xpath = "//a[@onclick=\\\"funcAnesteziBaslatBitir('8')\\\"]")
    public WebElement linkAnesteziBitir;

 




    // Ameliyathane Malzeme İşlemleri - Timur

    @FindBy(xpath = "//a[@onclick='funcSablonUygula(this)']")
    public WebElement linkAblonUygula;
    @FindBy(xpath = "//a[@onclick='func_Malzemeleri_isle(this)']")
    public WebElement linkNcelle;
    @FindBy(xpath = "//a[@onclick='func_ilaclari_isle(this)']")
    public WebElement linkLarNcelle;
    @FindBy(xpath = "//a[@onclick='SablonTanimlamaAc()']")
    public WebElement linkAblonTanMlamalar;
    @FindBy(xpath = "/html/body/div[1]/div[4]/section/div[4]/div[2]/div[2]/div[2]/table/tbody/tr/td/div[2]/table/tbody/tr[2]/td[2]")
    public WebElement tdCenter;
    @FindBy(xpath = "//a[@data-lookupvalue='5']")
    public WebElement linkVerify;
    @FindBy(xpath = "//a[@data-lookupvalue='3']")
    public WebElement linkVerify2;
    @FindBy(xpath = "//a[@data-lookupvalue='1']")
    public WebElement linkVerify3;
    @FindBy(xpath = "//a[@data-lookupvalue='11']")
    public WebElement linkVerify4;
    @FindBy(xpath = "//label[@for='chk_tumunuSec']")
    public WebElement labelCheckMargin;
    @FindBy(xpath = "//label[@for='cbIlacStokOnay_1933']")
    public WebElement labelCheckMargin2;
    @FindBy(xpath = "//label[@for='cbIlacStokOnay_1934']")
    public WebElement labelCheckMargin4;
    @FindBy(xpath = "//label[@for='cbIlacStokOnay_1935']")
    public WebElement labelCheckMargin3;
    @FindBy(xpath = "//label[@for='cbIlacStokOnay_1941']")
    public WebElement labelCheckMargin8;
    @FindBy(xpath = "//label[@for='cbIlacStokOnay_1942']")
    public WebElement labelCheckMargin5;
    @FindBy(xpath = "//label[@for='cbIlacStokOnay_1943']")
    public WebElement labelCheckMargin6;
    @FindBy(xpath = "//span[@class='yes item']")
    public WebElement spanEvet;
    @FindBy(xpath = "//span[@class='warning item']")
    public WebElement spanTamam;
    @FindBy(xpath = "//span[@class='yes item']")
    public WebElement spanEvet2;
    @FindBy(xpath = "//span[@class='warning item']")
    public WebElement spanTamam2;








}
