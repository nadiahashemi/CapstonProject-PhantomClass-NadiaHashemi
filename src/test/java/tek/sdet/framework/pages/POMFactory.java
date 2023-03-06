package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {
	private RetailHomePage homePage;
	private RetailSignInPage signInPage;
	private RetailAccountPage Accountpage;
	private RetailOrdersPage orderPage;
	
	public POMFactory() {
	this.homePage = new RetailHomePage();	
	this.signInPage = new RetailSignInPage();
	this.Accountpage = new RetailAccountPage();
	this.orderPage = new RetailOrdersPage();
	}
	
	public RetailHomePage homePage() {
		return this.homePage;
	}
	
	public RetailSignInPage signInPage() {
		return this.signInPage;
	}
	public RetailAccountPage AccountPage() {
		return this.Accountpage;
	}
	public RetailOrdersPage orderPage() {
		
		return this.orderPage;
	}

}