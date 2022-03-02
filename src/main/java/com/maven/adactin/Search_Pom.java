package com.maven.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Pom {
	public WebDriver driver;

	public Search_Pom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	public WebElement loc;

	public WebElement getloc() {
		return loc;
	}

	@FindBy(id = "hotels")
	private WebElement hotels;

	public WebElement gethotels() {
		return hotels;
	}

	@FindBy(id = "room_type")
	private WebElement roomtype;

	public WebElement getroomtype() {
		return roomtype;
	}

	@FindBy(id = "room_nos")
	private WebElement roomno;

	public WebElement getroomno() {
		return roomno;
	}

	@FindBy(id = "adult_room")
	private WebElement adultroom;

	public WebElement getadultroom() {
		return adultroom;
	}

	@FindBy(id = "child_room")
	private WebElement childroom;

	public WebElement childtroom() {
		return childroom;
	}

	@FindBy(id = "Submit")
	private WebElement submit;

	public WebElement submit() {
		return submit;
	}
}
