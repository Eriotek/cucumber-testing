package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.AddItemPageLocators;
import utils.SeleniumDriver;

/**
 * Created by student02 on 16.12.15.
 */
public class AddItemPageActions {

    private AddItemPageLocators locators;

    public AddItemPageActions() {
        locators = new AddItemPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void addItem(String itemType, String amount) {
        locators.amount.sendKeys(amount);
        locators.itemType.sendKeys(itemType);
        locators.button.click();

    }

}
