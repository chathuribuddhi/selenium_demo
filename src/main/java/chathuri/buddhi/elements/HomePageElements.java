package chathuri.buddhi.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements {
	WebDriver driver;
	
	@FindBy(xpath = "//input[@type=\"submit\"]") public WebElement searchBtn;
	@FindBy(xpath = "//a[@id=\"gh-la\"]") public WebElement logo;
	@FindBy(xpath = "//div[@id=\"mainContent\"]/div[1]/ul/li[3]/a") public WebElement electronicTb;
	@FindBy(xpath = "//a[text()=\"Cell Phones & Accessories\"]") public WebElement cellPhonesAndAccessories;
	
	public HomePageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
