Feature: Detail Product
  I want to view any product
  @1
  Scenario Outline:Verify that the website navigate to detail product page when user click on any product
    Given Open home page
    When Click on any product
    Then The website navigate to product detail page with correct "<Url>" and "<deviceName>" and "<Cost>" and "<detail>"
    Examples:
      | Url | deviceName | Cost | detail |
      | https://www.demoblaze.com/prod.html?idp_=1 | Samsung galaxy s6| $360 | The Samsung Galaxy S6 is powered by 1.5GHz octa-core Samsung Exynos 7420 processor and it comes with 3GB of RAM. The phone packs 32GB of internal storage cannot be expanded. |







