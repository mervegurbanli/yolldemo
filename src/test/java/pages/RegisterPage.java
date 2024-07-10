package pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegisterPage {
    private static final Logger LOGGER = LogManager.getLogger(RegisterPage.class);
    public RegisterPage(){
      //  PageFactory.initElements(Driver.getInstance().getDriver(), this);
        LOGGER.info("OhrmHomePage is initialized.");
    }

    @FindBy(id  = "input-firstname")
    public WebElement firstNameField;
    @FindBy(id = "input-lastname")
    public WebElement lastNameField;

    @FindBy(id = "input-email")
    public WebElement emailField;

    @FindBy(id = "input-telephone")
    public WebElement telephoneField;

    @FindBy(id = "input-password")
    public WebElement passwordField;

    @FindBy(id = "input-confirm")
    public WebElement confirmPasswordField;

    @FindBy(css = "[name = 'agree']")
    public WebElement concentCheckbox;

    @FindBy(css = "[value = 'Continue']")
    public WebElement continueButton;






}
