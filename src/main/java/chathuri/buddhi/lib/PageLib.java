package chathuri.buddhi.lib;

import org.openqa.selenium.WebDriver;

import chathuri.buddhi.pages.HomePage;

public class PageLib {
	private WebDriver driver;
	private HomePage homePage;
	
	public PageLib(WebDriver driver) {
		this.driver = driver;
		homePage = new HomePage(this.driver);
	}
	
	public HomePage HomePage() {
		return homePage;
	}
}
