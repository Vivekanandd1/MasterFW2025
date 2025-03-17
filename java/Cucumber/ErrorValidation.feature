
@tag
Feature: Error Validation
  I want to use this template for my feature file

  @ErrorValidations
  Scenario Outline: Verify the error message
    Given User landed on the Ecommerce page
    And User Logged in with Email <Email> and Password <Password>
    Then "Incorrect email or password." message is displayed

 Examples: 
      | Email                | Password     | 
      | Deshmukh@yopmail.com | Deshmukh@133 |
