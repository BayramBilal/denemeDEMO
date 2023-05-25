package com.abeyis.pages;

import com.abeyis.utilities.BrowserUtils;
import com.abeyis.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmeliyathanePage {

    public AmeliyathanePage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }


    // Ameliyat Randevu Oluşturma - Veli


    @FindBy(id = "RANDEVU_TARIHI")
    public WebElement tarihRandevu;

    @FindBy(id = "TXT_TARIH")
    public WebElement RandevuTarihSon;

    @FindBy(id = "btnAmeliyatRandevuListele")
    public WebElement RandevuTarihYenile;



    @FindBy(xpath = "//*[@id=\"Ameliyat_Randevu_Liste_Paging_DXDataRow0\"]/td[2]")
    public WebElement randevuTeyit;
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
    @FindBy(xpath= "//*[@class='amlButton font14 selected']")
    public WebElement Kbb;
    @FindBy(xpath= "//a[.='Salonu İptal Et']")//a[@onclick='lstBtnSalonEkle(this)']
    public WebElement SalonIptal;
    @FindBy(xpath= "//span[.='Evet']")//tbody//td[@id='lstSalonMasaListesi_tccell0_4']  (//*[contains(text(),'Seç')])[9]
    public WebElement Evet;
    @FindBy(xpath= "//tbody//tr[@id='dxGridHastaListe_DXDataRow0']")
    public WebElement Hastasec;
    @FindBy(xpath ="//tbody//td[@id='dxGridAmeliyatHastaListesi_tccell0_7']" ) // "HastaAmlSaat_501071678_849_I"
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
    @FindBy(xpath = "//a[.='İşlemler']")
    public WebElement İslemler;
    @FindBy(xpath = "//a[@id='btnAmeliyathaneBildir']")
    public WebElement AmeliyathaneBildir;
    @FindBy(xpath = "//*[@class='hem_right hem_okey']")
    public WebElement TıkButonu;

    // Ameliyathane İşlemleri Oluşturma - Refik

    //menü butonu
    @FindBy(xpath = "//*[@id=\"menu_durum\"]")
    public WebElement menüButonu;


    @FindBy(xpath = "//a[@class='text_btn text_btn_islem backWhite']")
    public WebElement salonIslemleri;

    Actions actions = new Actions(Driver.getDriver());

    public void salonIslemleriOnayi(){
        actions.moveToElement(salonIslemleri).perform();
    }

    public void salonOnayla(){
        BrowserUtils.waitFor(2);
        actions.moveToElement(salonOnayla).perform();
        salonOnayla.click();

        Driver.getDriver().findElement(By.xpath("//*[@id=\"onayIcerik\"]/div/div[3]/span[1]")).click();
    }

    @FindBy(xpath = "//tr[@data-servis-adi=\"BEYİN CERRAHİ SERVİSİ\"]")
    public WebElement beyinCerrahiMasasi;

    @FindBy(xpath = "//tr[@data-servis-adi=\"KBB SERVİSİ\"]")
    public WebElement KBBMasasi;

    @FindBy(xpath = "//a[@onclick='fncSalonOnay(this, false)']")
    public WebElement salonOnayla;

    @FindBy(xpath = "//a[@onclick='fncOnayIptal(this, false)']")
    public WebElement salonIptal;

    @FindBy(xpath = "/html/body/div[1]/div[4]/section/div[4]/div[2]/div[2]/div[6]/a[1]")
    public WebElement ameliyathaneGirisOnayı;

    @FindBy(xpath = "//*[@id=\"dxGridAmeliyatHastaListesi_tccell0_9\"]/div")
    public WebElement hastaDurumuAcıklaması;

    @FindBy (xpath = "//td[.='501071683']")
    public WebElement selectedPatient;

//    @FindBy (xpath = "//*[@id=\"onayIcerik\"]/div/div[3]/span[1]")
    @FindBy (xpath = "//span[.='Evet']")

    public WebElement popUpMessage;

    @FindBy(css = "a[class*='bildir']")
    public WebElement linkHastaGiriYap;



    public void refreshMethod(){
        BrowserUtils.waitForClickablility(Yenile,5);
        Yenile.click();
    }


    public void getSalonMethod(){
        BrowserUtils.waitFor(3);
        WebElement salon = Driver.getDriver().findElement(By.xpath("//td[.='KBB']"));
        actions.moveToElement(salon);
        BrowserUtils.waitForClickablility(salon,5);
        salon.click();
        BrowserUtils.waitFor(3);


    }
    @FindBy(xpath = "//*[@id=\"onayIcerik\"]/div/div[3]/span[1]")
    public WebElement approveMessage;

    public void approveMessage(){
        // BrowserUtils.waitForClickablility(approveMessage,5);
        approveMessage.click();
    }

    // Doktor Ameliyathane İşlemleri - Bilal

    @FindBy(xpath = "//tbody//td[@id='dxGridAmeliyatHastaListesi_tccell0_2']")
    public WebElement HastaSatirNo1;

    @FindBy(xpath = "//span[.='Kapat']")
    public WebElement KayitKapat;

    @FindBy(id = "salonAc")
    public WebElement SalonAc;

    @FindBy(xpath = "//tbody//tr[@id='MEVCUT_SALON_LISTESI_DXDataRow1']")
    public WebElement SalonKBB;

//    @FindBy(xpath = "//input[@id='MEVCUT_SALON_LISTESI_DXFREditorcol0_I']")
    @FindBy(xpath = "//input[@name='MEVCUT_SALON_LISTESI$DXFREditorcol0']")
    public WebElement Masa;

    @FindBy(id = "MEVCUT_SALON_LISTESI_DXFREditorcol4_I")
    public WebElement salonServisKodu;

      @FindBy(xpath = "//a[.='Seç']")
//    @FindBy(id = "MEVCUT_SALON_LISTESI_tccell0_5")
    public WebElement SalonSec;


//    @FindBy(id = "dxGridAmeliyatHastaListesi_tccell0_3")
//    @FindBy(xpath = "//label[@for='cbHastaMd_948']")
//    @FindBy(xpath = "//tbody//tr[@id='dxGridAmeliyatHastaListesi_DXDataRow0']")

    @FindBy(xpath = "//tbody//td[@id='dxGridAmeliyatHastaListesi_tccell0_3']")
    public WebElement HastaSecin;

    @FindBy(id = "btnLstYenile")
    public WebElement Yenile;

    @FindBy(xpath = "//button[.='Hasta Servise Döndü']")
    public WebElement HastaServise;

    @FindBy(xpath = "//span[.='Evet']")
    public WebElement HastaServiseOnay;

    @FindBy(xpath = "//a[.='Seans Başlat']")
    public WebElement SeansBaslat;

    @FindBy(xpath = "//span[.='Evet']")
    public WebElement SeansBaslatOnay;

    @FindBy(xpath = "//span[.='Hayır']")
    public WebElement SeansBaslatIptal;

    @FindBy(xpath = "//a[.='Seans Bitir']")
    public WebElement SeansBitir;

    @FindBy(xpath = "//span[.='Evet']")
    public WebElement SeansBitirOnay;
    @FindBy(xpath = "//span[.='Kapat']")
    public WebElement uyariKapat;


    @FindBy(xpath = "//span[.='Hayır']")
    public WebElement SeansBitirIptal;

    @FindBy(xpath = "//a[@onclick='funcPostopGoster(this)']")
    public WebElement Postop;

    @FindBy(id = "POSTOP_TARIH")
    public WebElement PostopTarih;

    @FindBy(xpath = "/html/body/div[8]/div[2]/div[2]/div/div[1]/a")
    public WebElement PostopYenile;

    @FindBy(xpath = "//div[.='Servise Gönderildi']")
    public WebElement PostopMessage;

    @FindBy(xpath = "//span[.='Kapat']")
    public WebElement PostopKapat;



    // Ameliyathane Malzeme İşlemleri - Timur

    @FindBy(xpath = "//a[.='Malzeme / İlaç']")
    public WebElement malzemeIlac;

    @FindBy(id = "AMELIYAT_SALON_LISTESI_DXFREditorcol0_I")
    public WebElement malzemeKBB;

    @FindBy(xpath = "//a[@onclick='funcSablonUygula(this)']")
    public WebElement sablonUygula;
    @FindBy(xpath = "//a[@onclick='func_Malzemeleri_isle(this)']")
    public WebElement malzemeIsleGuncelle;
    @FindBy(xpath = "//a[@onclick='func_ilaclari_isle(this)']")
    public WebElement ilacIsleGuncelle;
    @FindBy(xpath = "//a[@onclick='SablonTanimlamaAc()']")
    public WebElement sablonTanimlama;
    @FindBy(id = "dxGridAmeliyatHastaListesi_DXDataRow0")
    public WebElement ameliyatHastaSec1;
    @FindBy(xpath = "//a[@data-lookupvalue='5']")
    public WebElement sablon1Sec;
    @FindBy(xpath = "//a[@data-lookupvalue='3']")
    public WebElement linkVerify2;
    @FindBy(xpath = "//a[@data-lookupvalue='1']")
    public WebElement linkVerify3;
    @FindBy(xpath = "//a[@data-lookupvalue='11']")
    public WebElement linkVerify4;
    @FindBy(xpath = "//label[@for='chk_tumunuSec']")
    public WebElement sablonTumunuSec;
    @FindBy(id = "dxGridAmeliyatMalzemeListesi_tccell0_4")
    public WebElement malzemeOnay1;
    @FindBy(id = "dxGridAmeliyatMalzemeListesi_tccell1_4")
    public WebElement malzemeOnay2;
    @FindBy(xpath = "//label[@for='cbStokOnay_1988']")
    public WebElement malzemeOnay3;
    @FindBy(xpath = "//label[@for='cbStokOnay_1989']")
    public WebElement malzemeOnay4;
//    @FindBy(xpath = "//label[@for='cbIlacStokOnay_1991']")
//    @FindBy(id = "cbIlacStokOnay_2143")
    @FindBy(id = "dxGridAmeliyatIlacListesi_tccell0_4")
    public WebElement ilacOnay1;

//    @FindBy(xpath = "//label[@for='cbIlacStokOnay_1992']")
    @FindBy(id = "dxGridAmeliyatIlacListesi_tccell1_4")
    public WebElement ilacOnay2;

    @FindBy(xpath = "//label[@for='cbIlacStokOnay_1993']")
    public WebElement labelCheckMargin3;
    @FindBy(xpath = "//label[@for='cbIlacStokOnay_1941']")
    public WebElement labelCheckMargin8;
    @FindBy(xpath = "//label[@for='cbIlacStokOnay_1942']")
    public WebElement labelCheckMargin5;
    @FindBy(xpath = "//label[@for='cbIlacStokOnay_1943']")
    public WebElement labelCheckMargin6;
    @FindBy(xpath = "//span[.='Evet']")
    public WebElement malzemeIsleOnayTamam;
    @FindBy(xpath = "//span[@class='warning item']")
    public WebElement malzemeIsleUyariOnayTamam;
    @FindBy(xpath = "//span[@class='yes item']")
    public WebElement spanEvet2;
    @FindBy(xpath = "//span[@class='warning item']")
    public WebElement spanTamam2;





}
