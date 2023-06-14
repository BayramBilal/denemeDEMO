@ameliyat
Feature: Probel Ameliyathane İşlemleri

  Background:
    Given the user logs in

@smoke
  Scenario: Ameliyat Randevu Oluşturma

    When The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu
    And Enter service code and selects service
    And Clicks Yeni Randevu button
    And Selects patient using protocol number
    And Enters the Ameliyat-randevu date-time and save
    Then Randevu Verildi text is seen


@smoke1 @randevusil
  Scenario: Ameliyat Listesi Oluşturma

    When the user hover over Ameliyathane İşlemleri and selects Ameliyathane Liste
    And Selects date and service information
    And Add Salon from Salon Islemleri
    And Select the patient to be operated
    And Set the operation time
    And Add operation at Hastaya Yapilacak Ameliyatlar
    And Select Surgical Surgery Team at
    And Select the person responsible for the Surgical Surgery Team
    And Select Anesthesia Surgery Team
    And Select the person responsible for the Anesthesia Surgery Team
    And Report operating room by clicking Ameliyathane Bildir
    Then Surgery list is created Ameliyathane Bildir button disappears and a checkmark appears to the right of the salon name


  @smoke1Refik

  Scenario: Ameliyathane İşlemleri Oluşturma
    When the user hover over Ameliyathane İşlemleri and selects Ameliyathane islemleri
    And User selects appointment date
    ##And user selects surgery department in order to approve KBB
    ##And User selects surgery department in order to approve the department "Salon_1"
    And user taps on the Salon Islemleri
    And Approve the selected salon name
    ##And Approve pop-up message
    And User selects patient from protocol number "15175989"
    And Patient is sent to the surgery hall
    And Clicks pop-up message
    Then Ameliyathaneye indirildi is visible


  @smoke3
  Scenario: Ameliyathane Malzeme İşlemleri - Salon onayı sonrası hasta buraya gelir
    When the user hover over Ameliyathane İşlemleri and selects Ameliyathane Malzeme
    And The user Selects date and service information
    And The user clicks one of the patient from the patient raw
    And The user clicks Sablon Uygula Button
    And The user selects one of the option from the Sablon Menu
    And The user selects necessary options from the Ilac Ekle Menu
    And The user clicks Tumunu Sec button from the Malzeme Ekle Menu
    And The user selects Malzeme Isle & Guncelle Button
    And The user selects Evet from the pop Up menu
    ##And The user selects Tamam from the pop Up menu
    And The user selects Ilaclari Isle & Guncelle Button
    And The user selects Evet from the pop Up menu
    And The user selects Tamam from the pop Up menu


  @smoke4
  Scenario: Doktor Ameliyathane İşlemleri - Salon onayı sonrası
    When the user hover over Ameliyathane İşlemleri and selects Dr_Ameliyathane_islemleri
    And Enters the operation date and click Yenile button
    And Selects the approved salon and click sec button
    And Selects the patient and clicks the Seansı Baslat button, see the info of patient as Anestezi Başladı
    And Clicks the Seansı Bitir button and finish the surgery
    Then See the patient as Servise Gönderildi by using POSTOP button


  Scenario: Ameliyat Bilgi Giriş İşlemleri