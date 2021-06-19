package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import utilities.ExtentReportsGenerator;

public class BaseClass {
	public static Properties config = new Properties();
	public static WebDriver driver = null;
	public ExtentReports rep = ExtentReportsGenerator.getInstance();
	public static ExtentTest test;
	public static Logger app_logs = Logger.getLogger("qaLogger");
	
	@BeforeSuite()
	public static void init() throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
				config.load(fis);
				app_logs.debug("loading the config property file");
				
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amrita\\eclipse-workspace\\TVOHybridFramework\\src\\test\\resources\\browserdriver\\chromedriver.exe");
	
	driver= new ChromeDriver();
	app_logs.debug("chrome browser launched");
	driver.get(config.getProperty("testsiteURL"));
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
	@AfterSuite()
	public static void closeBrowser() {
		driver.quit();
	}
}
