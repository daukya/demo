Feature: Remove User
  I want to remove user from BO

  @1
  Scenario Outline: Verify that User is removed success on BO when create account from BO
    Given Open browser to login into BO
    When Fill data correct to login success into BO
      | admin | Nghiviec2019@ |
    And Select wallet user
    And Click search full user
    And Click remove and Tap Ok button
    And Click search full user
    Then Delete success for "<number>" user
    Examples:
      | number |
      | 1      |





