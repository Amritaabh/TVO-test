package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class TVOPreschoolPage extends BasePage {

	public TVOPreschoolPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[@href='/preschool/games']")
	public WebElement preschoolGames ;
	
	public void preschoolGamesClick() {
		preschoolGames.click();
		
	}

}
