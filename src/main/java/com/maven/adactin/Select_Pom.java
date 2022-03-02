package com.maven.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Pom {
	public WebDriver driver;

	public Select_Pom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "radiobutton_0")
	public WebElement select;

	public WebElement getSelect() {
		return select;
	}

	@FindBy(name = "continue")
	public WebElement submit;

	public WebElement getsubmit() {
		return submit;
	}

}
