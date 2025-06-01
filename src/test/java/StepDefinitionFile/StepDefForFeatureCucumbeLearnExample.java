package StepDefinitionFile;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefForFeatureCucumbeLearnExample {

	@Given("Open website")
	public void open_website() {
		System.out.println("Opened websites");
	}

	@When("login with card {string} and {string}")
	public void login_with_card_pramodh_debit_and(String username, String int1) {
		System.out.println("Logged In with " + username + " and " + int1 + " done");
	}

	@Then("Card related options should visible")
	public void card_related_options_should_visible() {
		System.out.println("Card options visible");
	}

	@Given("Open signup website")
	public void Open_signup_website() {
		System.out.println("Opened signup website");
	}

	@When("SignUp user")
	public void SignUp_user(List<String> data) {
		System.out.println("First name: " + data.get(0)+"\nLast name: "+data.get(1)+"\n Sex: "+data.get(2));
	}
	@Then("Account created")
	public void account_created() {
	   System.out.println("Account created");
	}
}
