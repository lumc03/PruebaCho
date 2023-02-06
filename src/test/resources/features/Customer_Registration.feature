#language: en

Feature: Register a new customer
  I as a Tester
  Want to register a customer
  To keep track of my new customers

  Background:
    Given the user navigates to the login page
    When enter the login data "admin" and "serenity" in the form
    And the user navigates to the Customer module

  Scenario Outline: add a new customer with all valid data
    When enter the data into the form
      | Body   | CustomerId   | CompanyName   | ContactName   | ContactTitle   | Representatives   | Address   | Country   | City   | Phone   | Email   |
      | <Body> | <CustomerId> | <CompanyName> | <ContactName> | <ContactTitle> | <Representatives> | <Address> | <Country> | <City> | <Phone> | <Email> |
    And search for the "<CustomerId>" of the added customer
    Then should see the new customer in the list
    Examples:
      | Body      | CustomerId | CompanyName | ContactName | ContactTitle | Representatives | Address       | Country | City     | Phone        | Email             |
      | ValidData | PALACIO       | OPALCIO     | Kathe Holm  | Sales Agent  | Andrew Fuller   | St. Seatle 25 | Brazil  | Campinas | 458 896 8758 | opalcio@gmail.com |


  Scenario Outline: add a new customer with empty mandatory fields
    When enter the data into the form
      | Body   | CustomerId   | CompanyName   |
      | <Body> | <CustomerId> | <CompanyName> |
    Then the page should display a "<Message>"
    Examples:
      | Body               | CustomerId | CompanyName | Message                                                                               |
      | requiredFieldEmpty |            |             | Please validate empty or invalid inputs (marked with red) before submitting the form. |


  Scenario Outline: add a new customer with data type string in field Phone
    When enter the data into the form
      | Body   | CustomerId   | CompanyName   | ContactName   | ContactTitle   | Representatives   | Address   | Country   | City   | Phone   | Email   |
      | <Body> | <CustomerId> | <CompanyName> | <ContactName> | <ContactTitle> | <Representatives> | <Address> | <Country> | <City> | <Phone> | <Email> |
    Then  the page should display a "<Message>"

    Examples:
      | Body         | CustomerId | CompanyName | ContactName | ContactTitle | Representatives | Address      | Country | City | Phone         | Email             | Message                                                                               |
      | invalidPhone | WERT       | WHESTOL     | Deid Muller | Sales Agent  | Andrew Fuller   | Mull Obre 34 | Austria | Graz | 0921-59 79 48 | whestol@gmail.com | Please validate empty or invalid inputs (marked with red) before submitting the form. |

  Scenario Outline: add a new customer with email structure invalid
    When enter the data into the form
      | Body   | CustomerId   | CompanyName   | ContactName   | ContactTitle   | Representatives   | Address   | Country   | City   | Phone   | Email   |
      | <Body> | <CustomerId> | <CompanyName> | <ContactName> | <ContactTitle> | <Representatives> | <Address> | <Country> | <City> | <Phone> | <Email> |
    Then  the page should display a "<Message>"

    Examples:
      | Body         | CustomerId | CompanyName | ContactName | ContactTitle | Representatives | Address      | Country | City      | Phone         | Email    | Message                                                                               |
      | invalidEmail | JLPO       | JOULPE      | Jhon Mike   | Sales Agent  | Andrew Fuller   | Ober Str. 57 | Canada  | Vancoyver | 0721-12 34 48 | jhon.com | Please validate empty or invalid inputs (marked with red) before submitting the form. |
      | invalidEmail | JLPO       | JOULPE      | Jhon Mike   | Sales Agent  | Andrew Fuller   | Ober Str. 57 | Brazil  | Campinas  | 0721-12 34 48 | jhon@    | Please validate empty or invalid inputs (marked with red) before submitting the form. |



