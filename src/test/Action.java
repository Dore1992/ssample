package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
System.setProperty(key, value);
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.browserstack.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
Actions act=new Actions(driver);
WebElement element=driver.findElement(By.id("product-menu-toggle")) ;
act.moveToElement(element).perform();
Thread.sleep(2000);
driver.findElement(By.id("home-paze")).click();
Thread.sleep(2000);
driver.quit();
	}

}
