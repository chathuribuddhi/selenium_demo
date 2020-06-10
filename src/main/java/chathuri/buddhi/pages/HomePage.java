package chathuri.buddhi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import chathuri.buddhi.elements.HomePageElements;

public class HomePage {
	WebDriver driver;
	HomePageElements homePageElements;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		homePageElements = new HomePageElements(driver);
	}

	// To Click the Search Button
	public void ClickSearchButton() {
		homePageElements.searchBtn.click();
	}

	// To Click the Logo
	public void ClickLogo() {
		homePageElements.logo.click();
	}

	// Mouse Hover to Menu Bar
	public void MouseHoverMenuBar() {
		Actions action = new Actions(driver);
		WebElement client = homePageElements.electronicTb;
		action.moveToElement(client).perform();
	}
	
	// Click on CellPhones
		public void ClickOnCellPhones() {
			homePageElements.cellPhonesAndAccessories.click();
		}

}
