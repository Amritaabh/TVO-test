package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class EasternHubPage extends BasePage {
	public EasternHubPage(WebDriver driver) {
		super(driver);
}
	@FindBy(xpath="//a[@href='/current-affairs/tag/northeastern']")
	public WebElement neHubs;
	
	public void NEHubsClick() {
		neHubs.click();
	}
}
