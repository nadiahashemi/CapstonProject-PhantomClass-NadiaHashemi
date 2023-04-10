package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	//Store elements below: 

	@FindBy(id = "hamburgerBtn")
	public WebElement all_section;
	
	@FindBy(xpath = "//span[contains(text(),'Electronics')]")
	public WebElement electronics;
	
	@FindBy(xpath = "//select[@id='search']")
	public WebElement allDepartment;
	
	@FindBy(xpath ="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarElements;
	
	@FindBy(id = "searchInput")
	public WebElement seachInput;
	
	@FindBy(id = "searchBtn")
	public WebElement searchIcon;
	
	@FindBy(xpath = "//img[@class='image']")
	public WebElement kasaItem;
	
	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement quantity;
	
	@FindBy(xpath = "//button[@id='addToCartBtn']")
	public WebElement addtoCardBtn;
	
	@FindBy(xpath = "//span[@id='cartQuantity']")
	public WebElement itemQuantity;

	@FindBy(xpath = "//div[@id='cartBtn']/p")
	public WebElement cartBtn;
	
	@FindBy(css = "#proceedBtn")
	public WebElement proceedBtn;
	
	@FindBy(id = "addPaymentBtn")
	public WebElement addpaymentBtn;
	
	@FindBy(xpath = "//button[@class='checkout__address-btn']")
	public WebElement addressBtn;
	
	@FindBy(id = "countryDropdown")
	public WebElement country;
	
	@FindBy(id = "fullNameInput")
	public WebElement fullName_Input;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumber;
	
	@FindBy(id = "streetInput")
	public WebElement streetInput;
	
	@FindBy(id = "apartmentInput")
	public WebElement apartmentInput;
	
	@FindBy(id = "cityInput")
	public WebElement cityInput;
	
	@FindBy(xpath = "//select[@name='state']")
	public WebElement states;
	
	@FindBy(id = "zipCodeInput")
	public WebElement zipCode;
	
	@FindBy(id = "addressBtn")
	public WebElement addAddressBtn;
	
	@FindBy(xpath = "//input[@name='cardNumber']")
	public WebElement cardnumber;
	
	@FindBy(xpath = "//input[@name='nameOnCard']")
	public WebElement nameOnCardInput;
	
	@FindBy(xpath = "//select[@name='expirationYear']")
	public WebElement expirationyear;
	
	@FindBy(xpath = "//select[@name='expirationMonth']")
	public WebElement expirationMonth;
	
	@FindBy(xpath = "//input[@name='securityCode']")
	public WebElement securitycode;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement paymentSubmitButton;
	
	@FindBy(id = "placeOrderBtn")
	public WebElement placeOrderBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Order Placed Successfully')]")
	public WebElement orderSuccessfullyMessage;
	
	@FindBy(xpath = "//p[contains(text(),'Order Placed, Thanks')]")
	public WebElement orderPlacedMessage;
	
	@FindBy(xpath = "//p[contains(text(),'Apex Legends - 1,000 Apex Coins')]")
	public WebElement apexLegends;
}
