package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testscriptamazon_Test extends BaseClass{
	@Test
  public void launchingAmazon() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://github.com");
		System.out.println("hi");
				
				
	}

}
