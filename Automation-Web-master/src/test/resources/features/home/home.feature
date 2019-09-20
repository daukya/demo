@component:ui
@version:Release-2
@issue:ETSY-102
Feature: Register Course Online
  In order for learning a new technologies
  As a learner
  I want buyers to buy  a course
#Remember when you write the scenario the : need to be near Scenario . For example
#Scenario: is a correct way. Not use Scenario : is wrong because it has space in the
#middle

 	Scenario: Register an account
	    Given I am on the registration 
	    When I enter my email
	    And I enter my password
	    And I confirm my password
	    And I enter my firstname
	    And I enter lastname
	    And I click Registration button
	    Then I should see result