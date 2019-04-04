package tests;

import java.io.IOException;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import setup.Setup;

public class AddIMacToCart extends Setup{

	@Test(groups = { "smoke" })
	public static void verifyAddItemToCart() throws IOException, InterruptedException {
		HomePage.navigateToSite();		
		HomePage.addMacMachineToCart();
		ProductPage.addMacToWhishlist();
	}
}
