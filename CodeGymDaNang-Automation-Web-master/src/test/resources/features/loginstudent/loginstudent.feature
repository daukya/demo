Feature: Login
  I Wan login Juniorviec with account student

  @1
  Scenario Outline: Login with acc multi
    Given Open browser to login
    When click login
    And I enter email "<email>"
    And I enter password "<pass>"
    And click enter login
    Then Navigate to home Juniorviec "<result>"
    Examples:
      | email                          | pass          | result                       |
      | lenguyenthanhtuyen97@gmail.com | tinhtuyen2501 | https://juniorviec.com/      |
      | lenguyenthanh99@gmail.com      | pass          | https://juniorviec.com/login |
      | lenguyenthanhtuyen97@gmail.com | tinhtuyen     | https://juniorviec.com/login |
      | email                          | ongnoimi      | https://juniorviec.com/login |
      |                                |               |                              |

  @again
  Scenario Outline: Verify that all fields validate
    Given Open browser to login on hai "<language>"
    When  click login
    And click enter login
    Then fields validate for "<username>" and "<pass>"
    Examples:
      | language | username | pass |
      | EN       | username | pass |
      | VN       | username | pass |

  @
  Scenario Outline: Validate email and pass when fields null
    Given Open browser to login
    When click login
    And click enter login
    Then validate field "<email>" and "<pass>"
    Examples:
      | email              | pass               |
      | Field is Required. | Field is Required. |

  @
  Scenario:Verify that Email field is empty but password isn't empty
    Given Open browser to login
    When click login
    And enter password correct
    And click enter login
    Then Check validate Email field

  @
  Scenario:Verify that Email field isn't empty but password is empty
    Given Open browser to login
    When click login
    And enter email correct
    And click enter login
    Then Check validate password field

  @
  Scenario: Verify that Email is valid but password is invalid
    Given Open browser to login
    When click login
    And enter email valid and pass is invalid
      | lenguyenthanhtuyen97@gmail.com | 123123 |
    And click enter login
    Then login fail and show validate message

  @2
  Scenario: Verify that Password is valid but email is invalid
    Given Open browser to login
    When click login
    And enter email invalid and pass is valid
      | lenguyenthanhtuyen@gmail.com | tinhtuyen2501 |
    And click enter login
    Then login fail and show validate message when email enter invalid and pass valid
