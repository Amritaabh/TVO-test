package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends BaseClass {
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
