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

  Scenario: Ameliyat Randevu Oluşturma-Düzelt

    When The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu
    And Enter service code and selects service
    And Clicks Yeni Randevu button
    And Selects patient using protocol number
    And Enters the Ameliyat-randevu date-time and save
    Then Randevu Verildi text is seen

  Scenario: Ameliyat Randevu Oluşturma-Ertele ve Ertelenen Randevu Listesi

    When The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu
    And Enter service code and selects service
    And Clicks Yeni Randevu button
    And Selects patient using protocol number
    And Enters the Ameliyat-randevu date-time and save
    Then Randevu Verildi text is seen

  Scenario: Ameliyat Randevu Oluşturma-Randevu iptal et ve iptal Edilen Randevuları listele

    When The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu
    And Enter service code and selects service
    And Clicks Yeni Randevu button
    And Selects patient using protocol number
    And Enters the Ameliyat-randevu date-time and save
    Then Randevu Verildi text is seen

  Scenario: Ameliyat Randevu Oluşturma-Randevu Sil

    When The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu
    And Enter service code and selects service
    And Clicks Yeni Randevu button
    And Selects patient using protocol number
    And Enters the Ameliyat-randevu date-time and save
    Then Randevu Verildi text is seen

  Scenario: Ameliyat Randevu Oluşturma-Randevu Raporu ve Yeni Ameliyat

    When The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu
    And Enter service code and selects service
    And Clicks Yeni Randevu button
    And Selects patient using protocol number
    And Enters the Ameliyat-randevu date-time and save
    Then Randevu Verildi text is seen
