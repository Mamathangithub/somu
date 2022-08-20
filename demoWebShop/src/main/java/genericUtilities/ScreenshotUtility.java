package genericUtilities;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class ScreenshotUtility {
	public static void takingScreenshot(WebDriver driver,String ScreenShotName) throws IOException {
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File SS=screenshot.getScreenshotAs(OutputType.FILE);
		File file=new File("./FailedScreenShot/"+ScreenShotName+".png");
		FileUtils.copyFile(SS,file);
	
}
}
