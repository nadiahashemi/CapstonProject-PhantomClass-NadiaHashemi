package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

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
		click(factory.AccountPage().accountBtn);
		logger.info("User clicked on account option");
	}
	@And("User update Name {string} and Phone {string}")
	public void UserUpdateNameAndPhone(String Name, String Phone) {
		clear(factory.AccountPage().name);
	    sendText(factory.AccountPage().name, Name);
	    clear(factory.AccountPage().phoneInput);
	    sendText(factory.AccountPage().phoneInput,Phone);
	    logger.info(" User updated "+ Name + " and phone number "+ Phone);    
	}
	
	@And("User click on Update button")
	public void UserClickUpdateBtn() {
		click(factory.AccountPage().personaUpdateBtn);
		logger.info("User clicked on update button");
	}
	@Then ("user profile information should be updated")
	public void PersonalInfoUpdated() {
		waitTillPresence(factory.AccountPage().updateUserOptionPresent);
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().updateUserOptionPresent));
	}
	@When("User enter below information")
	public void userEnterBelowInfo(io.cucumber.datatable.DataTable datatable) {
		List<Map<String,String>> data = datatable.asMaps(String.class, String.class);
		sendText(factory.AccountPage().pervPass, data.get(0).get("previousPassword"));
		sendText(factory.AccountPage().newPass, data.get(0).get("newPassword"));
		sendText(factory.AccountPage().confirmPass, data.get(0).get("confirmPassword"));
		logger.info("User Updated his/her Password");
	}
	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
	   click(factory.AccountPage().changePassBtn); 
	   logger.info("user clicked on change password button");
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String string) {
	 waitTillPresence(factory.AccountPage().passUpdatedSuccessfully);
	 Assert.assertTrue(isElementDisplayed(factory.AccountPage().passUpdatedSuccessfully));
	 logger.info("A successfully updated password message is displayed");
	}

	
}
