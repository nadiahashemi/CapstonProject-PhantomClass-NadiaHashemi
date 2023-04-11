package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class OrderTest extends CommonUtility {
	POMFactory factory = new POMFactory();

	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderPage().orders);
		logger.info("user clicked on order section");
	}

	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		List<WebElement> elements = getDriver().findElements(By.xpath("//p[text()='Show Details']"));
		WebElement firstElement = elements.get(0);
	}

	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelBtn);
		logger.info("User clicked on cancel the order button");
	}

	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String wrongItem) {
		selectByVisibleText(factory.orderPage().cancelationReason, wrongItem);
		logger.info("User selected the cancelation reason");
	}

	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelOrder);
		logger.info("User clicked on cancel order button");
	}

	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String string) {
		WebElement element = getDriver().findElement(By.xpath("//p[text()='" + string + "']"));
		Assert.assertTrue(element.isDisplayed());
		logger.info("cancelation message displayed");
	}

	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderPage().returnItems);
		logger.info("User clicked on return items button");
	}

	@And("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String damagedItem) {
		selectByVisibleText(factory.orderPage().reasoninput, damagedItem);
		logger.info("User selected return reason");
	}

	@And("User select the drop off service {string}")
	public void userSelectTheDropOffService(String fedEx) {
		selectByVisibleText(factory.orderPage().dropOffInput, fedEx);
		logger.info("User selected drop off service");
	}

	@Then("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnButton);
		logger.info("User clicked on return order button");
	}

	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewBtn);
		logger.info("User clicked on review button");
	}

	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String headlineValue, String reviewText) {
		sendText(factory.orderPage().healineInput, headlineValue);
		sendText(factory.orderPage().description, reviewText);
		logger.info("User wrote review headline and review text");
	}

	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().reviewSubmitBtn);
		logger.info("User clicked on add review button");
	}

	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String string) {
		waitTillPresence(factory.orderPage().reviewAddedSuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().reviewAddedSuccessfully));
		logger.info("Review message is displayed");
	}

}
