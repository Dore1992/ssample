package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpaze {

	
		WebDriver  driver;
  private By faceField=By.name("email");
 private By passwordField=By.id("pass");
  private By loginField=By.cssSelector("button[name='login']");
  public WebElement faceField() {
	  return driver.findElement(faceField);
  }
	 public WebElement  passwordField() {
		 return driver.findElement(faceField);
	 }
	 public WebElement  loginField() {
		 return driver.findElement(loginField);
  }
	
}


