package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class HandlinAction {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		//Handling multi select list box
				System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("file:///D:/SELENIUM-SUDEER/selenium/Day-7/Dropdown.html");
				WebElement listElement = driver.findElement(By.name("company"));
				Select s1=new Select(listElement);
				
				//To check whether the dropdown is single select or multi-select
				if(s1.isMultiple())
					{
						System.out.println("It is multi-select list box");
					}
				else
					{
						System.out.println("It is Single select-select list box");
					}
						
				//Select and deselect the options 
				s1.selectByIndex(0);
				Thread.sleep(2000);
				s1.selectByValue("company2");
				Thread.sleep(2000);
				s1.selectByVisibleText("Replicon");
				Thread.sleep(2000);
				s1.deselectByIndex(1);
				Thread.sleep(2000);
				s1.deselectAll();
				Thread.sleep(2000);
			
						
				
				//Get the value and text of all options
				List<WebElement> allOptions = s1.getOptions();
				for(WebElement web:allOptions) {
					
				
				//for(int i=0; i<allOptions.size(); i++)
				
					String value = web.getText();
					System.out.println(value);
					
				}
				
				driver.quit();
			}

		}

 
	
 
 
	


