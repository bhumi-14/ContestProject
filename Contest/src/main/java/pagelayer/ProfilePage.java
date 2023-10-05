package pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	
	public ProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
 @FindBy(xpath="//span[@class=\"text\"]") private WebElement voteForPalavit;

 public void clickOnVoteForPalavit() {
	 //voteForPalavit.click();
 }
 
}
