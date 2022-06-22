package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPage extends Base{

	public RetailPage() {
		PageFactory.initElements(driver,this);
	}

	
	// Locators for BackGround:
		
		@FindBy(xpath = "//span[text()='My Account']")
		private WebElement MyAccount;

		@FindBy(xpath = "//a[text()='Login']")
		private WebElement Login;

		@FindBy(id = "input-email")
		private WebElement UserName;

		@FindBy(id = "input-password")
		private WebElement Password;

		@FindBy(xpath = "//input[@value='Login']")
		private WebElement LoginButton;

		@FindBy(id="content")
		private WebElement MyAccountDashboard;
		

	// Locators for Scenario: Register as an Affiliate user with Cheque Payment Method	
		
		@FindBy(xpath = "//*[@id=\"content\"]/ul[3]/li/a")
		private WebElement RegisterAffiliateAccount;

		@FindBy(id = "input-company")
		private WebElement CompanyName;

		@FindBy(id = "input-website")
		private WebElement Website;

		@FindBy(id = "input-tax")
		private WebElement TaxID;

		@FindBy(xpath = "//input[@value='cheque']")
		private WebElement ChequePaymentMethod;
		
		@FindBy(id="input-cheque")
		private WebElement ChequePayeeName;

		@FindBy(xpath = "//input[@type='checkbox']")
		private WebElement AboutUs;

		@FindBy(xpath = "//div[@class='pull-right']")
		private WebElement ContinueButton;

		@FindBy(xpath = "/html/body/div[2]/div[1]")
		private WebElement SuccessMessage;

	// Locators for Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
		
		@FindBy(xpath = "/html/body/div[2]/div/div/ul[3]/li[1]/a")
		private WebElement EditAffiliateAccount;
		
		@FindBy(xpath = "/html/body/div[2]/div/div/form/fieldset[2]/div[2]/div/div[3]/label/input")
		private WebElement BankTransferRadioButton;

		@FindBy(id = "input-bank-name")
		private WebElement BankName;

		@FindBy(id = "input-bank-branch-number")
		private WebElement BranchNumber;

		@FindBy(id = "input-bank-swift-code")
		private WebElement SwiftCode;

		@FindBy(id = "input-bank-account-name")
		private WebElement AccountName;

		@FindBy(id = "input-bank-account-number")
		private WebElement AccountNumber;
		
	// Locators for Scenario: Edit your account Information
		
		@FindBy(xpath = "/html/body/div[2]/div/aside/div/a[2]")
		private WebElement EditAccount;

		@FindBy(id = "input-firstname")
		private WebElement FirstName;

		@FindBy(id = "input-lastname")
		private WebElement LastName;

		@FindBy(id = "input-email")
		private WebElement email;

		@FindBy(id = "input-telephone")
		private WebElement Telephone;

		@FindBy(xpath = "/html/body/div[2]/div[1]")
		private WebElement SuccessMessageUpdateinfo;
		
		
		
	// Methods for Background:
		
		public void clickOnMyAccount() {
			MyAccount.click();
		}

		public void Login() {
			Login.click();
		}

		public void enterEmail(String usernameValue) {
			UserName.sendKeys(usernameValue);
		}

		public void enterPassword(String passwordValue) {
			Password.sendKeys(passwordValue);
		}

		public void clickOnLoginButton() {
			LoginButton.click();
		}

		public boolean MyAccountDashboard() {
			if (MyAccountDashboard.isDisplayed())
				return true;
			else
				return false;
		}


	//Methods for Scenario: Register as an Affiliate user with Cheque Payment Method
		
		public void RegisterAffiliateAccount() {
			RegisterAffiliateAccount.click();
		}

		public void CompanyName(String companyValue) {
			CompanyName.clear();
			CompanyName.sendKeys(companyValue);
		}

		public void Website(String websiteValue) {
			Website.clear();
			Website.sendKeys(websiteValue);
		}

		public void TaxID(String taxIDValue) {
			TaxID.clear();
			TaxID.sendKeys(taxIDValue);
		}

		public void ChequePaymentMethod(String paymentMethodValue) {
			ChequePaymentMethod.click();
		}

		public void ChequePayeeName(String chequePayeeNameValue) {
			ChequePayeeName.clear();
			ChequePayeeName.sendKeys(chequePayeeNameValue);
		}

		public void ABOUTUS() {
			AboutUs.click();
		}

		public void ContinueButton() {
			ContinueButton.click();
		}

		public void SuccessMessage() {
			SuccessMessage.isDisplayed();
		}
		
	// Methods for Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
		
		public void EditAffiliateAccount() {
			EditAffiliateAccount.click();
		}

		public void BankTransferRadioButton() {
			BankTransferRadioButton.click();
		}

		public void BankName(String BankNameValue) {
			BankName.sendKeys(BankNameValue);
		}

		public void BranchNumber(String BranchNumberValue) {
			BranchNumber.sendKeys(BranchNumberValue);
		}

		public void SwiftCode(String SwiftCodeValue) {
			SwiftCode.sendKeys(SwiftCodeValue);
		}

		public void AccountName(String AccountNameValue) {
			AccountName.sendKeys(AccountNameValue);
		}

		public void AccountNumber(String AccountNumberValue) {
			AccountNumber.sendKeys(AccountNumberValue);
		}

	// Methods for Scenario: Edit your account Information
		public void EditAccountInformation() {
			EditAccount.click();
		}

		public void FirstName(String firstnameValue) {
			FirstName.clear();
			FirstName.sendKeys(firstnameValue);
		}

		public void LastName(String lastnameValue) {
			LastName.clear();
			LastName.sendKeys(lastnameValue);
		}

		public void Email(String emailValue) {
			email.clear();
			email.sendKeys(emailValue);
		}

		public void Telephone(String telephoneValue) {
			Telephone.clear();
			Telephone.sendKeys(telephoneValue);
		}

		public void SuccessMessageUpdateinfo() {
			SuccessMessageUpdateinfo.isDisplayed();
		}

	}

	/*
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
	
	*/
		


