package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class CoronavirusPage extends BasePage {
	public CoronavirusPage(WebDriver driver) {
		super(driver);
		}
	
	
	
	@FindBy(xpath="//img[@alt='blue modelling of the coronavirus']")
	public WebElement coronaImg;
	
	public void coronaImgDisplayed() {
		coronaImg.isDisplayed();
	}
	public void coronaImgClick() {
		coronaImg.click();
	}

}

