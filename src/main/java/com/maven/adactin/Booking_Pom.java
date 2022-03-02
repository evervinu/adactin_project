package com.maven.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Pom {
	public WebDriver driver;

	public Booking_Pom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "first_name")
	public WebElement firstname;

	public WebElement getfirstname() {
		return firstname;
	}

	@FindBy(name = "last_name")
	public WebElement lastname;

	public WebElement getlastname() {
		return lastname;
	}

	@FindBy(name = "address")
	public WebElement address;

	public WebElement getaddress() {
		return address;
	}

	@FindBy(name = "cc_num")
	public WebElement cardno;

	public WebElement getcardno() {
		return cardno;
	}

	@FindBy(name = "cc_type")
	public WebElement cardtype;

	public WebElement getcardtype() {
		return cardtype;
	}

	@FindBy(name = "cc_exp_month")
	public WebElement month;

	public WebElement getmonth() {
		return month;
	}

	@FindBy(name = "cc_exp_year")
	public WebElement year;

	public WebElement getyear() {
		return year;
	}

	@FindBy(name = "cc_cvv")
	public WebElement cvvno;

	public WebElement cvvno() {
		return cvvno;
	}

	@FindBy(name = "book_now")
	public WebElement submit;

	public WebElement getbooknow() {
		return submit;
	}

	@FindBy(xpath = "//a[text()='Logout']")
	public WebElement logout;

	public WebElement getlogout() {
		return logout;
	}
}
