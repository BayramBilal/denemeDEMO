package com.abeyis.pages;

import com.abeyis.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.abeyis.utilities.BrowserUtils.*;


public class BasePage {

    public BasePage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[.='Hasta İşlemleri']")
    public WebElement hastaislemleri;

    @FindBy(xpath = "//a[.='Ayaktan Hasta İşlemleri']")
    public WebElement AyaktanHastaislemleri;

    @FindBy(xpath = "//a[.='Poliklinik Muayene Kayıt']")
    public WebElement PoliklinikMuayeneKayit;

    @FindBy(xpath = "//a[@class='home']")
    public WebElement homeButton;

    @FindBy(xpath = "//a[@class='open solutions']")
    public WebElement openSolutionsButton;

    @FindBy(xpath = "//a[@class='open adm']")
    public WebElement userButton;

    //in order to interact with notification bar options, call this method and assign a parameter which is below
    //KONSULTASYON_UYARI, BELGE_UYARI, MESAJ_UYARI, AJANDA_UYARI, CHAT_UYARI, ARIZA_UYARI
    public void clickNotificationButton(String notificationButton){
        WebElement notifyButton = Driver.getDriver().findElement(By.xpath("//div[@class='grup "+ notificationButton+"']"));
        notifyButton.click();
    }

    @FindBy(xpath = "//*[@id=\"menu_durum\"]")
    WebElement menuDurumuButton;
    @FindBy(xpath = "(//*[text()='Hasta İşlemleri'])[1]")
    WebElement hastaIslemleri;

    @FindBy(xpath = "(//*[text()='Ayaktan Hasta İşlemleri'])[1]")
    WebElement ayaktanHasIslemleriButton;

    @FindBy(xpath = "(//*[@href='/HBYS_WEB_PROEAH/POL/POL/POLIKLINIKMUAYENE'])[2]")
    WebElement poliklinikMuayeneKayıtButton;

    Actions actions = new Actions(Driver.getDriver());
    public void clickOnTheAppointmentRegistrationButton(){
        menuDurumuButton.click();
        waitForClickablility(hastaIslemleri, 5);
        hastaIslemleri.click();
        waitForClickablility(ayaktanHasIslemleriButton, 5);
        ayaktanHasIslemleriButton.click();
        actions.pause(2);

        //actions.moveToElement(poliklinikMuayeneKayıtButton).click();

//        actions.pause(2);
        waitForClickablility(poliklinikMuayeneKayıtButton, 5);
        poliklinikMuayeneKayıtButton.click();
    }


}
