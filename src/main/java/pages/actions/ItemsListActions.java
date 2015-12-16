package pages.actions;


import org.openqa.selenium.support.PageFactory;
import pages.locators.ItemsListPageLocators;
import utils.SeleniumDriver;

/**
 * Created by student02 on 16.12.15.
 */
public class ItemsListActions {

    private ItemsListPageLocators locators;

    public ItemsListActions() {
        locators = new ItemsListPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public boolean isLastItem(String lastItem) {

        if (locators.lastItem.getText().equals(lastItem)) {
            return true;
        }

        return false;
    }
}
