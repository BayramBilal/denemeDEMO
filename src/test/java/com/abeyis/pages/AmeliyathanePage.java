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





    // Ameliyathane Malzeme İşlemleri - Timur










}
