package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//driver.findElement(By.id("username")).sendKeys("admin");both methods are same
String script="document.getElementById('username').value='admin'";
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript(script);
driver.findElement(By.name("pwd")).sendKeys("manager");
//String script1="document.getElementById('username').value=''";//for remove the value 
//js.executeScript(script1);
WebElement login=driver.findElement(By.xpath("//div[text()='Login']"));
String text=login.getText();
//login.sendKeys(Keys.ENTER);//OR
login.click();
	}

}
