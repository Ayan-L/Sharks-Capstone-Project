@TestLoginRetail
Feature:LoginRetail

Scenario: login to Retail Website
    Given user is on Retail home Page
    When user click on MyAccount
    And user click on Login option
    And user enter userName "ayanlaila@gmail.com"  and password "11223344"
    And user click on login button
    When user logged into myAccount Page
   When User click on ‘Edit your affiliate information'link
   And User fill affiliate form with below information
   |abcd|www.abcd.us|122|
   And user click on Bank Transfer radio button
   And User fill Bank information with below information
   |BA|123|2324|Marwa|123456789999|
   And User click on Continue button
   And User should see a success message             
   And User click on  ‘Edit your account information'link
   And User modify below information
   | Laila   | Ayan   | ayanlaila@gmail.com |1234567999|
   And User click on continue button
   Then User should see a message ‘Success: Your account has been successfully updated.’
 
















