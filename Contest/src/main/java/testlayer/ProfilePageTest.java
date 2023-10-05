package testlayer;

import org.testng.annotations.Test;

import pagelayer.ProfilePage;
import testbase.TestBase;

public class ProfilePageTest extends TestBase {
  @Test
  public void clickmethod() {
	  ProfilePage profile_obj= new ProfilePage(driver);
	  profile_obj.clickOnVoteForPalavit();
  }
}
