package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.util.Properties;

public class HomePageSteps {
Properties config = new Properties();
    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("QAFOX_URL"));
//  Driver.getDriver().get("https://tutorialsninja.com/demo/index.php?route=common/home");
    }

    @When("the user clicks on the {string} drop menu")
    public void the_user_clicks_on_the_drop_menu(String string) {

    }
}
