package chathuri.buddhi.lib;

import org.openqa.selenium.WebDriver;

public class AppLib {
	private WebDriver driver;
	private PageLib pageLib;
	private FlowLib flow;
	
	public AppLib(WebDriver driver) {
		this.driver = driver;
		pageLib = new PageLib(this.driver);
		flow = new FlowLib(this.driver);
	}
	
	public PageLib pageLib() {
		return pageLib;
	}
	
	public FlowLib Flow() {
		return flow;
	}
}
