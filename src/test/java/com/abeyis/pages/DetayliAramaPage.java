package com.abeyis.pages;

import com.abeyis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetayliAramaPage extends BasePage{

    public DetayliAramaPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@data-col-name='TC_KIMLIK_NO']")
    public WebElement TCKimlikNo;

    @FindBy(xpath = "//input[@data-col-name='PROTOKOL_NO']")
    public WebElement ProtokolNo;

    @FindBy(xpath = "//input[@data-col-name='HASTA_NO']")
    public WebElement HastaNo;

    @FindBy(xpath = "//a[@onclick='DetayliSorgula();']")
    public WebElement Sorgula;

    @FindBy(xpath = "//a[.='Seç']")
    public WebElement Sec;

    @FindBy(xpath = "//label[@for='AYNI_GUN_KONTROL']")
    public WebElement sadeceBugunGelis;

    @FindBy(xpath = "//*[@id=\"pmdForm\"]/div[1]/div/div[2]/a")
    public WebElement dogrulaButton;

    @FindBy(xpath = "//*[@id=\"TXT_TC_DOGRULAMA_OLUM_TARIHI\"]")
    public WebElement olumTarihi;

    @FindBy(xpath = "/html/body/div[10]/div[2]/div[2]/div/div/div[2]/div/div[13]/div/div/div[2]/input")
    public WebElement solGelisTarihi;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[2]/a")
    public WebElement solIkiMayis;

    @FindBy(xpath = "//*[@id=\"GELIS_TARIHI_2\"]")
    public WebElement sagGelisTarihi;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[2]/a")
    public WebElement sagIkiMayis;
}