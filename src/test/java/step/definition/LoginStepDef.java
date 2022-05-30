package step.definition;

import java.util.List;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage;
import page.objects.LoginPage;


public class  LoginStepDef extends Base {
	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();
	

	@Given("user is on Retail home Page")
	public void userIsOnRuser_is_on_retail_home_pageetailHomePage() {
	Assert.assertTrue(homePage.isLogoDisplayed()); 
	logger.info("user is on Home Page");
	}

	@When("user click on MyAccount")
	public void user_click_on_my_account() {
		homePage.clickOnMyAccount();
		logger.info("user clicked on MyAccount");

	}

	@When("user click on Login option")
	public void user_click_on_login_option() {
	homePage.clickOnLogin();
	logger.info("user clicked on login");

	}

	@When("user enter userName {string}  and password {string}")
	public void user_enter_user_name_and_password(String email, String pass) {
		loginPage.enterEmail(email);
		logger.info("user enter the userName " + email);
		loginPage.enterPassword(pass);
		logger.info("user enter the password  " +pass);

	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		loginPage.clickOnLoginButton();
		logger.info("user clicked on login button");

	}
	@When("user logged into myAccount Page")
	public void user_logged_into_my_account_page() {
	    Assert.assertTrue(loginPage.myAccountTextIsPresent());
	    logger.info("user logged into myaccount Page");
	}

   @When("User click on ‘Edit your affiliate information'link")
   public void user_click_on_edit_your_affiliate_information_link() {
	   loginPage.clickOneditaffiliateinfolink();
	   logger.info("user clicked on edit your affiliate information link");
   }

   @When("User fill affiliate form with below information")
   public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
	    List<List<String>>userList = dataTable.asLists(String.class);
	    for(List<String> e:userList) {
		 System.out.println(e);
	 }  
     }

    @When("user click on Bank Transfer radio button")
    public void user_click_on_bank_transfer_radio_button() {
         loginPage.clickOnbankTransferButton();
         logger.info("user clicked on bank transer radio button");
     }

    @When("User fill Bank information with below information")
    public void user_fill_bank_information_with_below_information(DataTable dataTable) {
	     List<List<String>>userList = dataTable.asLists(String.class);
	     for(List<String> e:userList) {
		 System.out.println(e);
	 } 
     }

   @When("User click on Continue button")
   public void user_click_on_continue_button() {
        loginPage.clickOncontinueButton();
        logger.info("user clicked on continue button");
}

   @When("User should see a success message")
   public void user_should_see_a_success_message() {
       loginPage.successmessageTextIsPresent();
       logger.info("user see a success message");
   
}

	//Scenario: Edit your account Information

	@When("User click on  ‘Edit your account information'link")
	public void user_click_on_edit_your_account_information_link() {
		loginPage.clickOneditAccInfolink();
	    logger.info("User clicked on 'Edit your account information' link");
	}
	
	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		 List<List<String>>userList = dataTable.asLists(String.class);
		 for(List<String> e:userList) {
			 System.out.println(e);
		 } 
	}
	@When("User click on continue button")
	public void user_click_on_continue_button2() {
		loginPage.clickOncontinueButton();
		logger.info("User clicked on continue bottone");
	}

	@Then("User should see a message ‘Success: Your account has been successfully updated.’")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() {
		loginPage.successmessageTextIsPresent();
	    logger.info("User can see a message ‘Success: Your account has been successfully updated.’");
	}
	
}
	
