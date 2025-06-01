package StepDefinitionFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefForFeatureCucumbeLearn {
	@Given("open website")
	public void open_website() {
	    System.out.println("Opened Website");
	}
	@When("search")
	public void search() {
	    System.out.println("Searching the product");
	}
	@When("search in deals page")
	public void search_in_deals_page() {
	    System.out.println("search in deals page");
	}
	@Then("appears searched product")
	public void appears_searched_product() {
	    System.out.println("Product is displayed");
	}
	@Then("searched product is equal to searched product in deals")
	public void searched_product_is_equal_to_searched_product_in_deals() {
	    System.out.println("searched product is equal to searched product in deals");
	}
}
