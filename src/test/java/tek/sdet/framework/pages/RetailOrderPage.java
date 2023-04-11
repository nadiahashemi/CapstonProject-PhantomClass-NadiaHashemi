package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {

	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "orderLink")
	public WebElement orders;

	@FindBy(xpath = "//p[@class='order__header-btn']")
	public WebElement orderDetails;

	@FindBy(id = "cancelBtn")
	public WebElement cancelBtn;

	@FindBy(id = "reasonInput")
	public WebElement cancelationReason;

	@FindBy(xpath = "//button[@class='order__cancel-submit'and text()='Cancel']")
	public WebElement cancelOrder;

	@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
	public WebElement cancelationMessage;

	@FindBy(id = "returnBtn")
	public WebElement returnItems;

	@FindBy(id = "dropOffInput")
	public WebElement dropOffInput;

	@FindBy(id = "reasonInput")
	public WebElement reasoninput;

	@FindBy(xpath = "//button[@class='order__cancel-submit'and text()='Return']")
	public WebElement returnButton;

	@FindBy(xpath = "//p[text()='Return was successfull']")
	public WebElement returnMessage;

	@FindBy(id = "reviewBtn")
	public WebElement reviewBtn;

	@FindBy(id = "headlineInput")
	public WebElement healineInput;

	@FindBy(id = "descriptionInput")
	public WebElement description;

	@FindBy(id = "reviewSubmitBtn")
	public WebElement reviewSubmitBtn;

	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement reviewAddedSuccessfully;

}
