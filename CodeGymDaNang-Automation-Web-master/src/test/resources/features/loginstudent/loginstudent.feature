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

  @2
  Scenario Outline: Validate email and pass when fields null
    Given Open browser to login
    When click login
    And click enter login
    Then validate field "<email>" and "<pass>"
    Examples:
      | email              | pass               |
      | Field is Required. | Field is Required. |

