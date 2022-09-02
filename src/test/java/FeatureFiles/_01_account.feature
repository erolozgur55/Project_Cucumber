Feature:Create Account Functionality

  Background:
    Given navigate to site

  Scenario Outline: Create a Fee, delete Fee

    And click on the element
      | createAccount |

    And user sending keys in the element
      | cFirstName            | <name>            |
      | cLastName             | <lastname>        |
      | cAddress              | <address>         |
      | cPassword             | <password>        |
      | cPasswordConfirmation | <passwordconfirm> |

    And click on the element
      | cCreateAccountButton |

    And user should create account successfully

    Examples:
      | name | lastname | address          | password   | passwordconfirm |
      | Erol | Ozgur    | sdfsdf@gmail.com | O1l2via344 | O1l2via344      |
