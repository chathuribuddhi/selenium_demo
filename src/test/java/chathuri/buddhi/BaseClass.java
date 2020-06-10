package chathuri.buddhi;

import chathuri.buddhi.lib.AppLib;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass extends DP{
	WebDriver driver;
	private AppLib app;

	@Parameters({"browser", "driverexe"})
	@BeforeMethod(alwaysRun = true)
	public void SetUp(@Optional("Chrome") String browser , @Optional("C:\\Users\\CHATHURIBUDDHI\\eclipse-workspace\\chromedriver.exe") String driverexe ) {
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", driverexe);
			driver = new ChromeDriver();
		}
		
		app = new AppLib(driver);
	}

	@AfterMethod
	public void TearDown() {
		driver.close();
		driver.quit();
	}

	public AppLib App() {
		return app;
	}

}
