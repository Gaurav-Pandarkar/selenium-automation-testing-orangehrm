package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
	WebElement add;
	
	public AdminAdd addAdmin () {
		add.click();
		return new AdminAdd();
		
	}
}
