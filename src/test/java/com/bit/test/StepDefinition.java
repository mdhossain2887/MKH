package com.bit.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ArrivalsPage;
import pages.HomePage;
import pages.ProductDetailPage;

public class StepDefinition {

	BaseTest b;
	HomePage hp;
	ArrivalsPage ap;
	ProductDetailPage pdp;
	
	@Given("^Navigate to  url$")
	public void navigate_to_url() throws Throwable {
		b=new BaseTest();
		hp=b.navigateToUrl();
	    
	}

	@When("^User will hoverover on any menu$")
	public void user_will_hoverover_on_any_menu() throws Throwable {
	    hp.hoverOverOnMenu("NEW");
	}

	@When("^user click on any submenu$")
	public void user_click_on_any_submenu() throws Throwable {
	  ap= hp.clickOnSubMenu();
	}

	@When("^user click on any specific product from submenu$")
	public void user_click_on_any_specific_product_from_submenu() throws Throwable {
	    pdp=ap.clickOnProduct();
	}

	@When("^user will select any color$")
	public void user_will_select_any_color() throws Throwable {
	   
	}

	@When("^user select any size$")
	public void user_select_any_size() throws Throwable {
	  
	}

	@When("^user will click add to cart button$")
	public void user_will_click_add_to_cart_button() throws Throwable {
	   
	}

	@Then("^user should see one product into cart$")
	public void user_should_see_one_product_into_cart() throws Throwable {
	    
	}

	@When("^user navigate back$")
	public void user_navigate_back() throws Throwable {
	    
	}

	@When("^user add another product into cart$")
	public void user_add_another_product_into_cart() throws Throwable {
	  
	}

	@Then("^user should see two product into cart$")
	public void user_should_see_two_product_into_cart() throws Throwable {
	    
	}
}
