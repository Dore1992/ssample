package popup;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://vrlbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("TRIPSTARTDATE")).clear();
		DateTimeFormatter DTF=DateTimeFormatter.ofPattern("dd-/MM-/yyyy");
		//LocalDate date=LocalDate.now().plusMonths(1);
		LocalDate date=LocalDate.now().plusDays(6);
		driver.findElement(By.id("TRIPSTARTDATE")).sendKeys(DTF.format(date));
		Thread.sleep(2000);
		driver.quit();
		
	}

}
