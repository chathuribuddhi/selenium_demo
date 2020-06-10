package chathuri.buddhi;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

public class MenuBarTest extends BaseClass {

	@Test
	public void SearchMenuBar() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		App().pageLib().HomePage().MouseHoverMenuBar();
		App().pageLib().HomePage().ClickOnCellPhones();
		String cellPhonesUrl = App().Flow().GetCurrentUrl();
		Assert.assertEquals("https://www.ebay.com/b/Cell-Phones-Smart-Watches-Accessories/15032/bn_1865441",
				cellPhonesUrl, "Pass");
	}

}
