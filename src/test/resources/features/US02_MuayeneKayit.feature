Feature: US-02 Muayene Kayıt

  Background:

    Given the user logs in
    Then the user selects Poliklinik Muayene Kayit


  Scenario: US-02 TC-01 Emergency - Outpatient Citizen Without ID Number.

    And  user clicks Polyclinic (Poliklinik) and enters PolyclinicCode "322" to select Polyclinic
    And User go to the Hasta Kayit page
    And User enters the patient information without ID Card and ID Number
    Then Patient is saved to the muayene kayit module.

  @wip
  Scenario: US-02 TC-02 Emergency - Outpatient Foreigner (Health Tourism)

    And  user clicks Polyclinic (Poliklinik) and enters PolyclinicCode "322" to select Polyclinic
    And User go to the Hasta Kayit page
    And User enters the patient passport information as a Health Tourism option
    Then Health Tourism Patient is saved to the muayene kayit module.


  Scenario: US-02 TC-03 Emergency - Outpatient Foreigner (Victim of Human Trafficking)

    And  user clicks Polyclinic (Poliklinik) and enters PolyclinicCode "322" to select Polyclinic
    And User go to the Hasta Kayit page
    And User enters the patient passport information as a Victim of Human Trafficking option
    Then Patient is saved to the muayene kayit module.


  Scenario: US-02 TC-04 Emergency - Outpatient Foreigner (Tourist)

    And  user clicks Polyclinic (Poliklinik) and enters PolyclinicCode "322" to select Polyclinic
    And User go to the Hasta Kayit page
    And User enters the patient passport information as a Tourist option
    Then Tourist patient is saved to the muayene kayit module.


  Scenario: US-02 TC-05 Emergency - Outpatient Foreigner (Türk Soylu Yabancılar)

    And  user clicks Polyclinic (Poliklinik) and enters PolyclinicCode "322" to select Polyclinic
    And User go to the Hasta Kayit page
    And user clicks Türk Soylu Yabancılar option within Hasta Türü Dropdown menu.
    And user selects "FRANSA" from Uyruğu dropdown box.
    And user selects one option from Kurumu dropdown menu.
    And user selects one option from Kurum Detay dropdown menu.
    And user fills out related Information.
    Then user clicks on Save icon and confirms registration success message.



  Scenario: US-02 TC-06 User should be able to create an appointment and cancel the appointment
    When user enters the idNumber
    And  user clicks Polyclinic (Poliklinik) and enters PolyclinicCode "153" to select Polyclinic
    And user clicks Beneficiary Type (Hak Sah.Tip) and selects "Normal"
    And user clicks Arrival Type (Geliş Şekli) and selects "Ayaktan"
    And user clicks Save (Kaydet) button
    Then user asserts the alert message as "Bilgiler kaydedildi."
    Then user confirms the message and closes the window
    And user clicks cancelAppointment (Geliş İptal) button
    And user clicks Cancellation Status (İptal Durumu) and select a reason as "Diyaliz takip numarası için ayrılan protokol" for cancelation
    And user clicks appointment cancellation Save button

  Scenario: US-02 TC-07 User should be able to cancel the prebooked appointment
    When  user enters the idNumber
    And user clicks getPatientCurrentAppointmentButton
    And user clicks cancelAppointment (Geliş İptal) button
    And user clicks Cancellation Status (İptal Durumu) and select a reason as "Diyaliz takip numarası için ayrılan protokol" for cancelation
    And user clicks appointment cancellation Save button

  Scenario: US-02 TC-08 User should not revise the prebooked Appointment with the same polyclinic and doctor information
    When user enters the idNumber
    And  user clicks Polyclinic (Poliklinik) and enters PolyclinicCode "153" to select Polyclinic
    And user clicks Beneficiary Type (Hak Sah.Tip) and selects "Normal"
    And user clicks Arrival Type (Geliş Şekli) and selects "Ayaktan"
    And user clicks Save (Kaydet) button
    Then user asserts the alert message as "Bilgiler kaydedildi."
    Then user confirms the message and closes the window
    And the user clicks changePolyclinicButton (Değ.)
    And  user enters PolyclinicCode "153" to select Polyclinic
    Then user asserts the alert message as "Aynı polikliniğe sevk edemezsiniz!"
    Then user confirms the message and closes pop up window

  Scenario: US-02 TC-09 User should be able to change the polyclinic and doctor information for a prebooked Appointment
    When user enters the idNumber
    And  user clicks Polyclinic (Poliklinik) and enters PolyclinicCode "153" to select Polyclinic
    And user clicks Beneficiary Type (Hak Sah.Tip) and selects "Normal"
    And user clicks Arrival Type (Geliş Şekli) and selects "Ayaktan"
    And user clicks Save (Kaydet) button
    Then user asserts the alert message as "Bilgiler kaydedildi."
    Then user confirms the message and closes the window
    And the user clicks changePolyclinicButton (Değ.)
    And  user enters PolyclinicCode "1054" to select Polyclinic
    And user clicks Save (Kaydet) button
    Then user asserts the alert message as "Bilgiler kaydedildi."
    Then user confirms the message and closes the window


  Scenario: US-02 TC-10 If patient ID Number is valid and Date of Birth matches, ID Number verification
  results pop-up should be seen
    And User fills out "TC_KIMLIK_NO" placeholder with valid ID Number "22460026710"
    And  User fill out "DOGUM_TARIHI_YASI" with a valid date "09.07.1990"
    And User taps on the Verification Button
    Then ID Number verification page pop-up should be seen and verify ID Number "22460026710"


  Scenario: US-02 TC-11 If patient ID Number is invalid “Geçerli bir kimlik numarası giriniz.” message should be seen
    And User fills out "TC_KIMLIK_NO" placeholder with valid ID Number "22460026711"
    And User clicks on enter button on "TC_KIMLIK_NO" field
    Then Verify that “Geçerli bir kimlik numarası giriniz.” pop up message should be seen


  Scenario: US-02 TC-12 In order to create a newborn registiration, newborn checkbox should be selected, birth week and day field should be open
    When User clicks on the patient registiration button
    And User clicks on the newborn checkbox
    Then Birth order, birth week and birth day sections should be open



  Scenario: US-02 TC-13 foreign patient registry (yabanci hasta kayit)

    And Register foreign patient
    Then the foreign patient is registered

  Scenario: US-02 TC-14 foreign patient registry change (yabanci hasta kayit değişiklik)

    And enter foreign patient number to change patient registry
    And change patient registry
    Then foreign patient record is changed
    And registration has been restored

