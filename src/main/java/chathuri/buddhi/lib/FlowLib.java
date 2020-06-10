package chathuri.buddhi.lib;

import org.openqa.selenium.WebDriver;

public class FlowLib {
	private WebDriver driver;
	
	public FlowLib(WebDriver driver) {
		this.driver = driver;
	}
	
	public void NavigateToUrl(String url) {
		driver.get(url);
	}
	
	public String GetCurrentUrl() {
		return driver.getCurrentUrl();
		
	}
	
}
