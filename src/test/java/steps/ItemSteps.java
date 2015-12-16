package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.actions.AddItemPageActions;
import pages.actions.HomePageActions;
import pages.actions.ItemsListActions;

/**
 * Created by student02 on 16.12.15.
 */
public class ItemSteps {

    private LoginSteps loginSteps;
    private AddItemPageActions addItemPageActions;
    private HomePageActions homePageActions;
    private ItemsListActions itemsListActions;

    public ItemSteps() {
        this.loginSteps = new LoginSteps();
        this.addItemPageActions = new AddItemPageActions();
        this.homePageActions = new HomePageActions();
        this.itemsListActions = new ItemsListActions();
    }

    @When("^I add correct type and amount$")
    public void iAddCorrectTypeAndAmount() throws Throwable {

        addItemPageActions.addItem("Scenariusz","");

    }

    @Then("^Item should be added$")
    public void itemShouldBeAdded() throws Throwable {

        Assert.assertTrue(itemsListActions.isLastItem("Scenariusz"));

    }


    @Given("^I am on add item page$")
    public void iAmOnAddItemPage() throws Throwable {
        loginSteps.I_am_on_login_page();
        loginSteps.I_enter_correct_credentials();
        homePageActions.goToAddItems();

    }
}
