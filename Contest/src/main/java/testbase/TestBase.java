package testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import pagelayer.ProfilePage;


public class TestBase {
	public static  WebDriver driver;
	public ProfilePage profile_obj;
	@Parameters("browsername")
	@BeforeMethod
	public void setup(String browsername) throws InterruptedException {
		if (browsername.equalsIgnoreCase("chrome"))
		{ System.setProperty("webdriver.chrome.driver","C:\\Users\\bhuwa\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver=new ChromeDriver();
		} else if(browsername.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		} else{
			System.out.println("provide correct browsername");

		}
		driver.get("https://mycutebaby.in/contest/participant/65199d54a6ce7?utm_medium=l_10_23");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		//obj creation
		ProfilePage profile_obj= new ProfilePage(driver);
		
	}
	
	
	
	@AfterMethod
	public void shutdown() {
	//	driver.quit();

	}
	
}
