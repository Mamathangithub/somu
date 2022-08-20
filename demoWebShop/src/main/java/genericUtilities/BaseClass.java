package genericUtilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;

	@BeforeSuite
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@BeforeMethod
	public void NavigatingToApplication() {
		driver.get("http://demowebshop.tricentis.com/login");
	}

	@AfterMethod
	public void LogoutOperation(ITestResult res) throws IOException {
		if (ITestResult.FAILURE == res.getStatus()) {
			ScreenshotUtility.takingScreenshot(driver, res.getName());
		}
		System.out.println("logout from app");
	}

	@AfterSuite
	public void tearDownTheBrowser() {

		driver.quit();

	}

}
