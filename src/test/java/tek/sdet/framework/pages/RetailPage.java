package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailPage extends BaseSetup {
	
	public RetailPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	// syntax for finding UI elements and storing them in POM classes 
	/**
	 * @FindBy(locatorType = "value")
	 * public WebElement nameOfElement
	 */
	
	@FindBy(xpath="//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;
	
	@FindBy(id ="search")
	public WebElement allDepartmentDropDown;
	
	@FindBy(css = "#searchInput")
	public WebElement searchBar;
	
	@FindBy(xpath = "//button[@id='searchBtn']")
	public WebElement searchButton; 
	
	@FindBy(linkText = "Sign in")
	public WebElement signInButton;
	
	@FindBy(id="cartBtn")
	public WebElement cartButton;
	
	@FindBy(xpath ="//img[contains(@alt, 'Pokemon')]")
	public WebElement pokemanProductImage;
	
	@FindBy(id = "hamburgerBtn")
	public WebElement allIcon;
	
	@FindBy(xpath ="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarElements;
	
	@FindBy(xpath ="//span[text()='Computers']")
	public WebElement computersSideBar;
	
	@FindBy(xpath="//span[text()='Smart Home']")
	public WebElement smartHomeSideBar;
	
	@FindBy(xpath ="//span[text()='Sports']")
	public WebElement sportsSideBar;
	
	@FindBy(xpath ="//span[text()='Automative']")
	public WebElement automativeSideBar;
	
	@FindBy(xpath ="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarOptionElements;
	
	@FindBy(id = "hamburgerBtn")
	public WebElement all_section;
	
	@FindBy(xpath = "//span[contains(text(),'Electronics')]")
	public WebElement electronics;
	
	@FindBy(xpath = "//select[@id='search']")
	public WebElement allDepartment;
	
	@FindBy(id = "searchInput")
	public WebElement seachInput;
	
	@FindBy(id = "searchBtn")
	public WebElement searchIcon;
	
	@FindBy(xpath = "//p[contains(text(),'Kasa Outdoor Smart Plug')]")
	public WebElement kasaItem;
	
	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement quantity;
	
	@FindBy(xpath = "//button[@id='addToCartBtn']")
	public WebElement addtoCardBtn;
	
	@FindBy(xpath = "//span[@id='cartQuantity']")
	public WebElement itemQuantity;
	
	

}
