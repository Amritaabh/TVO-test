package pageclass;

import java.util.List;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
		}

	@FindBy(xpath="//img[@alt='NEW!']")
	public WebElement imgNew;
	
	public void imgDisplayed() {
		imgNew.isDisplayed();
	}
	
	@FindBy(id="block-homepageadspacesecondary")
	public WebElement locSecBlock;
	
	public  void imgLocation() {
		Point loc= locSecBlock.getLocation();
		System.out.println("The location of the image in the secondary block of the home page is: " +loc);
	}
	
	@FindBy(linkText="Coronavirus")
	public WebElement coronaLink;
	
	public void clickCoronaLink() {
		coronaLink.click();
	}
	
	@FindBy(xpath="//a[@href='/current-affairs/tag/eastern']")
	public WebElement eHubs;
	
	public void clickEHubs() {
		eHubs.click();
		
	}
	@FindBy(linkText="TVOkids")
	public WebElement kidsLink;
	
	public void kidsLinkClick() {
		kidsLink.click();
	}
	
	@FindBy(xpath="//a[@href='/about']")
	public WebElement aboutLink;
	
	public void aboutLinkClick() {
		aboutLink.click();
	}
	@FindBy(xpath="//a[@data-tvo-navigation-parent-1= 'About-TVO'][@data-tvo-navigation-menu= 'main']")
	public List<WebElement> aboutTVOLink;
	
	
	
	public void workAtTVOClick() throws InterruptedException{
		int size= aboutTVOLink.size();
		System.out.println(size);
		for(int i=0;i<size;i++) 
		{
			if(aboutTVOLink.get(i).getText().contains("Work at TVO")) {
				
				aboutTVOLink.get(i).click();
	}
		}
	
	}
}
