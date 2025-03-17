#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Purchasing an order from ECommerce WebApp.
  I want to use this template for my feature file

Background:
Given User landed on the Ecommerce page

  @Regression
  Scenario Outline: Positive Test of Submitting an order
    Given User Logged in with Email <Email> and Password <Password>
    When User add product <Product> in cart
    And Checkout the product <Product> and submit the order
    Then "THANKYOU FOR THE ORDER." is displayed on the confirmation page

    Examples: 
      | Email                | Password     | Product        |
      | Deshmukh@yopmail.com | Deshmukh@123 | ADIDAS ORIGINAL|
 
