package com.qa.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
  
   public LoginPage (WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
	   System.out.println("InitElement Method");
	   
   }
   
   @FindBy (xpath = "(//a[@class='btn btn-color'])[1]")
   private WebElement login_page;
   public void clickOnLogin ()
   {
	   login_page.click();
	   System.out.println("Login Successfully");
   }
}

