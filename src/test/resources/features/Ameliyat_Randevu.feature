Feature: Probel Ameliyathane İşlemleri Ravdevu Verme

  Background:
    Given the user logs in

  Scenario: Ameliyat Randevu Oluşturma

    When The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu
    And Enter service code and selects service
    And Clicks Yeni Randevu button
    And Selects patient using protocol number
    And Enters the Ameliyat-randevu date-time and save
    Then Randevu Verildi text is seen

  Scenario: Ameliyat Randevu Oluşturma-Düzelt Veli

    When The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu
    And Enter service code and selects service
    And Clicks Yeni Randevu button
    And Selects patient using protocol number
    And Enters the Ameliyat-randevu date-time and save
    Then Randevu Verildi text is seen

  Scenario: Ameliyat Randevu Oluşturma-Ertele ve Ertelenen Randevu Listesi Timur

    When The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu
    And Enter service code and selects service
    And Clicks Yeni Randevu button
    And Selects patient using protocol number
    And Enters the Ameliyat-randevu date-time and save
    Then Randevu Verildi text is seen

  Scenario: Ameliyat Randevu Oluşturma-Randevu iptal et ve iptal Edilen Randevuları listele Refik

    When The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu
    And Enter service code and selects service
    And Clicks Yeni Randevu button
    And Selects patient using protocol number
    And Enters the Ameliyat-randevu date-time and save
    Then Randevu Verildi text is seen

  Scenario: Ameliyat Randevu Oluşturma-Randevu Sil  Zafer

    When The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu
    And Enter service code and selects service
    And Clicks Yeni Randevu button
    And Selects patient using protocol number
    And Enters the Ameliyat-randevu date-time and save
    Then Randevu Verildi text is seen

  Scenario: Ameliyat Randevu Oluşturma-Randevu Raporu ve Yeni Ameliyat  Bilal

    When The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu
    And Enter service code and selects service
    And Select the patient from list to see the Randevu Raporu
    And Click the Randevu Raporu button from dropdown to access the report
    Then Check the Randevu Raporu is seen and close report
    And Click the Yeni Ameliyat button from dropdown
    Then Check not allowed to enter new patient by using Yeni Ameliyat button
