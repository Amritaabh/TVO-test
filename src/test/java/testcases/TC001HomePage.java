package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageclass.HomePage;

public class TC001HomePage extends BaseClass {
	
	HomePage hp;
	
	@Test
	public void verifyImgDisplay() {
		test.log(LogStatus.INFO, "Verify Image Display Test started");
		app_logs.info("Verify image display test started");
		hp= new HomePage(driver);
		hp.imgDisplayed();
		test.log(LogStatus.INFO, "Image on the home page is displayed");
		app_logs.info("appropriate image is verified on the home page");
		Assert.assertTrue(false);
		hp.imgLocation();
		test.log(LogStatus.INFO, "Location of the secondary block image on the home page is displayed");
		app_logs.info("location of the secondary block image is captured");
		test.log(LogStatus.INFO, "Verify Image Display Test completed");
		app_logs.info("Verify image display test completed");
	}
	
	

}
