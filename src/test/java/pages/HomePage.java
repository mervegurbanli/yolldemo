package pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    private static final Logger LOGGER = LogManager.getLogger(HomePage.class);
    public HomePage(){
        //PageFactory.initElements(Driver.getInstance().getDriver(), this);
        LOGGER.info("OhrmHomePage is initialized.");
    }
    @FindBy(xpath = "//a[text()=\"My Account\"]")
    public WebElement myAccountDropMenu;

    @FindBy(partialLinkText = "register")
    public WebElement registerOption;

    @FindBy(id  = "input-firstname")
    public WebElement firstName;

    @FindBy(id = "menu_admin_UserManagement")
    public WebElement userManagementSubTab;


}