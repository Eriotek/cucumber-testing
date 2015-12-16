package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by student02 on 16.12.15.
 */
public class AddItemPageLocators {

    @FindBy(how = How.ID, using = "itemType")
    public WebElement itemType;

    @FindBy(how = How.ID, using = "amount")
    public WebElement amount;

    @FindBy(how = How.XPATH, using = "html/body/form/table/tbody/tr[3]/td/button")
    public WebElement button;
}
