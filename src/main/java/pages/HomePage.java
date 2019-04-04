package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import utils.CommonUtils;

public class HomePage {

	@FindBy(xpath = "//img[@class='img-responsive']")
	static WebElement imageToVerify;
	
	@FindBy(xpath="//button/span[@id='cart-total']")
	static WebElement cartItemCountButton;
	
	@FindBy(xpath="//p[text()='Your shopping cart is empty!']")
	static WebElement emptyCartMessage;
	
	@FindBy(xpath="//a[text()='Desktops']")
	static WebElement desktopItemsLink;
	
	@FindBy(xpath="//a[text()='Mac (1)']")
	static WebElement macItems;
	
	@FindBy(xpath="//img[@title='iMac']")
	static WebElement iMacImage;
	
	@FindBy(xpath="//a[text()='Components']")
	static WebElement componentsLink;
	
	@FindBy(xpath="//div[@id='content']//h2[text()='Mac']")
	static WebElement macProductVerifyElement;
	
	@FindBy(xpath="//img[@title='iMac']")
	static WebElement macImage;
	
	public static void navigateToSite() {
		Assert.assertTrue(imageToVerify.isDisplayed());
	}
	
	public static void checksEmptyCart() {
		Assert.assertTrue(cartItemCountButton.isDisplayed());
		Reporter.log("Button visible", true);
		cartItemCountButton.click();
		Reporter.log("Clicked on cart button ", true);
		Assert.assertEquals(emptyCartMessage.getText(), "Your shopping cart is empty!" );
		Reporter.log("Verified cart is empty", true);
	}
	
	public static void addMacMachineToCart() {
		Assert.assertTrue(desktopItemsLink.isDisplayed());
		CommonUtils.mouseHover(desktopItemsLink);
		Reporter.log("Hovered over components",true);
		Assert.assertTrue(macItems.isDisplayed());
		macItems.click();
		Reporter.log("Clicked on mac items element",true);
		CommonUtils.waitForElementToBeVisible(macProductVerifyElement);
		Reporter.log("Mac item displayed");
		Assert.assertTrue(macImage.isDisplayed());
		macImage.click();
		Reporter.log("Clicked on mac image to navigate to product page");
	}
	
	public static void addMonitorToCart() {
		Assert.assertTrue(desktopItemsLink.isDisplayed());
		CommonUtils.mouseHover(componentsLink);
		Reporter.log("Hovered over components",true);
		Assert.assertTrue(macItems.isDisplayed());
		macItems.click();
		Reporter.log("Clicked on mac items element",true);
	}
}
