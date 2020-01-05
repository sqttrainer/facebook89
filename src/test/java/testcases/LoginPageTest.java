package testcases;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;

public class LoginPageTest {
	
	
	@Test
	public void loginTest()
	{
		
		LoginPage loginPage = new LoginPage();
		loginPage.doLogin("yoursqttrainer@gmail.com", "Passwordf_2");
		HomePage homePage = new HomePage();
		homePage.navigateToProfilePage();
		ProfilePage profilePage = new ProfilePage();
		profilePage.addProfilePic();
		
	}

}
