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

    @FindBy(xpath = "//*[@id=\"TXT_TARIH\"]")
    public WebElement RandevuTarihi1;

    @FindBy(xpath = "//*[@id=\"BIRIM_KODU_ANA\"]")
    public WebElement AmeliyatBirimKodu;

    @FindBy(xpath = "//*[@id=\"AmeliyatBirimListe_DXFREditorcol1_I\"]")
    public WebElement AmeliyatBirimListe;

    @FindBy(xpath = "//*[@id=\"AmeliyatBirimListe_tccell0_2\"]/a")
    public WebElement KbbServisiSec;

    @FindBy(xpath = "//*[@id=\"divAmeliyatRandevu\"]/div[1]/a[2]")
    public WebElement YeniRandevuButton;

    @FindBy(xpath = "//*[@id=\"RANDEVU_TARIHI\"]")
    public WebElement RandevuTarihi2;

    @FindBy(xpath = "//*[@id=\"divRndDetay\"]/div[2]/div/div[18]/a")
    public WebElement RandevuSaatiListe;

    @FindBy(xpath = "//*[@id=\"aRandevuSaat\"]/div[2]/div[2]/div/a[7]")
    public WebElement RandevuSaatiOn;

    @FindBy(xpath = "//*[@id=\"PROTOKOL_NO_RND\"]")
    public WebElement ProtokolNoRandevu;

    @FindBy(xpath = "//*[@id=\"TETKIK_ADI\"]")
    public WebElement AmeliyatAdiListe;

    @FindBy(xpath = "//*[@id=\"AmeliyatListe_tccell7_2\"]/a")
    public WebElement AmeliyatAbdominoplasti;

    @FindBy(xpath = "//*[@id=\"PopupSaveButton_0\"]")
    public WebElement AmeliyatRandevuKaydetButton;

    @FindBy(xpath = "//*[@id=\"Ameliyat_Randevu_Liste_Paging_DXDataRow0\"]/td[2]")
    public WebElement RandevuVerildiText;

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



    // Ameliyathane İşlemleri Oluşturma - Refik




    // Doktor Ameliyathane İşlemleri - Bilal

    @FindBy(xpath = "//tbody//td[@id='dxGridAmeliyatHastaListesi_tccell0_2']")
    public WebElement HastaSatirNo1;

    @FindBy(xpath = "//a[.='Ameliyat Ekle']")
    public WebElement AmeliyatEkle;

    @FindBy(id = "AmeliyatKod_TETKIK_ADI")
    public WebElement YapilacakAmeliyat;

    @FindBy(id = "OrganYon")
    public WebElement AmeliyatYon;

    @FindBy(id = "KesiCombo")
    public WebElement KesBilgisi;

    @FindBy(xpath = "//a[.='Kaydet']")
    public WebElement Kaydet;

    @FindBy(xpath = "//span[.='Kapat']")
    public WebElement Kapat;

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










}
