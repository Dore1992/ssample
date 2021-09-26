package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/SELENIUM-SUDEER/selenium/Day-4/xpath.html");
driver.findElement(By.id("logo"));
System.out.println(driver);
driver.findElement(By.className("en-us nonHP")).sendKeys("dore");
	}

}
