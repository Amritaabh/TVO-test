package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasePage;

public class TVOKidsPage extends BasePage {

	public TVOKidsPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//span[contains(text(),'Preschool')]")
	public WebElement preSchoolLink;
	
	public void preSchoolLinkClick() {
		WebDriverWait wait= new WebDriverWait(driver , 20);
		wait.until(ExpectedConditions.elementToBeClickable(preSchoolLink));
		preSchoolLink.click();
	}

}
