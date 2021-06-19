package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseClass;

public class Utilities extends BaseClass{

	public static String screenshotName;

	public static void captureScreenshot() throws IOException {
		String screenshotName = "TVOautomation" + getRandomString(6) +".png";
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(scrFile, new File("C:\\Users\\Amrita\\eclipse-workspace\\TVO\\src\\test\\resources\\screenshots" + fileName));
		try {
			FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+ "\\target\\surefire-reports\\html\\" + screenshotName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for (int i = 0; i < length; i++) {
			int index = (int) (Math.random() * characters.length());
			sb.append(characters.charAt(index));
		}
		return sb.toString();
}
}
