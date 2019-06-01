package bdd.bdd_example;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Unit test for simple App.
 */
public class DiscountServiceTest {
	DiscountService ds = null;
	String percentage = "";

	@Given("^Execute DiscountService business$")
	public void execute_DiscountService_business() throws Throwable {
		ds = new DiscountService();
	}

	@When("^If i will enter (\\d+)$")
	public void if_i_will_enter(int arg1) throws Throwable {
		percentage = ds.getDiscount(arg1);
	}

	@Then("^It should get ten percentage discount$")
	public void it_should_get_ten_percentage_discount() throws Throwable {
		Assert.assertEquals("10%", percentage);
	}

	@Given("^Execute Discountservice business$")
	public void execute_Discountservice_business() throws Throwable {
		ds = new DiscountService();
	}

	@When("^If I will enter (\\d+)$")
	public void if_I_will_enter(int arg1) throws Throwable {
		percentage = ds.getDiscount(arg1);
	}

	@Then("^It should get fifteen percentage discount$")
	public void it_should_get_fifteen_percentage_discount() throws Throwable {
		Assert.assertEquals("15%", percentage);
	}
	
	@Then("^It should get any percentage discount$")
	public void it_should_get_any_percentage_discount() throws Throwable {
		Assert.assertEquals("NA", percentage);
	}

}
