
package tests;
import java.io.IOException;

import org.testng.annotations.Test;

import pages.HomePage;
import setup.Setup;

public class AddMonitorToCart extends Setup {

	@Test(groups = { "smoke" })
	public static void verifyEmptyCart() throws IOException, InterruptedException {
		HomePage.navigateToSite();
		HomePage.checksEmptyCart();			
	}
}
