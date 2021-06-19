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
		hp= new HomePage(driver);
		cp= new CoronavirusPage(driver);
		hp.clickCoronaLink();
		test.log(LogStatus.INFO, "Corona link clicked successfully");
		Thread.sleep(2000);
		String expectedTitle= "Coronavirus | TVO.org";
		String actualTitle= driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		test.log(LogStatus.INFO, "verify Title Test is passed");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500);");
		Thread.sleep(2000);
		cp.coronaImgDisplayed();
		Assert.assertTrue(true);
		test.log(LogStatus.INFO, "Appropriate image is displayed on the page");
		cp.coronaImgClick();
		test.log(LogStatus.INFO, "Image is clicked. Coronavirus Navigation Test is passed");
	}
	
}
