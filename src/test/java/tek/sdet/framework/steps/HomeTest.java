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

public class HomeTest extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().all_section);
		logger.info("user clicked on all section");
	}

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(io.cucumber.datatable.DataTable dataTable) {
		waitTillPresence(factory.homePage().electronics);
		String[] expectedOption = { "Electronics", "Computers", "Smart Home", "Sports", "Automative" };
		for (int i = 0; i < expectedOption.length; i++) {
			WebElement option = getDriver()
					.findElement(By.xpath("//span[contains(text(),'" + expectedOption[i] + "')]"));
			assert option.isDisplayed();
		}
		logger.info("Expected option is displayed");
	}

	@When("User on {string}")
	public void userOn(String department) {
		List<WebElement> departments = factory.homePage().sideBarElements;
		boolean equality = false;
		for (WebElement el : departments) {
			String dep = el.getText();
			if (el.getText().equals(department)) {
				equality = true;
				click(el);
				logger.info("User clicked on" + dep + "item on the side bar");
				break;
			}
		}
	}

	@Then("below options are present in department {string} {string}")
	public void belowOptionsArePresentInDepartment(String optionOne, String optionTwo) {
		Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//span[text()='" + optionOne + "']"))));
		Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//span[text()='" + optionTwo + "']"))));
		logger.info("options are present in department");
	}

	@And("User change the category to {string}")
	public void userChangeTheCategoryTo(String category) {
		click(factory.homePage().allDepartment);
		selectByVisibleText(factory.homePage().allDepartment, category);
		logger.info("user changed to smartHome option");
	}

	@And("User search for an item {string}")
	public void userSearchForAnItem(String string) {
		sendText(factory.homePage().seachInput, string);
		logger.info("user clicked on search input");
	}

	@And("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchIcon);
		logger.info("user clicked on search Icon");
	}

	@And("User click on item")
	public void userClickOnItem() {
		waitTillPresence(factory.homePage().kasaItem);
		click(factory.homePage().kasaItem);
		logger.info("user clicked on Kasa Item");
	}

	@When("User select quantity {string}")
	public void userSelectQuantity(String string) {
		selectByValue(factory.homePage().quantity, string);
		logger.info("user changed the quantity to 2");
	}

	@And("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.homePage().addtoCardBtn);
		logger.info("user clicked on add to card button");
	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String string) {
		Assert.assertTrue(isElementDisplayed(factory.homePage().itemQuantity));
		logger.info("quantity of card is displayed");
	}

	@When("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.homePage().cartBtn);
		logger.info("User clicked on card button");
	}

	@And("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.homePage().proceedBtn);
		logger.info("User clicked on proceed button");
	}

	@And("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
		click(factory.homePage().addressBtn);
		logger.info("User clicked on address button");
	}

	@And("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> address = dataTable.asMaps(String.class, String.class);
		selectByValue(factory.homePage().country, address.get(0).get("country"));
		sendText(factory.homePage().fullName_Input, address.get(0).get("fullName"));
		sendText(factory.homePage().phoneNumber, address.get(0).get("phoneNumber"));
		sendText(factory.homePage().streetInput, address.get(0).get("streetAddress"));
		sendText(factory.homePage().apartmentInput, address.get(0).get("apt"));
		sendText(factory.homePage().cityInput, address.get(0).get("city"));
		selectByValue(factory.homePage().states, address.get(0).get("state"));
		sendText(factory.homePage().zipCode, address.get(0).get("zipCode"));
		logger.info("User added new address");
	}

	@And("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		click(factory.homePage().addpaymentBtn);
		logger.info("User clicked on add payment button");
	}

	@And("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.homePage().placeOrderBtn);
		logger.info("User clicked on place Order");

	}

	@And("a message should be displayed ‘Order Placed, Thanks’")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedMessage));
		logger.info("Order placed message is displayed");
	}

}
