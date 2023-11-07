package org.basicMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class Basic3Method {
	public static void main(String[] args) {
		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.startUp("ch","https://demoqa.com/radio-button");
		
		WebElement label = driver.findElement(By.className("mb-3"));
		System.out.println("Label ="+label.isDisplayed());
		
		WebElement yesRdoBtn = driver.findElement(By.id("yesRadio"));
		System.out.println("yesRdoBtn ="+yesRdoBtn.isEnabled());
//		yesRdo.click();
		
	//	JavascriptExecutor js =(JavascriptExecutor)driver;
	//	js.executeScript("arguments[0].click();",yesRdo);
		bu.clickByJs(driver,yesRdoBtn);
		
		System.out.println("yesRdo ="+yesRdoBtn.isSelected());
		
		WebElement noRdoBtn = driver.findElement(By.id("noRadio"));
		System.out.println("noRdoBtn ="+noRdoBtn.isEnabled());

		

   }
}
