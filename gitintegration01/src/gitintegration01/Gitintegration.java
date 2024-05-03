package gitintegration01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gitintegration {

	public class Facebookhw1 {
		public String baseUrl="https://www.facebook.com/login/";
		String driverPath="C:\\Users\\Rakhi N Kumar\\Downloads\\geckodriver-v0.26.0-win64//geckodriver.exe";
		public WebDriver driver;
		
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching firefox browser");
		System.setProperty("webdriver.gecko.driver",driverPath);
		driver=new FirefoxDriver();
		driver.get(baseUrl);
	}
	@Test
	public void verifyHomepageTitle() {
		driver.findElement(By.name("email")).sendKeys("rakhi.nkumar");
		driver.findElement(By.name("pass")).sendKeys("qw1234");
		driver.findElement(By.name("login")).click();
	}
	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
	}

	}


