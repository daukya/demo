Feature: Phone
  I want to view product in phone category

  @1
  Scenario Outline: Verify that Galaxy S6 display correct in phone category
    Given Open home page
    Then The website display Galaxy in phone category correct with "<name>" and "<cost>"
    Examples:
      | name | cost |
      | Samsung galaxy s6 | $360 |

    @2
    Scenario Outline: Verify that GalaxyS6 displays correct in detail page when user click on name
      Given Open home page
      When Click on galaxy name
      Then The website navigate to galaxy detail page correct with "<name>" and "<description>"
      Examples:
        | name | description |
        | Samsung galaxy s6 | The Samsung Galaxy S6 is powered by 1.5GHz octa-core Samsung Exynos 7420 processor and it comes with 3GB of RAM. The phone packs 32GB of internal storage cannot be expanded. |

