package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//img[@id='profileImage']")
	public WebElement profileImg;

	@FindBy(xpath = "//a[@id='accountLink']")
	public WebElement accountBtn;

	@FindBy(xpath = "//input[@id='nameInput']")
	public WebElement name;

	@FindBy(xpath = "//input[@id='personalPhoneInput']")
	public WebElement phoneInput;

	@FindBy(xpath = "//button[@id='personalUpdateBtn']")
	public WebElement personaUpdateBtn;

	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement updateUserOptionPresent;

	@FindBy(xpath = "//input[@name='previousPassword']")
	public WebElement pervPass;

	@FindBy(xpath = "//input[@name='newPassword']")
	public WebElement newPass;

	@FindBy(xpath = "//input[@name='confirmPassword']")
	public WebElement confirmPass;

	@FindBy(xpath = "//button[@id='credentialsSubmitBtn']")
	public WebElement changePassBtn;

	@FindBy(xpath = "//div[text() ='Password Updated Successfully']")
	public WebElement passUpdatedSuccessfully;

	@FindBy(xpath = "//p[contains(text(), 'Add a payment method')]")
	public WebElement addPaymentMethod;

	@FindBy(xpath = "//input[@name='cardNumber']")
	public WebElement cardNumber;

	@FindBy(xpath = "//input[@name='nameOnCard']")
	public WebElement nameOnCard;

	@FindBy(xpath = "//select[@name='expirationMonth']")
	public WebElement expirationMonth;

	@FindBy(xpath = "//select[@name='expirationYear']")
	public WebElement expirationYear;

	@FindBy(xpath = "//input[@name='securityCode']")
	public WebElement securityCode;

	@FindBy(id = "paymentSubmitBtn")
	public WebElement paymentButton;

	@FindBy(xpath = "//div[contains(text(),'Payment Method added sucessfully')]")
	public WebElement paymentmethodAddedMessage;
	
	@FindBy(xpath = "//div[@data-id='4688']")
	public WebElement clickOnCard;
	
	@FindBy(xpath = "//button[contains (text(),'Edit')]")
	public WebElement editCardBtn;
	
	@FindBy(id = "//button[@id='paymentSubmitBtn' and '1']")
	public WebElement paymentUpdateBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Payment Method updated Successfully')]")
	public WebElement paymentMethodUpdatedMessage;
	
	@FindBy(xpath = "//button[contains(text(),'remove')]")
	public WebElement removeOption;
	
	@FindBy(xpath = "//div[@class='account__payment-new']")
	public WebElement newPaymentPageComes;
	
}
