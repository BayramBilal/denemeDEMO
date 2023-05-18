@ameliyat
Feature: Probel Ameliyathane İşlemleri

  Background:
    Given the user logs in


  Scenario: Ameliyat Randevu Oluşturma
    When The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu
    And Enter service code and selects service
    And Clicks Yeni Randevu button
    And Selects patient using protocol number
    And Enters the Ameliyat-randevu date-time and save
    Then Randevu Verildi text is seen




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






  Scenario: Ameliyathane İşlemleri Oluşturma
    When the user hover over Ameliyathane İşlemleri and selects Ameliyathane islemleri
    And Approve the selected salon name
    And Patient is sent to the surgery hall
    Then Ameliyathaneye indirildi is visiable




  Scenario: Doktor Ameliyathane İşlemleri (Salon onayı sonrası)
    When the user hover over Ameliyathane İşlemleri and selects Dr_Ameliyathane_islemleri
    And Selects the approved salon and see the patient
    And Click the Seansı Baslat button and see the info of patient as Anestezi Başladı
    And Click the Saatler button, enter the time and see the info of patient as Salona Giriş Yaptı
    And Click the Seansı Bitir button and finish the surgery
    Then Send the patient to the service using POSTOP button





  Scenario: Ameliyathane Malzeme İşlemleri (Salon onayı sonrası hasta buraya gelir)
    When the user hover over Ameliyathane İşlemleri and selects Ameliyathane Malzeme






  Scenario: Ameliyat Bilgi Giriş İşlemleri