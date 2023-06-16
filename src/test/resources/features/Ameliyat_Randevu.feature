@regression
Feature: Probel Ameliyathane İşlemleri Ravdevu Verme

  Background:
    Given the user logs in



  Scenario: Ameliyat Randevu Oluşturma

    When The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu
    And Enter "2055" and selects service
    And Clicks Yeni Randevu button
    And Selects patient using "15256235"
    And Enters the Ameliyat-randevu "617341", "12.06.2023", "15", "45"
    Then Check the Randevu Verildi text is seen on "12.06.2023"

  @reg1
#    Göz Cerrahisi
  Scenario: Ameliyat Randevu Oluşturma-Düzelt Veli

    When The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu
    And Enter "2055" and selects service
    And Clicks Yeni Randevu button
    And Selects patient using "15256235"
    And Enters the Ameliyat-randevu "617341", "12.06.2023", "15", "45"
    And Check the Randevu Verildi text is seen on "12.06.2023"
    And Click randevu düzenleme button and select randevu düzelt option
    And Enters the Ameliyat-randevu "617010", "19.06.2023", "09", "00"
    Then Check the Randevu Verildi text is seen on "19.06.2023"


  @reg2
    #    KBB Cerrahisi
  Scenario: Ameliyat Randevu Oluşturma-Ertele ve Ertelenen Randevu Listesi Timur

    When The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu
    And Enter "1024" and selects service
    And Clicks Yeni Randevu button
    And Selects patient using "15242294"
    And Enters the Ameliyat-randevu "618030", "13.06.2023", "15", "45"
    And Check the Randevu Verildi text is seen on "13.06.2023"
    And Clicks ameliyatErteleRandevuDropDown
    And Selects ameliyatErteleBtn
    And Enters ameliyatErteleTarihi "14.06.2023" and ameliyatErteleNedeni "Zaman Yetmedi"
    And Clicks randevuErteleKaydet button
    And Clicks randevuErtelemeKapat button
    And Clicks ameliyatErteleRandevuDropDown
    And Selects Ertelenen Randevu Listesi
    Then Clicks randevuErtelemeListesiKapat button



  @reg3
    #    Genel Cerrahi
  Scenario: Ameliyat Randevu Oluşturma-Randevu iptal et ve iptal Edilen Randevuları listele Refik

    When The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu
    And Enter "1016" and selects service
    And Clicks Yeni Randevu button
    And Selects patient using "15387631"
    And Enters the Ameliyat-randevu "550981", "14.06.2023", "15", "45"
    Then Check the Randevu Verildi text is seen on "12.06.2023"


  @reg4
    #    Kadın Doğum
  Scenario: Ameliyat Randevu Oluşturma-Randevu Sil  Zafer

    When The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu
    And Enter "1020" and selects service
    And Clicks Yeni Randevu button
    And Selects patient using "15175989"
    And Enters the Ameliyat-randevu "619922", "13.06.2023", "15", "00"
    And Check the Randevu Verildi text is seen on "13.06.2023"
    And clicks to dropdown menu
    And Clicks Randevu sil button from dropdown
    And clicks to Evet

  @reg4a
#    Kadın doğum servisi ameliyathanede olan hasta için Randevu Sil
  Scenario: Ameliyat işlemi Onaylandıktan Sonra Randevu Silme İşlemi

    When The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu
    And Enter "1020" and selects service
    And Clicks Yeni Randevu button
    And Selects patient using "15175989"
    And Enters the Ameliyat-randevu "619922", "16.06.2023", "15", "00"
    And Check the Randevu Verildi text is seen on "16.06.2023"
    And The user created Ameliyat Listesi and Ameliyat İslemleri
    And The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu
    And The user enters the unit code and then presses refresh
    And Check the Randevu Verildi text is seen on "16.06.2023"
    And clicks to dropdown menu
    And Clicks Randevu sil button from dropdown
    And clicks to Evet
    And The user confirms the deletion of the appointment

  @reg5
#    Beyin Cerrahisi
  Scenario: Ameliyat Randevu Oluşturma-Randevu Raporu ve Yeni Ameliyat  Bilal

    When The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu
    And Enter "1006" and selects service
    And Clicks Yeni Randevu button
    And Selects patient using "15242294"
    And Enters the Ameliyat-randevu "615441", "14.06.2023", "10", "00"
    And Check the Randevu Verildi text is seen on "14.06.2023"
    And Select the patient from list to see the Randevu Raporu
    And Click the Randevu Raporu button from dropdown to access the report
    Then Check the Randevu Raporu is seen and close report
    And Click the Yeni Ameliyat button from dropdown
    Then Check not allowed to enter new patient for surgery by using Yeni Ameliyat button


  @reg6
#    1008 Çocuk Cerrahisi Servisi Günlük Birim Tanım Kontrolü

  Scenario: Ameliyat Randevu _ Günlük-Birim_Tanımı_Kontrolü

    When The user hover over Ameliyathane İşlemleri and selects Ameliyat Randevu
    And Enter "1008" and selects service
    And Clicks Yeni Randevu button
    And Selects patient using "15387314"
    And Enters the Ameliyat-randevu "615171", "15.06.2023", "10", "00"
    And Check the Randevu Verildi text is seen on "15.06.2023"
    And Clicks Yeni Randevu button
    And Selects patient using "15387314"
    And Enters the Ameliyat-randevu "618206", "15.06.2023", "11", "00"
    Then Check if the daily surgery capacity is exceeded or not by having warning message
    And clicks to dropdown menu
    And Clicks Randevu sil button from dropdown
    And clicks to Evet

