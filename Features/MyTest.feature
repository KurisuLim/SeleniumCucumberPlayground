Feature: Reset functionality on login page of Application
#  Scenario: Verification of Reset button
#    Given Open the Firefox and launch the application
#    When Enter the Username and Password
#    Then Reset the credential
#    And close the browser

  Scenario Outline: Verification of reset button with numbers of credential


    Given Open the Firefox and launch the application


    When Enter the Username "<username>" and Password "<password>"

    And I entered a String "<text>" to be printed

    Then Reset the credential

    And close the browser

    Examples:

      |username  |password         |text          |

      |User1     |password1        |World         |

      |User2     |password2        |Hello         |

      |User3     |password3        |Nice          |

#  // In this line we define the set of data.