package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://demo.actitime.com/login.do");
//driver.navigate().to("https://demo.actitime.com/login.do");
//driver.get("https://www.facebook.com/");

Thread.sleep(2000);
//driver.close();

String title=driver.getTitle();
System.out.println(title);

}

}
	


