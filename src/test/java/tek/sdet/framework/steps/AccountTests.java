package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
		sendText(factory.AccountPage().phoneInput, Phone);
		logger.info(" User updated " + Name + " and phone number " + Phone);
	}

	@And("User click on Update button")
	public void UserClickUpdateBtn() {
		click(factory.AccountPage().personaUpdateBtn);
		logger.info("User clicked on update button");
	}

	@Then("user profile information should be updated")
	public void PersonalInfoUpdated() {
		waitTillPresence(factory.AccountPage().updateUserOptionPresent);
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().updateUserOptionPresent));
	}

	@When("User enter below information")
	public void userEnterBelowInfo(io.cucumber.datatable.DataTable datatable) {
		List<Map<String, String>> data = datatable.asMaps(String.class, String.class);
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
		WebElement element = getDriver().findElement(By.xpath("//div[text()='" + string + "']"));
		waitTillPresence(element);
		Assert.assertTrue(element.isDisplayed());
		logger.info("A successfully message is displayed");
	}

	@And("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.AccountPage().addPaymentMethod);
		logger.info("user clicked on add payment method");
	}

	@And("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
		sendText(factory.AccountPage().cardNumber, info.get(0).get("cardNumber"));
		sendText(factory.AccountPage().nameOnCard, info.get(0).get("nameOnCard"));
		selectByValue(factory.AccountPage().expirationMonth, info.get(0).get("expirationMonth"));
		selectByValue(factory.AccountPage().expirationYear, info.get(0).get("expirationYear"));
		sendText(factory.AccountPage().securityCode, info.get(0).get("securityCode"));
		logger.info("User entred card information");
	}

	@And("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.AccountPage().paymentButton);
		logger.info("User clicked on Add Card Button");
	}

	@Then("a message should be display ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayPaymentMethodAddedSuccessfully() {
		String expectedMessage = "Payment Method added successfully";
		waitTillPresence(factory.AccountPage().paymentmethodAddedMessage);
		Assert.assertEquals(expectedMessage, getText(factory.AccountPage().paymentmethodAddedMessage));
		logger.info("The message 'Payment Method added successfully' is displayed");
	}

	@When("User click on Card option")
	public void userClickedOnCard() {
		click(factory.AccountPage().Cardoption);
		logger.info("user clicked on card otion");
	}

	@And("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.AccountPage().editCardBtn);
		logger.info("User clicked on edit option");
	}

	@And("user edit information with below data")
	public void userEditInformationWithBelowData(io.cucumber.datatable.DataTable dataTable) {
		clear(factory.AccountPage().cardNumber);
		clear(factory.AccountPage().nameOnCard);
		clear(factory.AccountPage().securityCode);
		List<Map<String, String>> dat = dataTable.asMaps(String.class, String.class);
		sendText(factory.AccountPage().cardNumber, dat.get(0).get("cardNumber"));
		sendText(factory.AccountPage().nameOnCard, dat.get(0).get("nameOnCard"));
		selectByValue(factory.AccountPage().expirationMonth, dat.get(0).get("expirationMonth"));
		selectByValue(factory.AccountPage().expirationYear, dat.get(0).get("expirationYear"));
		sendText(factory.AccountPage().securityCode, dat.get(0).get("securityCode"));
		logger.info("User has updated Card Information successfully");
	}

	@And("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.AccountPage().paymentUpdateBtn);
		logger.info("User clicked on update button");
	}

	@And("User click on Card option display")
	public void userClickOnCardOptionDisplay() {
		click(factory.AccountPage().Cardoption);
		logger.info("user clicked on card otion");
	}

	@And("User click on remove option of card section")
	public void userClickOnRemoveOption() {
		click(factory.AccountPage().removeOption);
		logger.info("User clicked on remove option");

	}

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.AccountPage().addAddressOption);
		logger.info("User clicked on address option");
	}

	@And("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> addressInfo = dataTable.asMaps(String.class, String.class);
		selectByValue(factory.AccountPage().countryOption, addressInfo.get(0).get("country"));
		sendText(factory.AccountPage().name_Address_Input, addressInfo.get(0).get("fullName"));
		sendText(factory.AccountPage().phone_Number_input, addressInfo.get(0).get("phoneNumber"));
		sendText(factory.AccountPage().street_input, addressInfo.get(0).get("streetAddress"));
		sendText(factory.AccountPage().apartment_input, addressInfo.get(0).get("apt"));
		sendText(factory.AccountPage().city_input, addressInfo.get(0).get("city"));
		selectByValue(factory.AccountPage().state, addressInfo.get(0).get("state"));
		String expectedzipCode = "M1B3L9";
		String acceptedZipcode = "12345";
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().zip_Code));
		Assert.assertEquals(expectedzipCode, acceptedZipcode);
		logger.info("User enter completed information");
		logger.info("Actual zip code" + acceptedZipcode + "Equals" + "Expected zip code for Canada" + expectedzipCode);

	}

	@And("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.AccountPage().address_Btn);
		logger.info("user clicked on add address button");

	}

	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
		waitTillPresence(factory.AccountPage().address_addedMessage);
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().address_addedMessage));
	}

	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.AccountPage().edit_button);
		logger.info("user clicked on edit button");
	}

	@When("user update address form with below information")
	public void userUpdateAddressFormWithBelowInformation(io.cucumber.datatable.DataTable dataTable) {

		clear(factory.AccountPage().name_Address_Input);
		clear(factory.AccountPage().phone_Number_input);
		clear(factory.AccountPage().street_input);
		clear(factory.AccountPage().apartment_input);
		clear(factory.AccountPage().city_input);
		clear(factory.AccountPage().zip_Code);
		List<Map<String, String>> update = dataTable.asMaps(String.class, String.class);
		selectByValue(factory.AccountPage().countryOption, update.get(0).get("country"));
		sendText(factory.AccountPage().name_Address_Input, update.get(0).get("fullName"));
		sendText(factory.AccountPage().phone_Number_input, update.get(0).get("phoneNumber"));
		sendText(factory.AccountPage().street_input, update.get(0).get("streetAddress"));
		sendText(factory.AccountPage().apartment_input, update.get(0).get("apt"));
		sendText(factory.AccountPage().city_input, update.get(0).get("city"));
		selectByValue(factory.AccountPage().state, update.get(0).get("state"));
		sendText(factory.AccountPage().zip_Code, update.get(0).get("zipCode"));
		logger.info("User enter completed information");
	}

	@And("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.AccountPage().address_updateBtn);
		logger.info("user clicked on update button");

	}

	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().address_updatedMessage));

	}

	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.AccountPage().remove_Btn);
		logger.info("user click on reove button");
	}

	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().addAddressOption));

	}

}
