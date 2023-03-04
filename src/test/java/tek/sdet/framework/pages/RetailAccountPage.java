package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(xpath = "//img[@id='profileImage']")
	public WebElement profileImg;
	
	@FindBy(xpath = "//a[@id='accountLink']")
	public WebElement AccountBtn;
	
	@FindBy(xpath = "//input[@id='nameInput']")
	public WebElement Name;
	
	@FindBy(xpath = "//input[@id='personalPhoneInput']")
	public WebElement PhoneInput;
	
	@FindBy(xpath = "//button[@id='personalUpdateBtn']")
	public WebElement personaUpdateBtn;
	
	@FindBy(xpath = "//div[@class='Toastify']")
	public WebElement UpdateUserOptionPresent;
}
