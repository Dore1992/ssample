package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

String key="webdriver.chrome.driver";
String value="./Drivers/chromedriver.exe";
System.setProperty(key, value);
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");// use http://demo.actitime.com/
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("username")).sendKeys("admin");

driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.xpath("//div[.='Login ']")).click();

WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.titleContains("Enter"));
String homePage = driver.getTitle();
System.out.println(homePage);
Thread.sleep(2000);
WebElement logout = driver.findElement(By.id("logoutLink"));
String text = logout.getText();
System.out.println("Got the text of the logout button and the text is :"+text);
logout.click();
System.out.println("Cliked on logout button");
	wait.until(ExpectedConditions.titleContains("Login"));
String loginPage = driver.getTitle();
System.out.println(loginPage);
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
driver.quit();

	}

}
