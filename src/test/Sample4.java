package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
	}

}
