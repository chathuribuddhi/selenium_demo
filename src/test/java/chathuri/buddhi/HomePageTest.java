package chathuri.buddhi;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {

	@Test
	public void SearchAllCategories() {
		App().Flow().NavigateToUrl("https://www.ebay.com/");
		App().pageLib().HomePage().ClickSearchButton();
		String allCatUrl = App().Flow().GetCurrentUrl();
		AssertJUnit.assertEquals("https://www.ebay.com/n/all-categories", allCatUrl, "Pass");

	}

	@Test(dataProvider = "dp", dataProviderClass = DP.class)
	public void SearchBarTest(String d1, String d2) {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		App().Flow().NavigateToUrl("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[@placeholder=\"Search for anything\"]")).sendKeys(d1);
		List<WebElement> catList = driver
				.findElements(By.xpath("//select[@aria-label=\"Select a category for search\"]/option"));
		if (d2 == "All") {
			catList.get(0).click();
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		}else {
			for (WebElement cat : catList) {

				if (d2.toLowerCase().contains(cat.getText().toLowerCase())) {
					cat.click();
					driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
				}
			}
		}
		
		
	}

	@Test
	public void SearchLogo() {
		App().Flow().NavigateToUrl("https://www.ebay.com/");
		App().pageLib().HomePage().ClickLogo();
		String homeUrl = App().Flow().GetCurrentUrl();
		AssertJUnit.assertEquals("https://www.ebay.com/", homeUrl, "Pass");

	}
}
