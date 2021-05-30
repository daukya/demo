Feature: Monitor list
  I want to see list monitor
  @2
  Scenario Outline: Verify that the website show the list monitor correct when user select monitor category
    Given Open home page
    When Click on monitor category
    Then The website show all monitor devices correct "<namee>" and "<costt>"
    Examples:
      | namee | costt |
     | Apple monitor 24 | $400 |
#      | ASUS Full HD | $230 |


