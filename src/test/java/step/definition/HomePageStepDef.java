package step.definition;

import org.junit.Assert;


import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage;
import page.objects.RetailPage;

public class HomePageStepDef extends Base {
	HomePage homePage = new HomePage();
	RetailPage retailPage = new RetailPage();

@When("User click on Currency")
public void user_click_on_currency() {
	homePage.clickOnCurrencyButton();
	logger.info("user clicked on currency");
}
@When("User chose Euro from dropdown")
public void user_chose_euro_from_dropdown() {
	homePage.clickOnEuroButton();
	logger.info("user clicked on euro from dropdown");
}

@Then("Currency value should change to Euro")
public void currency_value_should_change_to_euro() {
	Assert.assertTrue(homePage.isCurrencyValueDisplayed());
    logger.info("currency value changed to Euro");
	
}
@When("User click on shopping cart")
public void user_click_on_shopping_cart() {
   homePage.clickOnShoppingCart();
   logger.info("user clicked on shopping cart");
}
@Then("“Your shopping cart is empty!” message should display")
public void your_shopping_cart_is_empty_message_should_display() {
   Assert.assertTrue(homePage.TextmessageIspresent());
   logger.info("your shopping cart is empty");
}
}
