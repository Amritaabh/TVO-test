package testcases;

import java.util.Iterator;

import java.util.Set;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pageclass.HomePage;
import pageclass.TVOKidsPage;
import pageclass.TVOPreschoolPage;

public class TC004Navigation_Kids extends BaseClass {
	HomePage hp;
	TVOKidsPage kp;
	TVOPreschoolPage psp;
	
	@Test
	public void verifyKidsNavigation() throws InterruptedException {
		test.log(LogStatus.INFO, "TVOKids Navigation Test started");
		app_logs.info("TVOKids navigation test started");
		hp= new HomePage(driver);
		kp=new TVOKidsPage(driver);
		psp= new TVOPreschoolPage(driver);
		hp.kidsLinkClick();
		test.log(LogStatus.INFO, "TVOKids link clicked");
		app_logs.info("TVOKids navigation link clicked");
		Set<String>winids= driver.getWindowHandles();
		Iterator<String> iterate=winids.iterator();
		String homeWindow= iterate.next();
		System.out.println("The home window id is: " +homeWindow);
		app_logs.info("Home window handler id is captured");
		String kidsWindow= iterate.next();
		System.out.println("The kids window id is: " +kidsWindow);
		app_logs.info("Kids window handler id is captured");
		BaseClass.driver.switchTo().window(kidsWindow);
		kp.preSchoolLinkClick();
		test.log(LogStatus.INFO, "Preschool link clicked");
		app_logs.info("Preschool link is clicked");
		psp.preschoolGamesClick();
		test.log(LogStatus.INFO, "Preschool Games link clicked");
		app_logs.info("Preschool games link is clicked");
		Thread.sleep(2000);
		
		driver.close();
		app_logs.info("Kids window is closed");
		BaseClass.driver.switchTo().window(homeWindow);
		Thread.sleep(3000);
		
		hp.aboutLinkClick();
		test.log(LogStatus.INFO, "About TVO link on the home page clicked");
		app_logs.info("About TVO navigation link clicked on home page");
		//WebDriverWait wait= new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.presenceOfElementLocated((By) hp.aboutTVOLink));
		hp.workAtTVOClick();
		test.log(LogStatus.INFO, "Work At TVO link clicked. TVOKids Navigation Test completed");
		app_logs.info("Work At TVO link clicked");
		app_logs.info("TVOKids navigation test completed");
	}
}
