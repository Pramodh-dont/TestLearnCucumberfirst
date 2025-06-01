package StepDefinitionFile;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefForFeatureOfSeleniumLearn {
	WebDriver driver;
	String SeaechedProductOfHome;
	String SeaechedProductOdeals;

	public StepDefForFeatureOfSeleniumLearn() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	
	@Given("User should open website")
	public void user_should_open_and_login_to_website() {
		// open web page
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		this.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}

	@When("User search {string} product in home page")
	public void user_search_product_in_home_page(String input) {
		WebElement Search = this.driver.findElement(By.xpath("//input[@type='search']"));
		Search.sendKeys(Keys.CLEAR);
		Search.sendKeys(input);
		Search.sendKeys(Keys.ENTER);
	}

	@Then("Searched product in home page is available and fetch its name")
	public void searched_product_in_home_page_is_available_and_fetched_it_s_name() {
		WebElement prodname = this.driver.findElement(By.className("product-name"));
		String SeaechedProductOfHome = prodname.getText().split("-")[0].trim();
		this.driver.quit();
	}

	@When("User search {string} product in deals page")
	public void user_search_product_in_deals_page(String input) {
		this.driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		Set<String> Windows = driver.getWindowHandles();
//		String ParentWindow = driver.getWindowHandle();
		Iterator<String> it=Windows.iterator();
		    String ParentWindow= it.next();
		    String ChildWindow= it.next();
		    System.out.println(ParentWindow+" - "+ChildWindow);
		    this.driver.switchTo().window(ChildWindow);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		for (String window : Windows) {
//			if (!window.equalsIgnoreCase(ParentWindow)) {
//				String ChildWindow = window;
//				driver.switchTo().window(ChildWindow);
//			}
//		}
		WebElement Search = this.driver.findElement(By.xpath("//input[@type='search']"));
		Search.clear();
		Search.sendKeys(input);
	}

	@Then("Searched product in deals page is available and fetch its name")
	public void searched_product_in_deals_page_is_available_and_fetched_it_s_name() {
		String SeaechedProductOdeals = this.driver.findElement(By.xpath("//td[1]")).getText();
		this.driver.quit();
	}

	@Then("Home search product name should equal to deals page product name")
	public void home_search_product_name_should_equal_to_deals_page_product_name() {
		Assert.assertEquals(SeaechedProductOfHome, SeaechedProductOdeals);
	}
}
