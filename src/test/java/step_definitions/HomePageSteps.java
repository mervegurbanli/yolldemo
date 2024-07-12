package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.WaitHelper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.util.Properties;

public class HomePageSteps {
Properties config = new Properties();
    HomePage homePage = new HomePage();


    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("QAFOX_URL"));
        Driver.getDriver().manage().window().maximize();
//  Driver.getDriver().get("https://tutorialsninja.com/demo/index.php?route=common/home");
    }

    @When("the user clicks on the {string} drop menu")
    public void the_user_clicks_on_the_drop_menu(String string) {
       //  WaitHelper.waitForElementToBeClickable(homePage.myAccountDropMenu, 10);

        homePage.myAccountDropMenu.click();
    }

    @When("the user clicks on the {string} option")
    public void the_user_clicks_on_the_option(String string) {
       // WaitHelper.waitForElementToBeClickable(homePage.registerOption, 10);

        homePage.registerOption.click();
    }
}
