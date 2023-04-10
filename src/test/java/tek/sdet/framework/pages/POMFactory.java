package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {
	private RetailHomePage HomePage;
	private RetailSignInPage signInPage;
	private RetailAccountPage Accountpage;
	private RetailOrderPage orderPage;
	private RetailPage retailPage;
	
	public POMFactory() {
	this.HomePage = new RetailHomePage();	
	this.signInPage = new RetailSignInPage();
	this.Accountpage = new RetailAccountPage();
	this.orderPage = new RetailOrderPage();
	this.retailPage = new RetailPage();
	}
	
	public RetailHomePage homePage() {
		return this.HomePage;
	}
	
	public RetailSignInPage signInPage() {
		return this.signInPage;
	}
	public RetailAccountPage AccountPage() {
		return this.Accountpage;
	}
	public RetailOrderPage orderPage() {
		return this.orderPage;
	}
	public RetailPage retailPage() {
		return this.retailPage;
	}

}