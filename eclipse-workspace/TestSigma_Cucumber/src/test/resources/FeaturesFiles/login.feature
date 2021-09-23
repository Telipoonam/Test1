
Feature: Login page
  I want to use this template for my feature file

Scenario: User is able to login
    Given User lands on Login page
    When I enter username as "admin"
    And I enter password as "12345"
    And click on login button
    Then user should able to login
    And user name should be shown

 