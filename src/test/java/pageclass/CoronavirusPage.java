package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		WebDriverWait wait= new WebDriverWait(driver , 20);
		wait.until(ExpectedConditions.elementToBeClickable(coronaImg));
		coronaImg.click();
		
	}

}

