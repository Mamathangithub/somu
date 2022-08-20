package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Apperal {
	public Apperal(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement Apparel;
	
	@FindBy(partialLinkText = "button-2 product-box-add-to-cart-button")
	private WebElement Bag;
	
    @FindBy(xpath = "")
	private WebElement Cart;
    
    @FindBy(name = "continueshopping")
    private WebElement Shopping;
    
	

}
