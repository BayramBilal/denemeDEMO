Feature: Probel Ameliyathane İşlemleri

  Background:
    Given the user logs in

@ameliyat
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






  Scenario: Ameliyathane İşlemleri Oluşturma

    When the user hover over Ameliyathane İşlemleri and selects Ameliyathane islemleri
    And Approve the selected salon name
    And Patient is sent to the surgery hall
    Then Ameliyathaneye indirildi is visiable




  Scenario: Doktor Ameliyathane İşlemleri

    When the user hover over Ameliyathane İşlemleri and selects Dr_Ameliyathane_islemleri
    And Selects the approved salon and see the patient
    And Select the Seabsı Baslat and click the Ameliyat Başlat
    And Click the Seansı Bitir button and finish the surgery
    Then Send the patient to the service





  Scenario: Ameliyathane Malzeme İşlemleri

    When the user hover over Ameliyathane İşlemleri and selects Ameliyathane Malzeme islemi