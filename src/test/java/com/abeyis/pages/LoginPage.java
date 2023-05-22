package com.abeyis.pages;

import com.abeyis.utilities.ConfigurationReader;
import com.abeyis.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

 public LoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "txtKA")
    public WebElement userCode;

    @FindBy(id = "txtSF")
    public WebElement password;

    @FindBy(id = "txtWSF")
    public WebElement WebPassword;

    @FindBy(id = "CBkurum")
    public WebElement institution;

    @FindBy(id = "btnLogin")
    public WebElement enterance;

    @FindBy(id = "btnKurumBirimDegisimAc")
    public WebElement BilgileriDegistir;

    @FindBy(id = "btnKurumBirimDegistir")
    public WebElement Degistir;

    // Ali
    @FindBy(id = "txtKA")
    public WebElement kullanici_kodu;

   @FindBy(id = "txtSF")
   public WebElement sifre;

   @FindBy(id = "txtWSF")
   public WebElement webSifre;

   @FindBy (id ="btnLogin")
   public WebElement giris;


    @FindBy(xpath = "//a[.='Hasta İşlemleri']")
    public WebElement hastaislemleri;

    @FindBy(xpath = "//a[.='Ayaktan Hasta İşlemleri']")
    public WebElement AyaktanHastaislemleri;

    @FindBy(xpath = "//a[.='Poliklinik Muayene Kayıt']")
    public WebElement PoliklinikMuayeneKayit;

   @FindBy (xpath = "//a[.='Ameliyathane İşlemleri']")
   public WebElement ameliyathaneIslemleri;


    @FindBy (xpath = "//a[.='Ameliyat Randevu']")
    public WebElement ameliyathaneRandevu;

    @FindBy (xpath = "//a[.='Ameliyat Listesi Oluşturma']")
    public WebElement ameliyathaneListesi;

    @FindBy (xpath = "//a[.='Doktor Ameliyathane İşlemleri']")
    public WebElement drAmeliyathaneIslemleri;

    @FindBy (xpath = "//a[.='Ameliyat Malzemeleri İşleme']")
    public WebElement ameliyathaneMalzemeIslem;

    @FindBy (xpath = "//*[@id=\"menuDurumDegis\"]/div[2]/div/ul/li/div/ul/li[2]/div/ul/li[2]/a")
    public WebElement ameliyathaneIslem;



   public void login() {
      kullanici_kodu.sendKeys(ConfigurationReader.getProperty("USER_KODU"));
      sifre.sendKeys(ConfigurationReader.getProperty("SIFRE"));
      webSifre.sendKeys(ConfigurationReader.getProperty("WEB_SIFRE"));
      giris.click();


   }

}
