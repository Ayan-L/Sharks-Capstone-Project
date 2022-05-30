package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class HomePage extends Base {
	/**
	 * In this class we will store all UI Elements that belongs to Home page of this
	 * application.
	 */

	/**
	 * We will use PageFactory Class to initialize the UI elements we store in this
	 * class. PageFactory class provides a method called .initElements and this
	 * method job is to initialize all UI (User Interface) Elements.
	 */
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// @FindBy annotation is == driver.findElement()

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement logo;

	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchbar;

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;
	
	@FindBy(xpath = "/html/body/nav/div/div[1]/form/div/button")
	private WebElement currency;
	
	@FindBy(xpath = "//*[@id=\"form-currency\"]/div/ul/li[1]/button")
	private WebElement Euro;
	
	@FindBy(xpath = "//*[@id=\"form-currency\"]/div/button/strong")
	private WebElement CurrencyValue;
	
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[4]/a")
	private WebElement ShoppingCart;
	
	@FindBy(xpath = "//*[@id=\"content\"]/p")
	private WebElement textmessage;

	public boolean isLogoDisplayed() {
		if (logo.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void searchInput(String value) {
		searchbar.sendKeys(value);
	}
	
	public void clickOnMyAccount() {
		myAccount.click();
	}
	
	public void clickOnRegister() {
		register.click();
	}
	
	public void clickOnLogin() {
		login.click();
	}
	
	public void clickOnCurrencyButton() {
		currency.click();
	}
	
	public static void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
    public boolean isCurrencyValueDisplayed() {
    	if (Euro.isDisplayed())
    		return true;
    	else
    		return false;
    }

	public void clickOnEuroButton() {
		// TODO Auto-generated method stub
		
	}
	 public void clickOnShoppingCart() {
		 ShoppingCart.click();
	 }
	public boolean TextmessageIspresent() {
		if (textmessage.isDisplayed())
			return true;
		else
			return false;
	}

	
	}

