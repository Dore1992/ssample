package popup;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	Set<String> allWindows = driver.getWindowHandles();
	for(String wd:allWindows) {
		WebDriver browser=driver.switchTo().window(wd);
		String title=browser.getTitle();
		System.out.println(title);
	}
	


}
}
