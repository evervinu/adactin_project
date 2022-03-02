package com.maven.adactin;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.lang.model.element.Element;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	public static void browserLaunch(String name) {
		
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.geco.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver.manage().window().maximize();
		}
	}
	public static void url(String url) {
		driver.get(url);
	}
	
	public static void title(String title) {
		driver.getTitle();
	}
	public static void currenturl() {
		driver.getCurrentUrl();
	}
	public static void elementclick(WebElement element) {
		element.click();
	}
	public static void inputvalues(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void diverClose() {
		driver.close();
	}
	public static void navigateto(String n) {
		driver.navigate().to(n);
	}
	public static void navigateforward() {
		driver.navigate().forward();
	}
	public static void navigateback() {
		driver.navigate().back();
	}
	public static void refresh() {
		driver.navigate().refresh();
	}
	public static void dropdown(WebElement element,String options,String value) {
	Select s = new Select(element);
	if (options.equalsIgnoreCase("value")) {
		s.selectByIndex(Integer.parseInt(value));
	}
	else if (options.equalsIgnoreCase("index")) {
		s.selectByIndex(Integer.parseInt(value));
	}
	else if (options.equalsIgnoreCase("text")) {
		s.selectByIndex(Integer.parseInt(value));	
	}
	}
	public static void isDisplayed(WebElement is) {
		boolean display = is.isDisplayed();
		System.out.println(display);
	}
	public static void isEnable(WebElement ise) {
		boolean enable = ise.isEnabled();
		System.out.println(enable);
	}
	public static void isSelected(WebElement iss) {
		boolean sele = iss.isSelected();
		System.out.println(sele);
	}
	public static void selectDropdown(WebElement e1,String option,String value) {
		Select s1 = new Select(e1);
		if (option.equalsIgnoreCase("value")) {
			s1.selectByIndex(Integer.parseInt(value));
		}
		else if (option.equalsIgnoreCase("index")) {
			s1.selectByIndex(Integer.parseInt(value));
		}
		else if (option.equalsIgnoreCase("text")) {
			s1.selectByIndex(Integer.parseInt(value));	
		}
	}
	public static void multiple(WebElement e2) {
		Select s2 = new Select(e2);
		boolean multiple = s2.isMultiple();
		System.out.println(multiple);
	}
	public static void allselect(WebElement e3) {
		Select s3 = new Select(e3);
		List<WebElement> allselect = s3.getAllSelectedOptions();
		System.out.println(allselect);
	}
	public static void getoption(WebElement e4) {
		Select s4 = new Select(e4);
		List<WebElement> goptn = s4.getOptions();
		System.out.println(goptn);
	}
	public static void firstselect(WebElement e5) {
		Select s5 = new Select(e5);
		WebElement first = s5.getFirstSelectedOption();
		System.out.println(first.getText());
	}
	public static void accept(WebElement element) {
		Alert a = driver.switchTo().alert();
		System.out.println(a);
	}
	public static void dismiss(WebElement element) {
		Alert a1 = driver.switchTo().alert();
		System.out.println(a1);
	}
	public static void promptalert(WebElement element) {
		Alert a2 = driver.switchTo().alert();
		System.out.println(a2);
	}
	public static void Javascrtipt() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
	}
	public static void screenshot() throws IOException  {
		TakesScreenshot sc = (TakesScreenshot) driver;
	    File image = sc.getScreenshotAs(OutputType.FILE);
	    File lo = new File("C:\\Users\\vinme\\eclipse-workspace\\SeleniumTesting\\Schreenshot\\Vin.png");
	    FileUtils.copyFile(image, lo);
	}
	public static void frame(String frame1,String id,int index,WebElement element) {
		if (frame1.equalsIgnoreCase("id")) {
			driver.switchTo().frame(id);
		}
		else if (frame1.equalsIgnoreCase("index")) {
			driver.switchTo().frame(index);
		}
		else if (frame1.equalsIgnoreCase("element")) {
			driver.switchTo().frame(element);	
		}
		else if (frame1.equalsIgnoreCase("parentframe")) {
			driver.switchTo().parentFrame();
		}
		else if (frame1.equalsIgnoreCase("defaultcontent")) {
			driver.switchTo().defaultContent();
		}
		}
		public static void action(String action1,String click,String contextclick,String doubleclick,String movetoelement,String draganddrop,WebElement element) {
			Actions ac = new Actions(driver);
			
			if (action1.equalsIgnoreCase("click")) {
			ac.click().build().perform();	
			}
			else if (action1.equalsIgnoreCase("contextClick")) {
			ac.contextClick().build().perform();
			}
			else if (action1.equalsIgnoreCase("doubleClick")) {
			ac.doubleClick().build().perform();	
			}
			else if (action1.equalsIgnoreCase("moveToElement")) {
			ac.moveToElement(element).build().perform();
			}
			else if (action1.equalsIgnoreCase("dragAndDrop")) {
			ac.dragAndDrop(element, element).build().perform();
			}
			}
		
		
}
