package org.rahulshettyacademy.MobileFrameworkDesign.pageObjests.android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.rahulshettyacademy.MobileFrameworkDesign.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.options.SupportsPrintPageSourceOnFindFailureOption;

public class Formpage extends AndroidActions {
	
	
	AndroidDriver driver;
	
 public Formpage(AndroidDriver driver) {
	 super(driver);
	 this.driver = driver;
	 
	PageFactory.initElements(new  AppiumFieldDecorator(driver),this);
 }
	
	@AndroidFindBy(id ="com.androidsample.generalstore:id/spinnerCountry")
	private WebElement countryselction;
	
	public void setCountrySelection(String CountryName) {
		countryselction.click();
		scrollToElement(CountryName);
		driver.findElement(By.xpath("//android.widget.TextView[@text= '"+CountryName+"']")).click();
	}
	
	
	
	
	
}
