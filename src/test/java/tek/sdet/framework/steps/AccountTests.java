package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class AccountTests extends CommonUtility {

	POMFactory factory = new POMFactory(); 
		
	@When("User click on Account option")
	public void UserClickedAccount() {
		click(factory.AccountPage().AccountBtn);
		logger.info("User clicked on account option");
	}
	@And("User update Name {string} and Phone {string}")
	public void UserUpdateInfo(String NameValue, String PhoneValue) {
		sendText(factory.AccountPage().Name, NameValue);
		sendText(factory.AccountPage().PhoneInput, PhoneValue);
		logger.info("user updated"+ NameValue + "and"+ PhoneValue);
	}
	@And("User click on Update button")
	public void UserClickUpdateBtn() {
		click(factory.AccountPage().personaUpdateBtn);
		logger.info("User clicked on update button");
	}
	@Then ("user profile information should be updated")
	public void PersonalInfoUpdated() {
		waitTillPresence(factory.AccountPage().UpdateUserOptionPresent);
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().UpdateUserOptionPresent));
	}
	
	
}
