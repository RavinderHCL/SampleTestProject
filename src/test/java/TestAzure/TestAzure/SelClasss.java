package TestAzure.TestAzure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelClasss {
	
@Test
public void test() {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
			d.get("https://www.google.co.in");;
	
}
}
