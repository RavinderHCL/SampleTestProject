package TestAzure.TestAzure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelClasss {
	WebDriver d = null;
@Test(priority=1)
public void test() {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
	 d = new ChromeDriver();
			d.get("https://www.google.co.in");;
	
}
@Test(priority=2)
public void test2() {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
	Assert.assertTrue(d.getTitle().equalsIgnoreCase("Google"));
	
}

@Test(priority=3)
public void test3() {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
	Assert.assertTrue(d.getTitle().equalsIgnoreCase("Google1111111111111"));
	
}
}
