package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGeneratorUtility;

public class SignIn extends CommonUtility {
	POMFactory factory = new POMFactory();

	@When("User click on Sign in option")
	public void userClickOnSigninOption() {
		click(factory.signInPage().signInButton);
		logger.info("user clicked on sign in button");
	}
	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passwordValue) {
	sendText(factory.signInPage().emailField, emailValue);
	sendText(factory.signInPage().passwordField, passwordValue);
	logger.info("user entered email " + emailValue+ " and password " + passwordValue);

	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
	click(factory.signInPage().loginPageButton);
	logger.info("user clicked on login button");

	}
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
	Assert.assertTrue(isElementDisplayed(factory.signInPage().accountOption));	
	  
	}
	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().createNewAccountButton);
		logger.info("User clicked on New account button");
	
	}
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
	   sendText(factory.signInPage().signUpNameField,data.get(0).get("name"));
	   sendText(factory.signInPage().signUpEmailField,data.get(0).get("email"));
	   sendText(factory.signInPage().signUpPasswordField,data.get(0).get("password"));
	   sendText(factory.signInPage().signUpConfirmPassField,data.get(0).get("confirmPassword"));
	   logger.info("user entred information for signin up");
	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
	  click(factory.signInPage().signUpFormButton);
	  logger.info("user clicked on sign up button");
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		waitTillPresence(factory.signInPage().profileImg);
		Assert.assertTrue(isElementDisplayed(factory.signInPage().profileImg));
		logger.info("user logged into account");
	  
	}



}
