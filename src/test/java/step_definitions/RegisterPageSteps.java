package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;
import utilities.WaitHelper;

import java.util.List;
import java.util.Map;

public class RegisterPageSteps {


    RegisterPage registerPage = new RegisterPage();

    @When("the user enters the following details into the mandatory fields:")
    public void the_user_enters_the_following_details_into_the_mandatory_fields(Map<String, String> dataTable) {

        registerPage.firstNameField.sendKeys(dataTable.get("First Name"));
        registerPage.lastNameField.sendKeys(dataTable.get("Last Name"));
        registerPage.emailField.sendKeys(dataTable.get("E-Mail"));
        registerPage.telephoneField.sendKeys(dataTable.get("Telephone"));
        registerPage.passwordField.sendKeys(dataTable.get("Password"));
        registerPage.confirmPasswordField.sendKeys(dataTable.get("Password Confirm"));
        registerPage.concentCheckbox.click();
        WaitHelper.wait(5);

    }

    @When("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String string) {

    }

    @Then("the user should see the {string} page")
    public void the_user_should_see_the_page(String string) {

    }

    @When("the user clicks on the {string} button on the {string} page")
    public void the_user_clicks_on_the_button_on_the_page(String string, String string2) {

    }

    @Then("the user should be redirected to the homepage \\(or relevant page post registration)")
    public void the_user_should_be_redirected_to_the_homepage_or_relevant_page_post_registration() {

    }

}
