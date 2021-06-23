package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageclass.CoronavirusPage;
import pageclass.HomePage;

public class TC002Navigation_Coronavirus extends BaseClass {
	HomePage hp;
	CoronavirusPage cp;
	
	@Test
	public void verifyTitle() throws InterruptedException {
		test.log(LogStatus.INFO, "Coronavirus Navigation Test started");
		app_logs.info("Coronavirus navigation test started");
		hp= new HomePage(driver);
		cp= new CoronavirusPage(driver);
		hp.clickCoronaLink();
		test.log(LogStatus.INFO, "Corona link clicked successfully");
		app_logs.info("Coronavirus navigation link clicked");
		Thread.sleep(2000);
		String expectedTitle= "Coronavir | TVO.org";
		String actualTitle= driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		test.log(LogStatus.INFO, "verify Title Test is passed");
		app_logs.info("Coronavirus title verified");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500);");
		Thread.sleep(2000);
		cp.coronaImgDisplayed();
		Assert.assertTrue(true);
		test.log(LogStatus.INFO, "Appropriate image is displayed on the page");
		app_logs.info("Coronavirus image displayed");
		cp.coronaImgClick();
		test.log(LogStatus.INFO, "Image is clicked. Coronavirus Navigation Test is passed");
		app_logs.info("Coronavirus navigation test completed");
	}
	
}
