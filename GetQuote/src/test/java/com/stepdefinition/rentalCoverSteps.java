package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.common.rentalCoverBase;
import com.pageobjectmodel.rentalCoverPages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class rentalCoverSteps extends rentalCoverBase {

	rentalCoverPages page;
	
	@Given("I am on rental cover homepage")
	public void i_am_on_rental_cover_homepage() {
	   
		   getDriver();
		    
		   page = PageFactory.initElements(driver, rentalCoverPages.class);
		   
	}

	@When("I enter my {string}")
	public void i_enter_my(String country) {
	   
	   page.getCountrybx(country);
	   
	}

	@When("I click on from date picker box")
	public void i_click_on_from_date_picker_box() {
	   
		page.getFromdatebx();
	   
	}

	@When("I Select the from date")
	public void i_select_the_from_date() {
	   
		page.getFromdate();
	   
	}

	@When("I Select the to date")
	public void i_select_the_to_date() {
	   
		page.getTodate();
	   
	}

	@When("I click on vehicle type change button")
	public void i_click_on_vehicle_type_change_button() {
	   
	   page.getVehiclebtn();
	   
	}

	@When("I Select car")
	public void i_select_car() {
	   
		Select select = new Select(driver.findElement(By.xpath("//select[@id='QuoteForm_VehicleType']")));
		
		select.selectByVisibleText("Car");
	   
	}

	@When("I Click on get your instant quote")
	public void i_click_on_get_your_instant_quote() {
	   
		page.getQuotebtn();
	   
	}

	@Then("I land on Policy Information & Payment page")
	public void i_land_on_policy_information_payment_page() {
	   
		Assert.assertEquals(driver.getTitle(), "Zero deductible protection. Save up to 50%<sup style=\" font-size: 35%;top:-1.4em;\">†</sup> — RentalCover.com");
	   
	}
}
