package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPage extends Base{

	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
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

	
	@FindBy(xpath = "//h2[text()=\"My Account\"]")
	private WebElement myAccountText;
	

    @FindBy(xpath="//*[@id=\"content\"]/ul[3]/li[1]/a")
    private WebElement editaffiliateinfolink;
	
	@FindBy(id="input-company")
	private WebElement companyNameField;
	
	@FindBy(id="input-website")
	private WebElement websiteField;
	
	@FindBy(id="input-tax")
	private WebElement taxIdField;
	
	@FindBy(xpath="//input[@value=\"bank\"]")
	private WebElement bankTransferButton;
	
	@FindBy(id="input-bank-name")
	private WebElement bankNameinput;
	
	@FindBy(id="input-bank-branch-number")
	private WebElement abaNuminput;
	
	@FindBy(id="input-bank-swift-code")
	private WebElement swiftinput;
	
	@FindBy(id="input-bank-account-name")
	private WebElement accNameinput;
	
	@FindBy(id="input-bank-account-number")
	private WebElement accNuminput;
	
	@FindBy(xpath="/html/body/div[2]/div/div/form/div/div/input")
	private WebElement continueButton;
	
	@FindBy(xpath="/html/body/div[2]/div[1]")
	private WebElement successmessage;
	
	//Scenario: Edit your account Information
	
		@FindBy(xpath ="//a[normalize-space()='Edit your account information']")
		private WebElement editAccInfolink;
		
		@FindBy(xpath ="//input[@id='input-firstname']")
		private WebElement fNameField;
		
		@FindBy(xpath ="input-lastname")
		private WebElement lNameField;	
		
		@FindBy(xpath="input-email")
		private WebElement emailField;
		
		@FindBy(xpath ="input-telephone")
		private WebElement telField;
		
		@FindBy(xpath="/html/body/div[2]/div/div/form/div/div[2]/input")
		private WebElement continueButton2;
		
		@FindBy(xpath="/html/body/div[2]/div[1]")
		private WebElement successmessage2;
		
		@FindBy(id = "input-email")
		private WebElement emailInput;
		
		@FindBy(id = "input-password")
		private WebElement passwordInput;
		
		@FindBy(xpath ="//input[@value='Login']")
		private WebElement loginButton;
		
		@FindBy(xpath = "//h2[text()='My Account']")
		private WebElement myAccountTextt;
	
	//Scenario: login to Retail Website
	
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

		public void enterEmail(String emailValue) {
			emailInput.sendKeys(emailValue);
		}
		
		public void enterPassword(String passwordValue) {
			passwordInput.sendKeys(passwordValue);
		}
		
		public void clickOnLoginButton() {
			loginButton.click();
		}
		
		public boolean myAccountTextIsPresent() {
			if(myAccountText.isDisplayed())
				return true;
			else 
				return false;
		}

		public void clickOneditaffiliateinfolink() {
			editaffiliateinfolink.click();
		}
		public void enterCompanyName(String companyNameValue) {
			companyNameField.sendKeys(companyNameValue);
		}
		public void enterwebsiteinput(String websiteValue) {
			websiteField.sendKeys(websiteValue);
		}
		public void entertaxinput(String TaxIdValue) {
			taxIdField.sendKeys(TaxIdValue);
		}
		
		public void clickOnbankTransferButton() {
			bankTransferButton.click();
		}
		public void enterbankNameinput(String  nameValue) {
			bankNameinput.sendKeys(nameValue);
		}
		public void enterabaNuminput(String abaNumValue) {
			abaNuminput.sendKeys(abaNumValue);
		}
		public void enterswiftinput(String swiftValue) {
			swiftinput.sendKeys(swiftValue);
		}
		public void enteraccNameinput(String accNameValue) {
			accNameinput.sendKeys(accNameValue);
		}
		public void enteraccNuminput(String accNumValue) {
			accNuminput.sendKeys(accNumValue);
		}
		public void clickOncontinueButton() {
			continueButton.click();
		}
		public boolean successmessageTextIsPresent() {
			if (successmessage.isDisplayed())
				return true;
			else
				return false;
		}

		//Scenario: Edit your account Information
		
		 public void clickOneditAccInfolink() {
			   editAccInfolink.click();
		 }
		 public void enterfName(String fNameValue) {
			 	fNameField.sendKeys(fNameValue);
		 }
		 public void enterlName(String lNameValue) {
		 	lNameField.sendKeys(lNameValue);
		 }
		 public void enteremail(String emailValue) {
		 	emailField.sendKeys(emailValue);
		 }
		 public void entertel(String telValue) {
		 	telField.sendKeys(telValue);
		 }
		 public void clickOncontinueButton2() {
		 	continueButton.click();
		 }
		 public boolean successmessage2TextIsPresent() {
		 	if (successmessage.isDisplayed())
		 		return true;
		 	else
		 		return false;
		 }
	
	
		
}





