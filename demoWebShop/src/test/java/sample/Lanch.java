package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lanch {
	@Test
	public void m() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/login/");
	}

}
