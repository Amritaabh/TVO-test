package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageclass.EasternHubPage;
import pageclass.HomePage;

public class TC003Navigation_Hubs extends BaseClass{
	HomePage hp;
	EasternHubPage ehp;
	
	@Test
	public void verifyHubsNavigation() throws InterruptedException {
		test.log(LogStatus.INFO, "verify Hubs Navigation Test started");
		hp= new HomePage(driver);
		ehp= new EasternHubPage(driver);
		hp.clickEHubs();
		test.log(LogStatus.INFO, "Ontario Hubs link clicked successfully");
		ehp.NEHubsClick();
		test.log(LogStatus.INFO, "North Eastern Hubs link clicked successfully");
		Thread.sleep(2000);
		String actualURL= driver.getCurrentUrl();
		System.out.println(actualURL);
		
		String expectedURL= "https://www.tvo.org/current-affairs/tag/northeastern";
	
		Assert.assertEquals(actualURL, expectedURL);
		test.log(LogStatus.INFO, "verify Hubs Navigation Test completed");
	}
}
