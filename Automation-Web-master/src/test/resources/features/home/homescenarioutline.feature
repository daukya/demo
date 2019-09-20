@component:ui
@version:Release-2
@issue:ETSY-102
Feature: Register Course Out Line
  In order for learning a new technologies
  As a learner
  I want buyers to buy  a course

 	Scenario Outline: Register a course multiple value
	    Given I am on the registration 
	    When I enter my phonenumber as "<phonenumber>"
	    And I enter my fullname as "<fullname>"
	    And I enter my emails as "<email>"
	    And I enter my username as "<username>"
	    And I enter password as "<password>"
	    And I enter repassword as "<repassword>"
	    And I click Agree Button
	    And I click Registration 
	    Then I should see pay button
	    
	Examples:
	| phonenumber 	| fullname 		|      email  			| username	| password	|repassword	|

	| 0905509953    | Nguyen Van A 	| nguyenvana@gmail.com 	|	vana98	|123456789	|123456789	|

	| 0905509954    | Nguyen Thi B  | nguyenthib@gmail.com  |	thib89	|123456789	|123456789	|