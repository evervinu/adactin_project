package com.maven.adactin;

public class Hotelbooking extends Base_Class {

	public static void main(String[] args) {
		
		browserLaunch("chrome");
		url("https://adactinhotelapp.com/index.php");
		
		Login_Pom l = new Login_Pom();
		driver.getCurrentUrl();
		inputvalues(l.getusername(),"vinever95");
		inputvalues(l.getpassword(), "Vin@54325");
		elementclick(l.getlogin());
		
		
	}
}
