Feature: Login
  I Wan login Juniorviec with account student

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

