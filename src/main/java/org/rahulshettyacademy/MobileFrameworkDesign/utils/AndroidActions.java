package org.rahulshettyacademy.MobileFrameworkDesign.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AndroidActions {
	
	AndroidDriver driver;
	public AndroidActions(AndroidDriver driver) {
		
		this.driver = driver;
	}
	
	public void scrollToEnd() {
		boolean canScrollMore;
		do{
		
			canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 3.0
			));
		} while (canScrollMore);
	}
	
	public void scrollToElement(String ele){
		
		driver.findElement(AppiumBy.androidUIAutomator(" new UiScrollable(new UiSelector()).scrollIntoView(text(\"ele\")) "));
	}
	
	public void swipeAction(WebElement ele, String swipeDdirection) {
		
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) ele).getId(),
		    "direction", swipeDdirection,
		    "percent", 0.75
		));
	}
}
