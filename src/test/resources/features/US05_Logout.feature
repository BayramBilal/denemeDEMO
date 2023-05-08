Feature: Logout Function of ProBel

  Background: The users of ProBel test the logout function of app with valid credentials.

    Given the user logs in
@logout
  Scenario: User log out from muayene islemleri page

    When the user selects Poliklinik Muayene Kayit
    And Hover over to the username
    And Click the cikis option
    Then User on the HYBS enterance page
