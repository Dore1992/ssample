package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
//driver.get("https://mail.google.com/mail/u/0/#inbox/FMfcgzGkbDRPRrrgntjChGQnskMsHmQh");
driver.get("https://demo.actitime.com/login.do");
String title=driver.getTitle();
System.out.println("title is:"+title);

//driver.manage().window().maximize();
//System.out.println("Browser is maximized");
driver.manage().window().maximize();
System.out.println("Browser is maximized");
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//System.out.println("Entered the URL in the addressbar of the browser");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
System.out.println("enter the user name");
Thread.sleep(2000);

//WebElement login=driver.findElement(By.xpath("//div [text()='Login ']"));
WebElement login=driver.findElement(By.xpath("//div [.='Login ']"));
String text=login.getText();
System.out.println("Got the text of the login button and the text is :"+text);
//login.click();
login.sendKeys(Keys.ENTER);
Thread.sleep(1000);
WebElement logout=driver.findElement(By.xpath("//body[@topmargin='0']"));
String text1=logout.getText();
System.out.println("Got the text of the logout button and the text is :"+text1);
//logout.click();
logout.sendKeys(Keys.ENTER);
 
Thread.sleep(2000);
driver.quit();
System.out.println("close the browser");
	}

}
