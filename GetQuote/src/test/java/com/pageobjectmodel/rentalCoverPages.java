package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rentalCoverPages {

public WebDriver driver;
	
	public rentalCoverPages(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="//input[@placeholder='Select or type a country']")
	WebElement countrybx;
	
	public void getCountrybx(String country) {
		
		countrybx.sendKeys(country);
		
	}
	
	@FindBy(xpath="//input[@id='QuoteForm_FromDate-datepicker']")
	WebElement fromdatebx;
	
	public void getFromdatebx() {
		
		fromdatebx.click();
		
	}
	
	@FindBy(xpath="(//a[contains(text(),'15')])[1]")
	WebElement fromdate;
	
	public void getFromdate() {
		
		fromdate.click();
		
	}
	
	@FindBy(xpath="(//a[contains(text(),'30')])[1]")
	WebElement todate;
	
	public void getTodate() {
		
		todate.click();
		
	}
	
	@FindBy(xpath="(//strong[contains(text(),'change')])[2]")
	WebElement vehiclebtn;
	
	public void getVehiclebtn() {
		
		vehiclebtn.click();
		
	}
	
	@FindBy(xpath="(//span[contains(text(),'Get Your Instant Quote')])[4]")
	WebElement quotebtn;
	
	public void getQuotebtn() {
		
		quotebtn.click();
		
	}
	
}
