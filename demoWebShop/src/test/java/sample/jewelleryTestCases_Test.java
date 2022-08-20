package sample;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.jewllery;

public class jewelleryTestCases_Test extends BaseClass {
	@Test
	public void jewelleryDiscription() {
		jewllery ring = new jewllery(driver);
		ring.getJewlleryProductClick().click();
		ring.getRingclick().click();
		ring.getEmailfriendclick().click();
		ring.getFriendmailId().click();
		ring.getSendmailClick().click();

	}

}
