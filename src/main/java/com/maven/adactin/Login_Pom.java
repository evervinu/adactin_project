package com.maven.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Pom {
	public WebDriver driver;
	@FindBy(id = "username")
	private WebElement username;

	public WebElement getusername() {
		return username;
	}

	@FindBy(id = "password")
	private WebElement password;

	public WebElement getpassword() {
		return password;
	}

	@FindBy(id = "login")
	private WebElement login;

	public WebElement getlogin() {
		return login;
	}

}
