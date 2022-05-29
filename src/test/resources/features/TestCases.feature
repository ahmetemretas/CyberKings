Feature: Test Cases

  @aet
  Scenario: Testing random number generation - TC01
    Given Go to url
    When Click on Generate Random Number button
    Then Verify that the number is a random
    And  Verify that the number is a three digit
    And  Verify that the number is a positive number

  @aet
  Scenario: Testing random number matching- TC02
    Given Go to url
    When Click on Generate Random Number button
    Then Type the generated number into the textbox below the number
    And  Click on the Verify number button
    And  Verify that a green check image is displayed

  @aet
  Scenario: Testing random number unmatching - TC03
    Given Go to url
    When Click on Generate Random Number button
    Then Type a different number from the generated number into the text box below the number
    And  Click on the Verify number button
    And  Verify that a red cross image is displayed