package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement source = driver.findElement(By.xpath("//li[2][@id='fourth'][@data-id='2']/a"));
		WebElement target = driver.findElement(By.xpath("//ol[@id='amt7']/li"));
Actions act=new Actions(driver);
act.dragAndDrop(source, target).perform();
Thread.sleep(2000);
driver.quit();
	}

}
