Feature: DDT example with CloudTables

  Scenario: Adding one person
    Given user is on cloudTables homepage
    When user clicks on New button
    When user enters "firstname" to firstname field
    And user enters "lastname" to lastname field
    And user enters "position" to position field
    And user enters "salary" to salary field
    And user click on create button
    Then user should be able to find person at the search box

