package com.abeyis.step_definitions;

import com.abeyis.pages.HastaKayitPage;
import com.abeyis.pages.MuayenekayitPage;
import com.abeyis.utilities.BrowserUtils;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.Select;

public class US03_HastaKayit_StepDefinitions {

    MuayenekayitPage muayenekayitPage = new MuayenekayitPage();
    HastaKayitPage hastaKayitPage = new HastaKayitPage();

    Faker faker = new Faker();


    @And("User enters the patient information")
    public void userEntersThePatientInformationWithoutIDCardAndIDNumber() {

        hastaKayitPage.hastaKayitGiris("999","0");

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
}