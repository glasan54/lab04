//Pakapol Sanarge
Feature: add
  As a user
  I want to add and view income and expense
  so that I know how much money I have

Background:
  Given a user total money 100 exit

Scenario: add income
  When I add income 20
  Then I have total money 120

  Scenario: add expense
    When I add expense 40
    Then I have total money 60