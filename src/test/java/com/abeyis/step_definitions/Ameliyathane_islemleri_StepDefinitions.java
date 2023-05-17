package com.abeyis.step_definitions;

import com.abeyis.pages.AmeliyathanePage;
import com.abeyis.pages.LoginPage;
import com.abeyis.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ameliyathane_islemleri_StepDefinitions {

    AmeliyathanePage ameliyathanePage = new AmeliyathanePage();
    LoginPage loginPage = new LoginPage();


    @When("The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu")
    public void the_user_hover_over_ameliyathane_işlemleri_and_selects_ameliyat_randevu() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(loginPage.hastaislemleri));
        loginPage.hastaislemleri.click();
        loginPage.ameliyathaneIslemleri.click();
        loginPage.ameliyathaneRandevu.click();


    }
    @When("Enter service code and selects service")
    public void enter_service_code_and_selects_service() {



    }
    @When("Clicks Yeni Randevu button")
    public void clicks_yeni_randevu_button() {




    }
    @When("Selects patient using protocol number")
    public void selects_patient_using_protocol_number() {



    }
    @When("Enters the Ameliyat-randevu date-time and save")
    public void enters_the_ameliyat_randevu_date_time_and_save() {



    }
    @Then("Randevu Verildi text is seen")
    public void randevu_verildi_text_is_seen() {




    }

}
