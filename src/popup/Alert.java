package popup;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Alert {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			String key="webdriver.chrome.driver";
			String path="./Drivers/chromedriver.exe";
	System.setProperty(key, path);
	WebDriver driver=new ChromeDriver();
	driver.get("http://vrlbus.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.name("Button1")).click();
	Alert a=(Alert) driver.switchTo().alert();
	String text= "a.getText()";
	System.out.println(text);
	Thread.sleep(2000);
	((org.openqa.selenium.Alert) a).accept();       
	driver.quit();
	
		
		}

	}


