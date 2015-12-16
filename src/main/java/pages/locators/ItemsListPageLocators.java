package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by student02 on 16.12.15.
 */
public class ItemsListPageLocators {

    @FindBy(how = How.CSS, using = "html body table tbody tr:last-child td:nth-child(3)")
    public WebElement lastItem;
}
