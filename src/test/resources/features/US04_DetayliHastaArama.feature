@search
Feature: US-04 Detailed Patient Search Function Test

  Background: The users of ProBel test the Detailed Patient Search Functions

    Given the user logs in
    When the user selects Poliklinik Muayene Kayit


  @search1
  Scenario: US-04 TC-01 Detailed Patient Search Functions with Sadece Bugun Gelis option

    When user clicks Polyclinic (Poliklinik) and enters PolyclinicCode "322" to select Polyclinic
    And User go to the Hasta Kayit page
    And User enters the patient information without ID Card and ID Number
    And Patient is saved to the muayene kayit module.
    And User goes to Detailed Patient Search page
    And User clicks the Sadece Bugun Gelis checkbox
    And User clicks the search button
    Then User sees the patient information


  @search2
  Scenario: US-04 TC-02 Detailed Patient Search Functions with Protokol No

    When User goes to Detailed Patient Search page
    And User enters the patient Protokol No
    And User clicks the search button
    Then User sees the patient information


@search3
  Scenario: US-04 TC-03 Detailed Patient Search Functions with TC Kimlik No

    When User goes to Detailed Patient Search page
    And User enters the patient TC Kimlik No
    And User clicks the search button
    Then User sees the patient information


  @search4
  Scenario: US-04 TC-04 Detailed Patient Search Functions with Hasta No

    When User goes to Detailed Patient Search page
    And User enters the patient Hasta No
    And User clicks the search button
    Then User sees the patient information


  @search5
  Scenario: US-04 TC-05 Detailed Patient Search Functions with Gelis Tarihi option

    When User goes to Detailed Patient Search page
    And User clicks the left Gelis Tarihi field
    And User selects May two on the first pop up window
    And User clicks the right Gelis Tarihi field
    And User selects May two on the second pop up window
    And User clicks the search button
    Then User sees the patient information

  @search6
  Scenario: US-04 TC-06 Detailed Patient Search Functions test with a dead person ID number (Negative Scenario)

    When User goes to Detailed Patient Search page
    And User enters the dead person ID number
    And User clicks the search button
    And User clicks the patient information
    And User clicks the dogrula button
    Then User sees the death date of the dead person